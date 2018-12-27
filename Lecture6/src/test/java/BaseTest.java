import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	@BeforeSuite(alwaysRun = true)
	public void setupBeforeSuite(ITestContext context) {
//		String seleniumHost = context.getCurrentXmlTest().getParameter("selenium.host");
//		String seleniumPort = context.getCurrentXmlTest().getParameter("selenium.port");
//		String seleniumBrowser = context.getCurrentXmlTest().getParameter("selenium.browser");
//		String seleniumUrl = context.getCurrentXmlTest().getParameter("selenium.url");
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/chromedriver.exe");
	}
}
