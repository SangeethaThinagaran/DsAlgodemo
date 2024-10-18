@Registration
Feature: DS Portal Register Functionality

  @RegisterPage @RegTest_001
  Scenario: Successful navigate to Registration Page
    Given The User is on the Home Page
    When The User clicks on the Register link
    Then The User should get navigated to Register Page
