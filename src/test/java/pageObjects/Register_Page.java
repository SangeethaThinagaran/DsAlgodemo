package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	WebDriver driver;

	@FindBy(xpath ="//a[text()=' Register ']")
	WebElement homepage_register_button;
	
	@FindBy(xpath ="//input[@id='id_username']")
	WebElement username;
	
	@FindBy(xpath ="//input[@id='id_password1']")
	WebElement password;
	
	@FindBy(xpath ="//input[@id='id_password']")
	WebElement sign_in_password;
	
	
	@FindBy(xpath ="//input[@id='id_password2']")
	WebElement confirm_password;
	
	@FindBy(xpath ="//input[@value='Register']")
	WebElement register_button;
	
	public void homepage_register_button() {
		homepage_register_button.click();
	}
	
	public void username(String un) {
		username.sendKeys(un);
	}

	public void password(String pwd) {
		password.sendKeys(pwd);
		
	}
	
	public void sign_in_password(String un) {
		sign_in_password.sendKeys(un);
	}

	public void confirm_password(String con_password) {
		confirm_password.sendKeys(con_password);
	}
	
	public void register_button() {
		register_button.click();
	}
	public Register_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
