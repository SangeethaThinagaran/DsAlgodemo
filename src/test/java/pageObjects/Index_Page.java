package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index_Page {
	WebDriver driver;

	// 1. Locating each component by using @FindBy Annotations

	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement get_started_button;
	
	public void get_started_button() {
		get_started_button.click();
	}
	public Index_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
