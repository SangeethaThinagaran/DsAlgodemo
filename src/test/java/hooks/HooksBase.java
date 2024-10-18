package hooks;

	import org.openqa.selenium.WebDriver;

	import driverManager.WebdriverManager;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import utilities.ConfigFileReader;


	public class HooksBase {

		
		@Before
		public void launchBrowser() {
			WebDriver driver = WebdriverManager.initializeDriver();
			ConfigFileReader configFileReader = WebdriverManager.configReader();
				//driver.get("https://dsportalapp.herokuapp.com");
				driver.get(configFileReader.getIndexUrl());
			}

			@After
			public void quitbrowser() {
				WebdriverManager.closeDriver();

			}
		
	}

