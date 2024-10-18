package stepdefinitions;

	import java.time.Duration;
	import utilities.LoggerLoad;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	import utilities.ConfigFileReader;

	import driverManager.WebdriverManager;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pageObjects.LinkedListPage;

	public class LinkedListStep {
		
		WebDriver driver =  WebdriverManager.getDriver();
		LinkedListPage lp = new LinkedListPage();
		ConfigFileReader configFileReader = WebdriverManager.configReader();
		
		
	//	
//		@Given("The User navigates to the login page")
//		public void the_user_navigates_to_the_login_page() {
//			
//			driver.get(configFileReader.getLoginUrl());
//			LoggerLoad.info("You are in" +driver.getTitle());
//		    
//		}
	//
//		@When("The User valid credentials and clicks the login button")
//		public void the_user_valid_credentials_and_clicks_the_login_button() {
//			lp.setUserName(configFileReader.getUsername());
//			lp.setPassword(configFileReader.getPassword());
//			lp.clickLoginBtn();
//		    
//		}
	//
//		@Then("The User should be navigated to the Home page and logged in")
//		public void the_user_should_be_navigated_to_the_home_page_and_logged_in() {
//			
//			String homePageTitle = driver.getTitle();
//			LoggerLoad.info("You are in" +homePageTitle);
//		    Assert.assertEquals("NumpyNinja", homePageTitle);
//			
//		    
//		}
	//
//		@Given("the user is in homepage and logged in")
//		public void the_user_is_in_homepage_and_logged_in() {
//			driver.get(configFileReader.getHomeUrl());
//			LoggerLoad.info("You are in" +BrowserDriver.getTitle());
//			
//		}

		@When("the user clicks the get started button under linked list section")
		public void the_user_clicks_the_get_started_button_under_linked_list_section() {
			lp.clickGetStartedBtn();
		    
		}

		@Then("the user views the linked list page")
		public void the_user_views_the_linked_list_page() {
			
			String linkedListPageTitle = driver.getTitle();
			
			
		    Assert.assertEquals(linkedListPageTitle,configFileReader.getPageTitle("linkedListPage"));
		    
		}

		@Given("the user is in linked list page")
		public void the_user_is_in_linked_list_page() {
			
			lp.clickGetStartedBtn();
			//LoggerLoad.info("You are in" +driver.getTitle());
		    
		}

		@When("the user clicks the Introduction link under the topics covered section")
		public void the_user_clicks_the_introduction_link_under_the_topics_covered_section() {
		    lp.clickIntroductionLink();
		}

		@Then("the user views the Introduction page")
		public void the_user_views_the_introduction_page() {
			
			String introductionPageTitle = driver.getTitle();
		    Assert.assertEquals(introductionPageTitle,configFileReader.getPageTitle("introduction"));
		    
		}

		@Given("the User is on the Introduction page")
		public void the_user_is_on_the_introduction_page() {
			lp.clickGetStartedBtn();
			lp.clickIntroductionLink();
			//LoggerLoad.info("You are in" +driver.getTitle());
		}

		@When("the User clicks the Try here in Introduction Page")
		public void the_user_clicks_the_try_here_in_introduction_page() {
			
			lp.clicktryEditor();
		    
		}

//		@Then("the User should get navigated to the Try Editor Page")
//		public void the_user_should_get_navigated_to_the_try_editor_page() {
//			String tryEditorPageTitle = BrowserDriver.getTitle();
//		    Assert.assertEquals("Assessment", tryEditorPageTitle);
//		    
//		}

		@Given("the User is on the Try Editor page through the introduction page")
		public void the_user_is_on_the_try_editor_page_through_the_introduction_page() {
			lp.clickGetStartedBtn();
			lp.clickIntroductionLink();
			lp.clicktryEditor();
			//LoggerLoad.info("You are in" +driver.getTitle());
			
		    
		}

//		@When("the User enters a sample code as {string} in the Editor section and click Run")
//		public void the_user_enters_a_sample_code_as_in_the_editor_section_and_click_run(String string) {
//			System.out.println(string);
//			lp.setCode(string);
//			lp.clickRunBtn();
//		    
//		}
	//
//		@Then("the User should get the {string} in the screen")
//		public void the_user_should_get_the_output_in_the_screen(String string) {
//			
//			try {
//				//wait.until(ExpectedConditions.alertIsPresent())
//				driver.switchTo().alert().accept();
//			}
//			catch(Exception e) {
//				System.out.println("alert not present");
//				LoggerLoad.error("alert not present in try editor");
//			}
//			finally {
//				//driver.switchTo().alert().accept();
//				System.out.println(string);
//				String output = lp.getOutput();
//			    Assert.assertEquals(string, output);
//			}
//			
//		    
//		}

		@When("user clicks the creating linked list link under the topics covered section")
		public void user_clicks_the_creating_linked_list_link_under_the_topics_covered_section() {
			
			lp.clickCreatingLinkedListLink();
		    
		}

		@Then("user views the creating linked list page")
		public void user_views_the_creating_linked_list_page() {
			
			String creatingLinkedListTitle = driver.getTitle();
		    Assert.assertEquals(creatingLinkedListTitle,configFileReader.getPageTitle("creatingLinkList"));
		    
		}

		@Given("the User is on the Creating Linked list page")
		public void the_user_is_on_the_creating_linked_list_page() {
			lp.clickGetStartedBtn();
			lp.clickCreatingLinkedListLink();
		    
		}

		@When("the User clicks the Try here in Creating Linked list Page")
		public void the_user_clicks_the_try_here_in_creating_linked_list_page() {
			lp.clicktryEditor();
		    
		}

		@Given("the User is on the Try Editor page through the creating linked list page")
		public void the_user_is_on_the_try_editor_page_through_the_creating_linked_list_page() {
			lp.clickGetStartedBtn();
			lp.clickCreatingLinkedListLink();
			lp.clicktryEditor();
		    
		}

		@When("user clicks the Types of linked list link under the topics covered section")
		public void user_clicks_the_types_of_linked_list_link_under_the_topics_covered_section() {
			
			lp.clickTypesOfLinkedListLink();
		    
		}

		@Then("user views the types of linked list page")
		public void user_views_the_types_of_linked_list_page() {
			String typesOfLinkedListTitle = driver.getTitle();
		    Assert.assertEquals(configFileReader.getPageTitle("typesOfLinkedList"), typesOfLinkedListTitle);
		}

		@Given("the User is on the Types of Linked List page")
		public void the_user_is_on_the_types_of_linked_list_page() {
			lp.clickGetStartedBtn();
			lp.clickTypesOfLinkedListLink();
		    
		}

		@When("the User clicks the Try here in Types of Linked List Page")
		public void the_user_clicks_the_try_here_in_types_of_linked_list_page() {
			lp.clicktryEditor();
		    
		}
		
		@Given("the User is on the Try Editor page through the types of linkedlist page")
		public void the_user_is_on_the_try_editor_page_through_the_types_of_linkedlist_page() {
			lp.clickGetStartedBtn();
			lp.clickTypesOfLinkedListLink();
			lp.clicktryEditor();
		    
		}

		@When("user clicks the implement linked list in python  link under the topics covered section")
		public void user_clicks_the_implement_linked_list_in_python_link_under_the_topics_covered_section() {
			lp.clickImplementLinkedListLink();
		    
		}

		@Then("user views the implement linked list in python  page")
		public void user_views_the_implement_linked_list_in_python_page() {
			String implementTitle = driver.getTitle();
		    Assert.assertEquals(configFileReader.getPageTitle("implementLinkedList"), implementTitle);
		}

		@Given("the User is on the Implement linked list in python page")
		public void the_user_is_on_the_implement_linked_list_in_python_page() {
			lp.clickGetStartedBtn();
			lp.clickImplementLinkedListLink();
		    
		}

		@When("the User clicks the Try here in Implement linked list in python Page")
		public void the_user_clicks_the_try_here_in_implement_linked_list_in_python_page() {
			lp.clicktryEditor();
		    
		}
		
		@Given("the User is on the Try Editor page through the implement linked list in python page")
		public void the_user_is_on_the_try_editor_page_through_the_implement_linked_list_in_python_page() {
			lp.clickGetStartedBtn();
			lp.clickImplementLinkedListLink();
			lp.clicktryEditor();
		    
		}

		@When("user clicks the traversal link under the topics covered section")
		public void user_clicks_the_traversal_link_under_the_topics_covered_section() {
			lp.clicktraversalLink();
		    
		}

		@Then("user views the traversal page")
		public void user_views_the_traversal_page() {
			String traversalTitle = driver.getTitle();
		    Assert.assertEquals(configFileReader.getPageTitle("traversal"), traversalTitle);
		}

		@Given("the User is on the Traversal page")
		public void the_user_is_on_the_traversal_page() {
			lp.clickGetStartedBtn();
			lp.clicktraversalLink();
		    
		}

		@When("the User clicks the Try here in Traversal Page")
		public void the_user_clicks_the_try_here_in_traversal_page() {
			lp.clicktryEditor();
		    
		}
		
		@Given("the User is on the Try Editor page through the traversal page")
		public void the_user_is_on_the_try_editor_page_through_the_traversal_page() {
			lp.clickGetStartedBtn();
			lp.clicktraversalLink();
			lp.clicktryEditor();
		    
		    
		}

		@When("user clicks the insertion link under the topics covered section")
		public void user_clicks_the_insertion_link_under_the_topics_covered_section() {
			lp.clickinsertionLink();
		    
		}

		@Then("user views the insertion page")
		public void user_views_the_insertion_page() {
			String insertionTitle = driver.getTitle();
		    Assert.assertEquals(configFileReader.getPageTitle("insertion"), insertionTitle);
		}

		@Given("the User is on the Insertion page")
		public void the_user_is_on_the_insertion_page() {
			lp.clickGetStartedBtn();
			lp.clickinsertionLink();
		    
		}

		@When("the User clicks the Try here in Insertion Page")
		public void the_user_clicks_the_try_here_in_insertion_page() {
			lp.clicktryEditor();
		    
		}
		
		@Given("the User is on the Try Editor page through the insertion page")
		public void the_user_is_on_the_try_editor_page_through_the_insertion_page() {
			lp.clickGetStartedBtn();
			lp.clickinsertionLink();
			lp.clicktryEditor();
		    
		}

		@When("user clicks the deletion link under the topics covered section")
		public void user_clicks_the_deletion_link_under_the_topics_covered_section() {
			lp.clickdeletionLink();
		    
		}

		@Then("user views the deletion page")
		public void user_views_the_deletion_page() {
			String deletionTitle = driver.getTitle();
		    Assert.assertEquals(deletionTitle,configFileReader.getPageTitle("deletion"));
		}

		@Given("the User is on the Deletion page")
		public void the_user_is_on_the_deletion_page() {
			lp.clickGetStartedBtn();
			lp.clickdeletionLink();
		    
		}

		@When("the User clicks the Try here in Deletion Page")
		public void the_user_clicks_the_try_here_in_deletion_page() {
			lp.clicktryEditor();
		    
		}
		
		@Given("the User is on the Try Editor page through the deletion page")
		public void the_user_is_on_the_try_editor_page_through_the_deletion_page() {
			lp.clickGetStartedBtn();
			lp.clickdeletionLink();
			lp.clicktryEditor();
		    
		}


		@When("the User clicks the Practice Questions link in Introduction Page")
		public void the_user_clicks_the_practice_questions_link_in_introduction_page() {
			lp.clickPracticeLink();
		    
		}

		@Then("the User should get navigated to the Linked List Practice Questions Page")
		public void the_user_should_get_navigated_to_the_linked_list_practice_questions_page() {
			String practiceTitle = driver.getTitle();
		    Assert.assertEquals(practiceTitle,configFileReader.getPageTitle("practiceQuestions"));
		    
		}



		
		
		
		


	}

