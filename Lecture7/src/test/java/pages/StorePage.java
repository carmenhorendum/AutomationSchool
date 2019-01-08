package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage {
	private WebDriver driver;

	@FindBy(xpath = Locator.ADD_TO_CART_BTN)
	private WebElement addToCartBtn;

	public StorePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public CartPage addProductToCart() {
		addToCartBtn.click();
		return new CartPage(driver);
	}
}
