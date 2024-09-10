package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraysSteps {
	WebDriver driver;
	
	@Given("The User is on the DsAlgo Portal Home page")
	public void the_user_is_on_the_ds_algo_portal_home_page() {
	    driver=new ChromeDriver();
	    driver.get("https://dsportalapp.herokuapp.com/home");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("DreamTeam");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dre@mTe@m123");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("The User clicks Get Started button in the Array section")
	public void the_user_clicks_get_started_button_in_the_array_section() {
		 driver.findElement(By.xpath("//div[@class='card-body d-flex flex-column']/*[contains(text(),'Array')]/../a")).click();
		 System.out.println("INSIDE ARRAYS");
		 
	}

	@Then("The User should get navigated to the DsAlgo Portal Array Page")
	public void the_user_should_get_navigated_to_the_ds_algo_portal_array_page() {
		String page_title=driver.getTitle();
		System.out.println("THE PAGE***************"+page_title);
		Assert.assertEquals(page_title, "Array");
	}
}
