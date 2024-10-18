//package stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import driverManager.WebdriverManager;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.IndexPage;
//import pageObjects.LoginPageOld;
//import pageObjects.RegisterPage;
//
//public class LoginStepOld {
//			
//			WebDriver driver = WebdriverManager.getDriver();
//			
//			RegisterPage rp = new RegisterPage();
//			IndexPage ip = new IndexPage();
//			LoginPageOld lp = new LoginPageOld();
//			
//			@Given("The User navigates to the login page")
//			public void the_user_navigates_to_the_login_page() {
//				ip.getStarted();
//				
//			}
//		
//			@When("The User valid credentials and clicks the login button")
//			public void the_user_valid_credentials_and_clicks_the_login_button() {
//			   lp.signIn();
//			   rp.username();
//			   rp.signInPassword();
//			   lp.loginbtn();
//			}
//			@Then("The User should be navigated to the Home page and logged in")
//			public void the_user_should_be_navigated_to_the_home_page_and_logged_in() {
//			  // rp.ValidateHomePage();
//				rp.titlepage();
//			}
//		
//			@Given("The User navigates to the Home page")
//			public void the_user_navigates_to_the_home_page() {
//			
//			   rp.titlepage();	
//			}
//			
//			@When("The User should clicks Logo NumpyNinja")
//			public void the_user_should_clicks_logo_numpy_ninja() {
//			
//			   lp.numpyLogo();
//			}
//			
//			@Then("The User should get navigated to HomePage")
//			public void the_user_should_get_navigated_to_home_page() {
//				//rp.ValidateHomePage();
//				rp.titlepage();
//			}
//		}
//
