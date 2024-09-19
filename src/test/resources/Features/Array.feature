@Array
Feature: DsPortal Array Page Functionality
	
	Background: Successful login with valid credentials
				
	Given the User navigates to the login page
    When the User valid credentials and clicks the login button
    Then the User should be navigated to the Home page and logged in
		
	@Array_GetStarted @Array_TC_001
	Scenario: Validating Array Module
	Given the User is on the DsAlgo Portal Home page
	When the User clicks Get Started button in the Array section
	Then the User should get navigated to the Array Module  Page 

	@AIP @Array_TC_002
	Scenario: Validating the Arrays in Python link in Array Module Page
	Given the User is on the Array Module page
	When the User clicks Arrays in Python link in the Array Module Page
	Then the User should get navigated to the Arrays in Python Page
	
#	@AIPTryEditor @Array_TC_003
#	Scenario: Validating Try here button in Arrays in Python 
#	Given the User is on the Arrays in Python page
#	When the User clicks the Try here in Arrays in Python Page
#	Then the User should get navigated to the Try Editor Page
#	
#		
#	#----------------ArrayInPython_PracticeQns_Search the Array---------------------
#	
#	@AIPPracQns @Array_TC_004
#	Scenario: Validating Practice Questions link in Array in Python Page
#	Given the User is on the Arrays in Python page 
#	When the User clicks Practice Questions link in the Python Page
#	Then the User should get navigated to the Practice Questions Page
#	
#	@AIPPracQns1 @Array_TC_005
#	Scenario: Validating Search the Array in Array in Python Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Search the array link in Practice Questions Page
#	Then the User should get navigated to the Search the Array Page
#	
#		
#	#----------------ArrayInPythonLink_Max Consecutive Ones---------------------
#	
#	@AIPPracQns2 @AIPPracQns2TC_006
#	Scenario: Validating the Max Consecutive Ones in Array in Python Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Max Consecutive Ones link in Practice Questions Page
#	Then the User should get navigated to the Max Consecutive Ones Page
#	
#	
#	
#	#----------------ArrayInPythonLink_Find Numbers with Even Number of Digits---------------------
#	
#	@AIPPracQns3 @AIPPracQns3TC_007
#	Scenario: Validating the Find Numbers with Even Number of Digits in Array in Python Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page
#	Then the User should get navigated to the Find Numbers with Even Number of Digits Page
#	
#		
#	#----------------ArrayInPythonLink_Squares of a Sorted Array---------------------
#	
#	@AIPPracQns4 @AIPPracQns4TC_008
#	Scenario: Validating the Squares of a Sorted Array in Array in Python Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Squares of a Sorted Array link in Practice Questions Page
#	Then the User should get navigated to the Squares of a Sorted Array Page
#		

