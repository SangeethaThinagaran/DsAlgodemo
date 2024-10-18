//package pageObjects;
//
//import java.io.IOException;
//import java.time.Duration;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import driverManager.WebdriverManager;
//import utilities.ExcelFileReader;
//import utilities.ExcelReaderFine;
//
//public class ArrayPage {
//
//WebDriver driver=WebdriverManager.getDriver();
//	
//	//Array Index page
//	@FindBy(xpath="//div[@class='alert alert-primary']")
//	WebElement Arr_IndexPage;
//	//Array Page
//	@FindBy(xpath="//div[@class='card-body d-flex flex-column']/*[contains(text(),'Array')]/../a")
//	WebElement arrGetStarted;
//	@FindBy(xpath="//a[text()='Arrays in Python']")
//	WebElement arrArrInPy;
//	@FindBy(xpath="//a[text()='Arrays Using List']")
//	WebElement arrArrUseList;
//	@FindBy(xpath="//a[text()='Basic Operations in Lists']")
//	WebElement arrBaseOperInList;
//	@FindBy(xpath="//a[text()='Applications of Array']")
//	WebElement arrAppOfArr;
//	
//
//	//ArrayPage_Links
////	@FindBy(xpath="//a[text()=' DreamTeam ']")
////	WebElement arrDreamTeam;
////	@FindBy(xpath="//a[text()='Sign out']")
////	WebElement arrSignOut;
//	@FindBy(xpath="//a[text()='Practice Questions']")
//	WebElement practiceQnsLink;
//	@FindBy(xpath="//a[text()='Search the array']")
//	WebElement pracQnsQn1;
//	@FindBy(xpath="//a[text()='Max Consecutive Ones']")
//	WebElement pracQnsQn2;
//	@FindBy(xpath="//a[text()='Find Numbers with Even Number of Digits']")
//	WebElement pracQnsQn3;
//	@FindBy(xpath="//a[text()='Squares of  a Sorted Array']")
//	WebElement pracQnsQn4;
//	@FindBy(xpath="//a[text()='Try here>>>']")
//	WebElement tryHereBtn;
//	@FindBy(xpath="//div[contains(@class,'CodeMirror') and contains(@class,'cm-s-default')]//textarea")
//	WebElement tryHereEditor;
//	@FindBy(xpath="//button[text()='Run']")
//	WebElement tryHereRun;
//	@FindBy(id="output")
//	WebElement tryHereOutput;
//	@FindBy (xpath = "//div[contains(@class , 'CodeMirror') and contains(@class,'cm-s-default')]//textarea") 
//	WebElement inputCode;
//	@FindBy (xpath = "//button") 
//	WebElement runButton;
//	@FindBy(xpath = "//*[@id='output']")
//	WebElement output;
//	@FindBy(xpath="//input[@class='button']")
//	WebElement clickSubmitBtn;
////	@FindBy(xpath="(//div[@class='input']/div/div[@class='CodeMirror-scroll']/div/div/div/div/div[@class='CodeMirror-code']/div/pre)[4]")
////	WebElement tryEditElse;
//	
//	public void Arr_IndexPage() {
//		String Arr_IndexPageTitle=Arr_IndexPage.getText();
//		System.out.println(Arr_IndexPageTitle);
//	}
//	public void arrGetStarted() {
//		arrGetStarted.click();
//	}
//	public void arrArrInPy() {
//		arrArrInPy.click();
//	}
//	public void arrArrUseList() {
//		arrArrUseList.click();
//	}
//	public void arrBaseOperInList() {
//		arrBaseOperInList.click();
//	}
//	public void arrAppOfArr() {
//		arrAppOfArr.click();
//	}
////	public void arrDreamTeam() {
////		arrDreamTeam.click();
////	}
////	public void Arr_SignOut() {
////		arrSignOut.click();
////	}
//	public void practiceQnsLink() {
//		practiceQnsLink.click();
//	}
//	public void pracQnsQn1() {
//		pracQnsQn1.click();
//	}
//	
//	public void pracQnsQn2() {
//		pracQnsQn2.click();
//	}
//	
//	public void pracQnsQn3() {
//		pracQnsQn3.click();
//	}
//	
//	public void pracQnsQn4() {
//		pracQnsQn4.click();
//	}
//	
//	public void tryHereBtn() {
//		tryHereBtn.click();
//	}
//	public void clickSubmitBtn() {
//		clickSubmitBtn.click();
//	}
//	public void tryHereEditor(String input) {
//		tryHereEditor.sendKeys(input);
//	}
//	
//		
//	public void enterCodePractice(String code) {
//		String[] str1 = code.split("\\\\n");
//		tryHereEditor.sendKeys(Keys.CONTROL+"a");
//		tryHereEditor.sendKeys(Keys.DELETE);
//		for (int i = 0; i < str1.length; i++) {
//			if (str1[i].contains("\\b")) {
////				tryHereEditor.sendKeys(Keys.BACK_SPACE);
//			} else {
//				tryHereEditor.sendKeys(str1[i]);
//				tryHereEditor.sendKeys(Keys.ENTER);
//			}
//		}
//	}
//	public void tryHereRun() {
//		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(10));
//		w1.until(ExpectedConditions.elementToBeClickable(tryHereRun));
//		tryHereRun.click();
//	}
//	public String tryHereOutput() {
//		return tryHereOutput.getText().trim();
//	}
//	
//	
//	public ArrayPage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//	}
//}




