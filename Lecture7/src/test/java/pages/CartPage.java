package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	private WebDriver driver;

	@FindBy(css = Locator.CART_ITEM)
	private WebElement cartItem;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		new WebDriverWait(driver, 5)
				.until(ExpectedConditions.visibilityOf(cartItem));
	}

	public String getProductAttributeValue(String attribute) {
		return cartItem.getAttribute(attribute);
	}
}
