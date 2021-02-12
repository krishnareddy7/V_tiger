package vtiger_crm_pomclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTestcls  implements Constants  {

	public static WebDriver driver;

	@Test
	public void openBrowser() {
		if (Browser.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		driver.get(URL);
	}

	public void Close() {
		driver.quit();
	}

}