package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.WebdriverManager;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
import utilities.ExcelReaderFine;

public class ArrayPage {
	

WebDriver driver=WebdriverManager.getDriver();
ConfigFileReader configFileReader = WebdriverManager.configReader();
	
	
	//Array Index page
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement Arr_IndexPage;
	//Array Page
	@FindBy(xpath="//div[@class='card-body d-flex flex-column']/*[contains(text(),'Array')]/../a")
	WebElement arrGetStarted;
	@FindBy(xpath="//a[text()='Arrays in Python']")
	WebElement arrArrInPy;
	@FindBy(xpath="//a[text()='Arrays Using List']")
	WebElement arrArrUseList;
	@FindBy(xpath="//a[text()='Basic Operations in Lists']")
	WebElement arrBaseOperInList;
	@FindBy(xpath="//a[text()='Applications of Array']")
	WebElement arrAppOfArr;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQnsLink;
	@FindBy(xpath="//a[text()='Search the array']")
	WebElement pracQnsQn1;
	@FindBy(xpath="//a[text()='Max Consecutive Ones']")
	WebElement pracQnsQn2;
	@FindBy(xpath="//a[text()='Find Numbers with Even Number of Digits']")
	WebElement pracQnsQn3;
	@FindBy(xpath="//a[text()='Squares of  a Sorted Array']")
	WebElement pracQnsQn4;
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHereBtn;
	@FindBy(xpath="//div[contains(@class,'CodeMirror') and contains(@class,'cm-s-default')]//textarea")
	WebElement tryHereEditor;
	@FindBy(xpath="//button[text()='Run']")
	WebElement tryHereRun;
	@FindBy(id="output")
	WebElement tryHereOutput;
	@FindBy (xpath = "//div[contains(@class , 'CodeMirror') and contains(@class,'cm-s-default')]//textarea") 
	WebElement inputCode;
	@FindBy (xpath = "//button") 
	WebElement runButton;
	@FindBy(xpath = "//*[@id='output']")
	WebElement output;
	@FindBy(xpath="//input[@class='button']")
	WebElement clickSubmitBtn;
	@FindBy(xpath="(//div[@class='input']/div/div[@class='CodeMirror-scroll']/div/div/div/div/div[@class='CodeMirror-code']/div/pre)[4]")
	WebElement tryEditElse;
	 
	public void clickArrGetStartedBtn() {
		arrGetStarted.click();
	}
	public void clickArrAIPLink() {
		arrArrInPy.click();
	}
	public void clickArrAULLink() {
		arrArrUseList.click();
	}
	public void clickArrBOLLink() {
		arrBaseOperInList.click();
	}
	public void clickArrAOALink() {
		arrAppOfArr.click();
	}

	public void clickArrPracticeQnsLink() {
		practiceQnsLink.click();
	}
	public void clickArrPracQnsQn1() {
		pracQnsQn1.click();
	}
	
	public void clickArrPracQnsQn2() {
		pracQnsQn2.click();
	}
	
	public void clickArrPracQnsQn3() {
		pracQnsQn3.click();
	}
	
