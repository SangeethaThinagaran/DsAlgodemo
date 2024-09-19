package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebDriverManager;

public class ArrayPage {

WebDriver driver=WebDriverManager.getDriver();
	
	
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
	@FindBy(xpath="//a[text()='Basic Operations in Lists]")
	WebElement arrBaseOperInList;
	@FindBy(xpath="//a[text()='Applications of Array']")
	WebElement arrAppOfArr;
	
	//Array Page_DataStructure
	@FindBy(xpath="//a[text()='Data Structures']")
	WebElement arrDataStruc;
	@FindBy(xpath="//a[text()='Arrays']")
	WebElement arrArrays;
	@FindBy(xpath="//a[text()='Linked List']")
	WebElement arrLinkedList;
	@FindBy(xpath="//a[text()='Stack']")
	WebElement arrStack;
	@FindBy(xpath="//a[text()='Queue']")
	WebElement arrQueue;
	@FindBy(xpath="//a[text()='Tree']")
	WebElement arrTree;
	@FindBy(xpath="//a[text()='Graph']")
	WebElement arrGraph;
	
	//ArrayPage_Links
	@FindBy(xpath="//a[text()=' DreamTeam ']")
	WebElement arrDreamTeam;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement arrSignOut;
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
	@FindBy(xpath="//div[@class='container']/div/form/div/div/div/textarea")
	WebElement tryHereEditor;
	@FindBy(xpath="//button[text()='Run']")
	WebElement tryHereRun;
	@FindBy(id="output")
	WebElement tryHereOutput;

	public void Arr_IndexPage() {
		String Arr_IndexPageTitle=Arr_IndexPage.getText();
		System.out.println(Arr_IndexPageTitle);
	}
	public void arrGetStarted() {
		arrGetStarted.click();
	}
	public void arrArrInPy() {
		arrArrInPy.click();
	}
	public void arrArrUseList() {
		arrArrUseList.click();
	}
	public void arrBaseOperInList() {
		arrBaseOperInList.click();
	}
	public void arrAppOfArr() {
		arrAppOfArr.click();
	}
	public void arrDataStruc() {
		arrDataStruc.click();
	}
	public void arrArrays() {
		arrArrays.click();
	}
	public void arrLinkedList() {
		arrLinkedList.click();
	}
	public void arrStack() {
		arrStack.click();
	}
	public void arrQueue() {
		arrQueue.click();
	}
	public void arrTree() {
		arrTree.click();
	}
	public void arrGraph() {
		arrGraph.click();
	}
	public void arrDreamTeam() {
		arrDreamTeam.click();
	}
	public void Arr_SignOut() {
		arrSignOut.click();
	}
	public void practiceQnsLink() {
		practiceQnsLink.click();
	}
	public void pracQnsQn1() {
		pracQnsQn1.click();
	}
	
	public void pracQnsQn2() {
		pracQnsQn2.click();
	}
	
	public void pracQnsQn3() {
		pracQnsQn3.click();
	}
	
	public void pracQnsQn4() {
		pracQnsQn4.click();
	}
	
	public void tryHereBtn() {
		tryHereBtn.click();
	}
	public void tryHereEditor() {
		tryHereEditor.sendKeys("print"+"\"Hello\"");
	}
	public void tryHereRun() {
		tryHereRun.click();
	}
	public void tryHereOutput() {
		tryHereOutput.getText();
	}
		

	public ArrayPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
}