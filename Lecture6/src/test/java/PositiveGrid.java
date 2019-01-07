import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveGrid extends BaseTest {

	private WebDriver driver;

	@BeforeSuite(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
	}

	@AfterSuite(alwaysRun = true)
	public void wrapUp() {
		driver.quit();
	}

	@Test(description = "Launches the PositiveGrid site")
	public void launchSite() {
		driver.get("https://www.positivegrid.com/");
		assertEquals(driver.getTitle(), "Positive Grid | Guitar technology software, amplifiers, pedals.");
	}

	@Test(description = "Navigates to the login page")
	public void openSignInPage() {
		WebElement element = driver.findElement(By.className(Locator.PROFILE_ICON));
		element.click();
		element = driver.findElement(By.className(Locator.SIGNIN_BTN));
		element.click();
		assertEquals(driver.getTitle(), "Positive Grid");
	}

	@Test(description = "Enters valid login data", dependsOnMethods = "openSignInPage")
	public void loginAsUser() {
		WebElement element = driver.findElement(By.name(Locator.USERNAME_FLD));
		element.sendKeys("");
		element = driver.findElement(By.id(Locator.PASSWORD_FLD));
		element.sendKeys("");
		element.submit();
		assertEquals(driver.getTitle(), "Positive Grid");
	}

	@Test(description = "Navigates to the store page", dependsOnMethods = "loginAsUser")
	public void navigateStore() {
		WebDriverWait wait = new WebDriverWait(driver, 18);
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(Locator.STORE_LNK)));
		element.click();
		assertEquals(driver.getTitle(), "Online Store - Desktop Plugins Software - Positive Grid");
	}

	@Test(description = "Adds product to cart", dependsOnMethods = "navigateStore")
	public void addProductToCart() {
		WebDriverWait wait = new WebDriverWait(driver, 18);
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(Locator.ADD_TO_CART_BTN)));
		element.click();
		wait.until(ExpectedConditions.titleIs("Positive Grid - Shopping Cart"));
		assertEquals(driver.getTitle(), "Positive Grid - Shopping Cart");
	}

	@Test(description = "Verifies product in cart", dependsOnMethods = "addProductToCart")
	public void verifyProductInCart() {
		WebDriverWait wait = new WebDriverWait(driver, 18);
		WebElement element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector(Locator.CART_ITEM)));
		assertEquals(element.getAttribute("data-product-id"), "193");
	}
}
