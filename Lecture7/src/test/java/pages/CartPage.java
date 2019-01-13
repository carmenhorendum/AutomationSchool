package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends Page {

	@FindBy(css = Locator.CART_ITEM)
	private WebElement cartItem;

	public CartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		getWait(driver, 5)
				.until(ExpectedConditions.visibilityOf(cartItem));
	}

	public String getProductAttributeValue(String attribute) {
		return cartItem.getAttribute(attribute);
	}
}
