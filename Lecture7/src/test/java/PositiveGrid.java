import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.SignInPage;
import pages.StorePage;

import static org.testng.Assert.assertEquals;

public class PositiveGrid extends BaseTest {

	private final String BASE_URL = "https://www.positivegrid.com/";
	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	private WebDriver driver;

	@BeforeSuite(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
		driver.get(BASE_URL);
	}

	@AfterSuite(alwaysRun = true)
	public void wrapUp() {
		driver.quit();
	}

	@Test
	public void verifyProductInCart() {
		HomePage homePage = new HomePage(driver);
		SignInPage signInPage = homePage.clickSignInButton();
		homePage = signInPage.signIn(USERNAME, PASSWORD);
		StorePage storePage = homePage.openStore();
		CartPage cartPage = storePage.addProductToCart();
		assertEquals(cartPage.getProductAttributeValue("data-product-id"), "193");
	}
}
