package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Page_Sign_Out_Page {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Login ']")
	WebElement login;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement sign_in_page_login;
	
	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement sign_in;
	
	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement numpy_logo;
	

	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement sign_out;

	public void login() {
		login.click();
	}

	
	public void sign_in_page_login() {
		sign_in_page_login.click();
	}
	
	public void sign_in() {
		sign_in.click();
	}
	
	public void numpy_logo() {
		numpy_logo.click();
	}

	public void sign_out() {
		sign_out.click();
	}

	public Sign_In_Page_Sign_Out_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
