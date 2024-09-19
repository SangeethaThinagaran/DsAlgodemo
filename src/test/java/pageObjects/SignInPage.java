package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	WebElement SignIn;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement SignInButton;

	@FindBy(xpath="//a[text()='Sign out']")
	WebElement SignOutButton;
	
	public void signIn() {
		SignIn.click();
	}
	
	public void setUserName() {
		UserName.sendKeys("DreamTeam");
	}
	
	public void setPassword() {
		Password.sendKeys("Dre@mTe@m123");
	}
	
	public void signInButton() {
		SignInButton.click();
	}
	
	public void signOutButton() {
		SignOutButton.click();
	}
}
