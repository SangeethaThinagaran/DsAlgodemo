
package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;
import utilities.ConfigFileReader;

public class LoginPage {
  
	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	
	boolean isRequired ;
	
	//Locators
			  
				//Sign in link
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	WebElement signIn;
	           //Form Element
	@FindBy(id="id_username")
	WebElement usernameLogin;
	@FindBy(id="id_password")
	WebElement passwordLogin;
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	@FindBy(xpath="//*[contains(text(),'You are logged')]")
	WebElement successTextOfLogin;	
	@FindBy(xpath="//*[contains(text(),'Invalid Username and Password')]")
	WebElement failureTextOfLogin;
	@FindBy(xpath="//a[normalize-space()='Register!']")
	WebElement clickRegisterLink;
	
	
			//Invalid Scenario
	@FindBy(xpath="//div[@role='alert']")
	WebElement invalidOutput;
	
			//Logo
	
	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement numpyLogo;
	
	//Action Methods
	
	public void setSignIn()
	{
		signIn.click();
	}
	
	public boolean setUsernameLogin(String loginUsername)
	{
		usernameLogin.sendKeys(loginUsername);
		if (loginUsername.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean)js_user.executeScript("return arguments[0].required;",usernameLogin);
			return isRequired;
		}

		return isRequired;	
	}

	public String setUsernameMsgAttribute() {
		return usernameLogin.getAttribute("validationMessage");
	}
	
	public boolean setPasswordLogin(String loginPassword)
	{
		passwordLogin.sendKeys(loginPassword);
		if (loginPassword.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean)js_password.executeScript("return arguments[0].required;",passwordLogin);
			return isRequired;
		}

		return isRequired;
			
	}
	public String setPasswordMsgAttribute() {
		
		return passwordLogin.getAttribute("validationMessage");
	}
	
	public void loginbtnClick()
	{
		loginbtn.click();
	}
	
	public String setLoginExpectedOutPut() {
		return successTextOfLogin.getText();     //"You are logged in"
		
	}
	public String setMismatchExpOutput() {
		return failureTextOfLogin.getText();	//Invalid Username and Password
	}
	public void clickRegisterLink() {
		clickRegisterLink.click();
	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
}



//public void numpyLogo() {
//numpyLogo.click();
//}
//
//public void invalidUsername(String usernameInvalid) {
//usernameLogin.clear();
//usernameLogin.sendKeys(usernameInvalid);
//
//}
//public void invalidPassword(String passwordInvalid) {
//password.clear();
//password.sendKeys(passwordInvalid);
//
//}

//public String errorMessage() {
//
//return invalidOutput.getText();
//}