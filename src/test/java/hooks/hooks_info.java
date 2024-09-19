package hooks;

import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks_info {
	
	WebDriver driver=WebDriverManager.getDriver();
	
	//launch the Browser
	@Before
	public void launchBrowser() {
		driver=WebDriverManager.initiateBrowser("CHROME");
		driver.get("https://dsportalapp.herokuapp.com/home");
		}
	
	//close the Browser
//	@After
//	public void quitBrowser() {
//		WebDriverManager.closeBrowser();
//	}
}
