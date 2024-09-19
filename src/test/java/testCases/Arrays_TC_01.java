//package testCases;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Arrays_TC_01 {
//
//	WebDriver driver;
//	 public void Sign() {
//		driver=new ChromeDriver();
//	    driver.get("https://dsportalapp.herokuapp.com/home");
//	    driver.manage().window().maximize();
//	    driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
//	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("DreamTeam");
//	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dre@mTe@m123");
//	    driver.findElement(By.xpath("//input[@value='Login']")).click();
//	}
//	 
//	 public void Arrayflow() throws InterruptedException {
//		 driver.findElement(By.xpath("//div[@class='card-body d-flex flex-column']/*[contains(text(),'Array')]/../a")).click();
//		 driver.findElement(By.xpath("//a[text()='Arrays in Python']")).click();
//		 driver.findElement(By.xpath("//a[text()='Try here>>>']")).click();
//		 driver.findElement(By.xpath("//div[@class='container']/div/form/div/div/div/textarea")).sendKeys("print"+"\"Hello\"");
//		 driver.findElement(By.xpath("//button[text()='Run']")).click();
//		 String output=driver.findElement(By.id("output")).getText();
//		 driver.navigate().back();
//		 driver.findElement(By.xpath("//a[text()='Practice Questions']")).click();
//		 driver.findElement(By.xpath("//a[text()='Search the array']")).click();
//		 Thread.sleep(5000);
//		//***********Practice Question-Try Editor***********************
//		 //driver.findElement(By.xpath("//div[@class='container']/div/form/div/div/div/textarea")).clear();
//		 //WebElement Editor=driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div/div[1]/textarea"));
//		// WebElement Editor=driver.findElement(By.xpath("//div[contains(@class , 'CodeMirror') and contains(@class,'cm-s-default')]//textarea"));
//		 //WebElement Editor=driver.findElement(By.xpath("//div[@class='container']/div/form/div/div/div/textarea"));
//		 //WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
//			//w1.until(ExpectedConditions.visibilityOf(Editor));
//			//Editor.clear();
//			//((JavascriptExecutor)driver).executeScript("arguments[0].value='print"+ "\"Hello\"'", inputCode);
//		 
//		 //driver.findElement(By.xpath("//button[text()='Run']")).click();
//		 driver.findElement(By.xpath("//input[@class='button']")).click();
////		 driver.findElement(By.xpath(output));
//	 } 
//		 
//		 
//	public static void main(String[] args) throws InterruptedException {
//		Arrays_TC_01 a1=new Arrays_TC_01();
//		a1.Sign();
//		a1.Arrayflow();
//		
//			}
//	
//	
//}
