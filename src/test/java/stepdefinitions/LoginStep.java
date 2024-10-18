
package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.IndexPage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
import utilities.LoggerLoad;


	public class LoginStep {
		
		WebDriver driver = WebdriverManager.getDriver();
		ConfigFileReader configFileReader = WebdriverManager.configReader();
		RegisterPage rp = new RegisterPage();
		IndexPage ip = new IndexPage();
		LoginPage lp = new LoginPage();
		
		ExcelFileReader reader = new ExcelFileReader();
		String excelFilePath= "./src/test/resources/Excel/userData.xlsx";
		
		String username,password;
		String expectedOutput,invalidExpectedOutput;
		String unameValidateMsg,pwdValidateMsg;
		int tempRowLogin;
		int rowNumber;
		
		@Given("The User is on the login page")
		
		public void the_user_navigates_to_the_login_page() {
			
			 ip.getStarted();
			 lp.setSignIn();
		}
	
		@When("The User enters the valid username and password {string}")
		public void the_user_enters_the_valid_username_and_password(String LoginCredentials) throws EncryptedDocumentException, IOException{
			List <Map <String, String>> loginUserData = reader.getData(excelFilePath,LoginCredentials);
			System.out.println("Size of loginUserData: " + loginUserData);
		//	 LoggerLoad.info("Size of userData: " + loginUserData.size());
			  username=loginUserData.get(0).get("username");
			  password= loginUserData.get(0).get("password");		 
			  expectedOutput=loginUserData.get(0).get("Expected Message");
			  if(username != null || password != null)
			   {
				   lp.setUsernameLogin(username);
				   lp.setPasswordLogin(password);	   
				   lp.loginbtnClick();
			   }
			   else {
				   LoggerLoad.warn("Invalid data in sheet for username or password");
			   }
	
			 }


		@Then("The User get navigated to home page and successfully logged in")
		public void the_user_get_navigated_to_home_page_and_successfully_logged_in() {
		   
			String actualMessage=lp.setLoginExpectedOutPut();
			Assert.assertEquals(actualMessage,expectedOutput);
			LoggerLoad.info("New Account Created. You are logged in as " + username);
		}

		//--------------------- @LoginInvalidCredentials @LoginTC_002-------------------
		@When("The User enters the username {string} password {int} and clicks on login button")
		public void the_user_enters_the_username_password_and_clicks_on_login_button(String sheetName, int rowNumber)throws EncryptedDocumentException, IOException {
		    
			List <Map <String, String>> loginUserData = reader.getData(excelFilePath,sheetName);
			System.out.println("Size of userData: " + loginUserData);
			
			 username= loginUserData.get(rowNumber).get("username");
			 password= loginUserData.get(rowNumber).get("password");
			 invalidExpectedOutput=loginUserData.get(rowNumber).get("Expected Message");
		
			 unameValidateMsg= lp.setUsernameMsgAttribute();
			 pwdValidateMsg= lp.setPasswordMsgAttribute();
			 
			 System.out.println("rownumber:"+ rowNumber);
			 
			 if(rowNumber==5) {
				 tempRowLogin=rowNumber+1;
				 System.out.println("TESTING tempRow : "+tempRowLogin);
			 }
		
			 if(username != null || password != null) 
				{
				  lp.setUsernameLogin(username);
				  lp.setPasswordLogin(password);	   
				  lp.loginbtnClick();		
				
				try
					{
						Alert alert = driver.switchTo().alert();
				        String actualAlertText = alert.getText();
				        System.out.println("The alert message: " + actualAlertText);
				        Assert.assertEquals(actualAlertText ,invalidExpectedOutput);
					}
					catch(NoAlertPresentException e)
					{
				        System.out.println("No alert was present during the login process.");
				     }
				
				 }
			 
		}

		@Then("The User gets suggested to enter the valid credentials")
		public void the_user_gets_suggested_to_enter_the_valid_credentials() {
		   
			if(password.isBlank()) {
				
				Assert.assertEquals(unameValidateMsg, invalidExpectedOutput);             //Assert.assertEquals(validationMessage, "Please fill out this field");
				LoggerLoad.error("Password field are Blank- "+ invalidExpectedOutput);	
				
			}
			else if(username.isBlank()) {
				
				Assert.assertEquals(pwdValidateMsg, invalidExpectedOutput);
				LoggerLoad.error("Username field are Blank- " + invalidExpectedOutput);	
			}
			else if(username.isBlank() && password.isBlank()) {
				
				Assert.assertEquals(unameValidateMsg, invalidExpectedOutput);
				LoggerLoad.error("Username and Password field are Blank- " +invalidExpectedOutput);	
			}
			else {
				String failureMessage=lp.setMismatchExpOutput();
				Assert.assertEquals(failureMessage,invalidExpectedOutput);
				LoggerLoad.error("Invalid Username and Password.");	
			}
			
			//RegisterLink and Register Navigation
			 if(tempRowLogin>5)
				
			 { 
				 lp.clickRegisterLink();
				 System.out.println("clicked Register link");
				 LoggerLoad.info("clicked Register link");
				 driver.navigate().back();
				 LoggerLoad.info("Back to Login page");
				 lp.setSignIn();
				 System.out.println("clicked Register nav link");
				 LoggerLoad.info("We are in Register Page ,Navigate to Register page using Menubar 'Register' link");
		      }
			
			
		}
			
	    }
	
	


		
		
		
		
		
		
		
		
		
		
		
		

