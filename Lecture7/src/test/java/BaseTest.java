import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	@BeforeSuite(alwaysRun = true)
	public void setupBeforeSuite(ITestContext context) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/chromedriver.exe");
	}
}
