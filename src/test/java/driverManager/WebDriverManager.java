package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverManager {

	public static WebDriver driver;
	
	//initiate driver
	public static WebDriver getDriver() {
		return driver;
	}
	
	//initiate Browser
	public static WebDriver initiateBrowser(String browserName) {
		if(browserName != null && browserName.equalsIgnoreCase("CHROME")) {
			driver=new ChromeDriver();
		}
		
		else if(browserName != null && browserName.equalsIgnoreCase("EDGE")) {
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}
	
	//close the browser
	public static void closeBrowser() {
		driver.quit();
		}
	}
	

