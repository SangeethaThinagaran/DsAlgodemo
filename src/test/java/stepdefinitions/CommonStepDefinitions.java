package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

public class CommonStepDefinitions {


	
	
		WebDriver driver = WebdriverManager.getDriver();
		ConfigFileReader configFileReader = WebdriverManager.configReader();
		LinkedListPage lp = new LinkedListPage();
		
		@Given("the user is in homepage and logged in")
		public void the_user_is_in_homepage_and_logged_in() {
			driver.get(configFileReader.getHomeUrl());
			//LoggerLoad.info("You are in" +driver.getTitle());
			
		}
		
		@Then("the User should get navigated to the Try Editor Page")
		public void the_user_should_get_navigated_to_the_try_editor_page() {
			String tryEditorPageTitle = driver.getTitle();
		    Assert.assertEquals(tryEditorPageTitle,configFileReader.getPageTitle("tryEditor"));
		    
		}
		
		@When("the User enters a sample code as {string} in the Editor section and click Run")
		public void the_user_enters_a_sample_code_as_in_the_editor_section_and_click_run(String string) {
			System.out.println(string);
			
			lp.setCode(string);
			lp.clickRunBtn();
		    
		}

		@Then("the User should get the {string} in the screen")
		public void the_user_should_get_the_output_in_the_screen(String string) {
			
			try {
				//wait.until(ExpectedConditions.alertIsPresent())
				driver.switchTo().alert().accept();
			}
			catch(Exception e) {
				System.out.println("alert not present");
				LoggerLoad.error("alert not present in try editor");
			}
			finally {
				//driver.switchTo().alert().accept();
				System.out.println(string);
				String output = lp.getOutput();
			    Assert.assertEquals(output,string);
			}
			
		    
		}

		
		

	}

