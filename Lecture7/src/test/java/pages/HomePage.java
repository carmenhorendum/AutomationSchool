package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Page {

	@FindBy(className = Locator.PROFILE_ICON)
	private WebElement profileIcon;

	@FindBy(className = Locator.SIGNIN_BTN)
	private WebElement singInButton;

	@FindBy(xpath = Locator.STORE_LNK)
	private WebElement storeLnk;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		getWait(driver, 5)
				.until(ExpectedConditions.visibilityOf(storeLnk));
	}

	public SignInPage clickSignInButton() {
		profileIcon.click();
		singInButton.click();
		return new SignInPage(driver);
	}

	public StorePage openStore() {
		storeLnk.click();
		return new StorePage(driver);
	}
}