	public void clickArrPracQnsQn4() {
		pracQnsQn4.click();
	}
	
	public void clickArrTryHereBtn() {
		tryHereBtn.click();
	}
	public void clickSubmitBtn() {
		clickSubmitBtn.click();
	}
	public void tryHereEditor(String input) {
		tryHereEditor.sendKeys(input);
	}
	

		
	public void enterCodePractice(String code) {

		String[] str1 = code.split("\\\\n");

		tryHereEditor.sendKeys(Keys.CONTROL+"a");
		tryHereEditor.sendKeys(Keys.DELETE);
		
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].contains("\\b")) {

				tryHereEditor.sendKeys(Keys.BACK_SPACE);
			} else {
				tryHereEditor.sendKeys(str1[i]);
				tryHereEditor.sendKeys(Keys.ENTER);
				
			}
		}
		
	}
	
	public void setWaitTimeForCode() throws InterruptedException {
	String pythonCode=tryHereEditor.getText();
	
	if(pythonCode.contains("search( [12, 23, 45, 67, 6, 90] , 12")) {
	WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
	w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"search( [12, 23, 45, 67, 6, 90] , 12)"));
	}
	else if (pythonCode.contains("search( [12, 23, 45, 67, 6, 90], 25)")) {
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"search( [12, 23, 45, 67, 6, 90], 25)"));
	}
	else if(pythonCode.contains("findMaxConsecutiveOnes([1, 0, 1, 1, 0, 1])")) {
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"findMaxConsecutiveOnes([1, 0, 1, 1, 0, 1])"));
	}
	else if(pythonCode.contains("findMaxConsecutiveOnes([1,1,0,1,1,1])")) {
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"findMaxConsecutiveOnes([1,1,0,1,1,1])"));
	}
	else if(pythonCode.contains("findNumbers([12,345,2,6,7896])")) {
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"findNumbers([12,345,2,6,7896])"));
	}
	else if(pythonCode.contains("findNumbers([555,901,482,1771])")) {
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"findNumbers([555,901,482,1771])"));
	}
	else if(pythonCode.contains("sortedSquares([-7,-3,2,3,11])")) {
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"sortedSquares([-7,-3,2,3,11])"));
	}
	else if(pythonCode.contains("sortedSquares([-4,-1,0,3,10])")) {
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,"sortedSquares([-4,-1,0,3,10])"));
	}
}

	
//	public void setWaitTimeForCode() throws InterruptedException {
//		String pythonCode=tryHereEditor.getText();
//		System.out.println("INSIDE TRYEDITOR="+pythonCode);
//		
//		Thread.sleep(3000);
//		if(pythonCode.contains(configFileReader.getPracQnsCode1())) {
//			System.out.println("CODE1"+configFileReader.getPracQnsCode1());
//		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//		w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode1()));
//		}
//		else if (pythonCode.contains(configFileReader.getPracQnsCode2(pythonCode))) {
//			WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//			w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode2(pythonCode)));
//		}
//		else if(pythonCode.contains(configFileReader.getPracQnsCode3(pythonCode))) {
//			WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//			w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode3(pythonCode)));
//		}
//		else if(pythonCode.contains(configFileReader.getPracQnsCode4(pythonCode))) {
//			WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//			w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode4(pythonCode)));
//		}
//		else if(pythonCode.contains(configFileReader.getPracQnsCode5(pythonCode))) {
//			WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//			w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode5(pythonCode)));
//		}
//		else if(pythonCode.contains(configFileReader.getPracQnsCode6(pythonCode))) {
//			WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//			w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode6(pythonCode)));
//		}
//		else if(pythonCode.contains(configFileReader.getPracQnsCode7(pythonCode))) {
//			WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//			w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode7(pythonCode)));
//		}
//		else if(pythonCode.contains(configFileReader.getPracQnsCode8(pythonCode))) {
//			WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(20));
//			w1.until(ExpectedConditions.textToBePresentInElementValue(tryHereEditor,configFileReader.getPracQnsCode8(pythonCode)));
//		}
//	}
	public void clickTryHereRunBtn() {
		
		tryHereRun.click();
	}
	public String getTryHereOutputText() {
		return tryHereOutput.getText().trim();
	}
	

	public ArrayPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
}