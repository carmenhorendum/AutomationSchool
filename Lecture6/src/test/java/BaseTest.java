import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	@BeforeSuite(alwaysRun = true)
	public void setupBeforeSuite(ITestContext context) {
//		String seleniumHost = context.getCurrentXmlTest().getParameter("selenium.host");
//		String seleniumPort = context.getCurrentXmlTest().getParameter("selenium.port");
//		String seleniumBrowser = context.getCurrentXmlTest().getParameter("selenium.browser");
//		String seleniumUrl = context.getCurrentXmlTest().getParameter("selenium.url");

//		RemoteControlConfiguration rcc = new RemoteControlConfiguration();
//		rcc.setSingleWindow(true);
//		rcc.setPort(Integer.parseInt(seleniumPort));

//		try {
//			server = new SeleniumServer(false, rcc);
//			server.boot();
//		} catch (Exception e) {
//			throw new IllegalStateException("Can't start selenium server", e);
//		}

//		proc = new HttpCommandProcessor(seleniumHost, Integer.parseInt(seleniumPort),
//				seleniumBrowser, seleniumUrl);

//		selenium = new DefaultSelenium(proc);
//		selenium.start();
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/chromedriver.exe");
	}

//	@AfterSuite(alwaysRun = true)
//	public void setupAfterSuite() {
//		selenium.stop();
//		server.stop();
//	}
}