#	@AUL @AULTC_009
#	Scenario: Validating the Arrays using List link in Array Module Page
#	Given the User is on the Array Module page
#	When the User clicks Arrays using List link in the Array Module Page
#	Then the User should get navigated to the Arrays using List Page
#	
#	@AULTryEditor @AULEditorTC_010
#	Scenario: Validating Try here button in Arrays using List Page 
#	Given the User is on the Arrays using List page
#	When the User clicks the Try here in Arrays using List Page
#	Then the User should get navigated to the Try Editor Page
#	
#		
#	#----------------ArrayUsingList_Search the Array---------------------
#	
#	@AULPracQns @AULPracQnsTC_011
#	Scenario: Validating Practice Questions link in Arrays using List Page
#	Given the User is on the Arrays using List page 
#	When the User clicks Practice Questions link in the Arrays using List Page
#	Then the User should get navigated to the Practice Questions Page
#	
#	@AULPracQns1 @AULPracQns1TC_012	
#	Scenario: Validating Search the Array in Array using List Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Search the Array link in Practice Questions Page
#	Then the User should get navigated to the Search the Array Page
#	
#	
#	#----------------ArrayUsingListLink_Max Consecutive Ones---------------------
#	
#	@AULPracQns2 @AULPracQns2TC_013
#	Scenario: Validating the Max Consecutive Ones in Array using List Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Max Consecutive Ones link in Practice Questions Page
#	Then the User should get navigated to the Max Consecutive Ones Page
#	
#	
#	#----------------ArrayUsingListLink_Find Numbers with Even Number of Digits---------------------
#	
#	@AULPracQns3 @AULPracQns3TC14
#	Scenario: Validating the Find Numbers with Even Number of Digits in Array using List Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page
#	Then the User should get navigated to the Find Numbers with Even Number of Digits Page
#		
#	
#	#----------------ArrayUsingListLink_Squares of a Sorted Array---------------------
#	
#	@AULPracQns4 @AULPracQns4TC_015
#	Scenario: Validating the Squares of a Sorted Array in Array using List Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Squares of a Sorted Array link in Practice Questions Page
#	Then the User should get navigated to the Squares of a Sorted Array Page
#	
#		
#	#----------------ArrayUsingListLink_DataStructure---------------------
#	
#	
#	#----------------SignOut_Arrays using List---------------------
#	
#	#----------------Basic Operations in Lists_TryHere---------------------	
#
#	@BOL @BOLTC_0016
#	Scenario: Validating the Basic Operations in Lists link in Array Module Page
#	Given the User is on the Array Module page
#	When the User clicks Basic Operations in Lists link in the Array Module Page
#	Then the User should get navigated to the Basic Operations in Lists Page
#	
#	@BOLTryEditor @BOLEditorTC_017
#	Scenario: Validating Try here button in Basic Operations in Lists Page 
#	Given the User is on the Basic Operations in Lists page
#	When the User clicks the Try here in Basic Operations in Lists Page
#	Then the User should get navigated to the Try Editor Page
#	
#		
#	
#	#----------------Basic Operations in Lists_Search the Array---------------------
#	
#	@BOLPracQns @BOLPracQnsTC_018
#	Scenario: Validating Practice Questions link in Basic Operations in Lists Page
#	Given the User is on the Basic Operations in Lists page 
#	When the User clicks Practice Questions link in the Basic Operations in Lists Page
#	Then the User should get navigated to the Practice Questions Page
#	
#	@BOLPracQns1 @BOLPracQns1TC_019
#	Scenario: Validating Search the Array in Basic Operations in Lists Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Search the Array link in Practice Questions Page
#	Then the User should get navigated to the Search the Array Page
#	
#	
#	
#	#----------------Basic Operations in Lists_Max Consecutive Ones---------------------
#	
#	@BOLPracQns2 @BOLPracQns2TC_020
#	Scenario: Validating the Max Consecutive Ones in Basic Operations in Lists Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Max Consecutive Ones link in Practice Questions Page
#	Then the User should get navigated to the Max Consecutive Ones Page	
#	
#	
#	#----------------Basic Operations in Lists_Find Numbers with Even Number of Digits---------------------
#	
#	@BOLPracQns3 @BOLPracQns3TC_021
#	Scenario: Validating the Find Numbers with Even Number of Digits in Basic Operations in Lists Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page
#	Then the User should get navigated to the Find Numbers with Even Number of Digits Page
#	
#		
#	#----------------Basic Operations in Lists_Squares of a Sorted Array---------------------
#	
#	@BOLPracQns4 @BOLPracQns4TC_022
#	Scenario: Validating the Squares of a Sorted Array in Basic Operations in Lists Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Squares of a Sorted Array link in Practice Questions Page
#	Then the User should get navigated to the Squares of a Sorted Array Page
#	
#	
#	
#	#----------------Basic Operations in Lists Link_DataStructure---------------------
#	
#	
#	
#	#----------------SignOut_Basic Operations in Lists---------------------
#	
#	
#	#----------------Applications of Array_TryHere---------------------	
#
#	@AOA @AOATC_023
#	Scenario: Validating the Applications of Array link in Array Module Page
#	Given the User is on the Array Module page
#	When the User clicks Applications of Array link in the Array Module Page
#	Then the User should get navigated to the Applications of Array Page
#	
#	@AOATryEditor @AOAEditorTC_024
#	Scenario: Validating Try here button in Applications of Array Page 
#	Given the User is on the Applications of Array page
#	When the User clicks the Try here in Applications of Array Page
#	Then the User should get navigated to the Try Editor Page	
#	
#	
#	#----------------Applications of Array_Search the Array---------------------
#	
#	@AOAPracQns @AOAPracQnsTC_025
#	Scenario: Validating Practice Questions link in Applications of Array Page
#	Given the User is on the Basic Operations in Lists page 
#	When the User clicks Practice Questions link in the Applications of Array Page
#	Then the User should get navigated to the Practice Questions Page
#	
#	@AOAPracQns1 @AOAPracQns1TC_026
#	Scenario: Validating Applications of Array in Array using List Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Applications of Array link in Practice Questions Page
#	Then the User should get navigated to the Applications of Array Page
#	
#	
#	
#	#----------------Applications of Array_Max Consecutive Ones---------------------
#	
#	@AOAPracQns2 @AOAPracQns2TC_027
#	Scenario: Validating the Max Consecutive Ones in Applications of Array Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Max Consecutive Ones link in Practice Questions Page
#	Then the User should get navigated to the Max Consecutive Ones Page
#	
#	
#	#----------------Applications of Array_Find Numbers with Even Number of Digits---------------------
#	
#	@AOAPracQns3 @AOAPracQns3TC_028
#	Scenario: Validating the Find Numbers with Even Number of Digits in Applications of Array Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page
#	Then the User should get navigated to the Find Numbers with Even Number of Digits Page
#	
#	
#	#----------------Applications of Array_Squares of a Sorted Array---------------------
#	
#	@AOAPracQns4 @AOAPracQns4TC_029
#	Scenario: Validating the Squares of a Sorted Array in Applications of Array Page 
#	Given the User is on the Practice Questions page
#	When the User clicks the Squares of a Sorted Array link in Practice Questions Page
#	Then the User should get navigated to the Squares of a Sorted Array Page
