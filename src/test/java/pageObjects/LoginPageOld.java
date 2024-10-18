//package pageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import driverManager.WebdriverManager;
//
//public class LoginPageOld {
//
//	
//
//	  
//		WebDriver driver = WebdriverManager.getDriver();
//		
//		//Locators
//				  
//					//Sign in link
//		@FindBy(xpath="//a[normalize-space()='Sign in']")
//		WebElement signIn;
//		           //Form Element
//		@FindBy(id="id_username")
//		WebElement usernameLogin;
//		@FindBy(id="id_password")
//		WebElement password;
//		@FindBy(xpath="//input[@value='Login']")
//		WebElement loginbtn;
//		
//				//Logo
//		
//		@FindBy(xpath = "//a[text()='NumpyNinja']")
//		WebElement numpyLogo;
//		
//		//Action Methods
//		
//		public void signIn()
//		{
//			signIn.click();
//		}
//		
//		public void usernameLogin()
//		{
//			usernameLogin.sendKeys("DreamTeam");
//		}
//
//		public void password()
//		{
//			
//			password.sendKeys("Dre@mTe@m123");
//		}
//		public void loginbtn()
//		{
//			loginbtn.click();
//		}
//		
//		public void numpyLogo() {
//			numpyLogo.click();
//		}
//		
//		public LoginPageOld() {
//			PageFactory.initElements(driver, this);
//		}
//		
//	}
//
