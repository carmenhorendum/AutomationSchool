import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		WebElement element = driver.findElement(By.className("nav-item-icon"));
		element.click();
		element = driver.findElement(By.className("data-login-PG-btn"));
		element.click();
		assertEquals(driver.getTitle(), "Positive Grid");
	}

	@Test(description = "Enters valid login data", dependsOnMethods = "openSignInPage")
	public void loginAsAdmin() {
		WebElement element = driver.findElement(By.id("inputEmail"));
		element.sendKeys ("");
		element = driver.findElement(By.name("password"));
		element.sendKeys("");
		element.submit();
		assertEquals(driver.getTitle(), "Positive Grid");
	}

	@Test(description = "Navigates to the store page", dependsOnMethods = "loginAsAdmin")
	public void navigateStore() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[1]/a[2]"));
//		WebElement element = driver.findElement(By.className("nav-item-text"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		element.click();
//		driver.get("https://www.positivegrid.com/plugins/");
		assertEquals(driver.getTitle(), "Online Store - Desktop Plugins Software - Positive Grid");
	}

	@Test(description = "Adds product to cart", dependsOnMethods = "navigateStore")
	public void addProductToCart() {
		WebElement element = driver.findElement(By.cssSelector("#product-action-btn-container > input:nth-child(6)"));
		element.click();
		assertEquals(driver.getTitle(), "Positive Grid - Shopping Cart");
	}

	@Test(description = "Verifies product in cart", dependsOnMethods = "addProductToCart")
	public void verifyProductInCart() {
		WebElement element = driver.findElement(By.className("cart_item_name"));
		assertEquals(element.getText(), "BIAS AMP 2 Std");
	}
}
