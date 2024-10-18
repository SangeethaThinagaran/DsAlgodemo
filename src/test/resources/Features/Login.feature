@Login
Feature: DS Portal Login Functionality

  @LoginCredentials @LoginTC_001
  Scenario: Validate the login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"
    Then The User get navigated to home page and successfully logged in

  @LoginInvalidCredentials @LoginTC_002
  Scenario Outline: Validate the login with Invalid Credentials
    Given The User is on the login page
    When The User enters the username "<sheetName>" password <rowNumber> and clicks on login button
    Then The User gets suggested to enter the valid credentials

    Examples: 
      | sheetName        | rowNumber |
      | LoginCredentials |         1 |
      | LoginCredentials |         2 |
      | LoginCredentials |         3 |
      | LoginCredentials |         4 |
      | LoginCredentials |         5 |

