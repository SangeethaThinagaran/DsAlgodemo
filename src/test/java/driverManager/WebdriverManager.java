package driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utilities.ConfigFileReader;

public class WebdriverManager {

	public static WebDriver driver;
	public static ConfigFileReader configFileReader;
	
	//public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
		//public static synchronized WebDriver getDriver() {
//	return tlDriver.get();	
	public static WebDriver getDriver() {
	return driver;
		}
	
	//initiate Browser
	public static WebDriver initializeDriver() {
		configFileReader =new ConfigFileReader();
		String browserName=configFileReader.getBrowser();
		if(browserName != null && browserName.equalsIgnoreCase("CHROME")) {
			driver=new ChromeDriver();
		//	tlDriver.set(new ChromeDriver());
		}
		
		else if(browserName != null && browserName.equalsIgnoreCase("EDGE")) {
			driver=new EdgeDriver();
			//tlDriver.set(new EdgeDriver());
		}
		else {
			System.out.println("Please pass the correct Browser Name");
		}
	
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return getDriver();
					
	}
	public static ConfigFileReader configReader() {
		return configFileReader;
	}
	
	//close the browser
	public static void closeDriver() {
		//driver.quit();
		getDriver().quit();
	}
	}
	

