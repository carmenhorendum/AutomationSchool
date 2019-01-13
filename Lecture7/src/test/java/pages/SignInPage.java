package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends Page {

	@FindBy(name = Locator.USERNAME_FLD)
	private WebElement usernameFld;

	@FindBy(id = Locator.PASSWORD_FLD)
	private WebElement passwordFld;

	public SignInPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		getWait(driver, 5)
				.until(ExpectedConditions.visibilityOf(usernameFld));
	}

	public HomePage signIn(String user, String pass) {
		usernameFld.sendKeys(user);
		passwordFld.sendKeys(pass);
		passwordFld.submit();
		return new HomePage(driver);
	}
}
