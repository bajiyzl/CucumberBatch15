@regression
Feature: Testing all functionality of the Automation Exercise Website

  Background:
    Given Verify the homepage is "https://automationexercise.com/"

  @testcase1
  Scenario: Test case 1: Register User
    When user clicks on SignupLogin button
    And user verifies 'New User Signup!' new user sign up is visible
    And user enters "John" and "Johnwick22@gmail.com" to signup input
    When user clicks Signup Button
    And user verifies that 'ENTER ACCOUNT INFORMATION' enter account information is visible
    And user fills the details: title, "John", email, "johnwick", "1", "January" and "1980"
    And user selects checkbox Sign up for our newsletter!
    And user selects checkbox Receive special offers from our partners!
    And user fills details: "John", "Wick", "Hitman INC", "1234 California St.", "4321 Chicago St.", "Singapore", "IL", "Singapore", "20222", "9999999999"
    And user clicks Create Account button
    And user verifies that 'ACCOUNT CREATED!' account created is visible
    And user clicks Continue button
    And user verifies that 'Logged in as John' logged in as username is visible
    #And user clicks Delete Account button
    #Then user verifies that 'ACCOUNT DELETED!' is visible and click Continue button

  @testcase2
  Scenario: Test case 2: Login User with correct username and password
    When user clicks on SignupLogin button
    And user verifies "Login to your account" login to your account is visible
    And user enters correct "Johnwick22@gmail.com" and "johnwick" to signin input
    And user clicks on SignIn Button
    And user verifies that 'Logged in as John' logged in as username is visible
      #And user clicks Delete Account button
      #Then user verifies that 'ACCOUNT DELETED!' is visible and click Continue button

  @testcase3
  Scenario Outline: Test case 3: Login User with incorrect username and password
    When user clicks on SignupLogin button
    And user verifies "Login to your account" login to your account is visible
    And user enters incorrect "<incorrectEmail>" and "<incorrectPassword>" to signin input
    And user clicks on SignIn Button
    Then user verifies incorrect email and password error 'Your email or password is incorrect!' is visible

    Examples:
      | incorrectEmail       | incorrectPassword |
      | hjiu@asd.com         | hjiu              |
      | Johnwick22@gmail.com | jhonwick          |
      | Jhonwick22@gmail.com | johnwick          |

    @testcase4
    Scenario: Test case 4: Logout User
      When user clicks on SignupLogin button
      And user verifies "Login to your account" login to your account is visible
      And user enters correct "Johnwick22@gmail.com" and "johnwick" to signin input
      And user clicks on SignIn Button
      And user verifies that 'Logged in as John' logged in as username is visible
      And user clicks on Sign Out button
      Then user validates that he navigated to login page and validates login url "https://automationexercise.com/login"

      @testcase5
      Scenario: Test case 5: Register User with existing email
        When user clicks on SignupLogin button
        And user verifies 'New User Signup!' new user sign up is visible
        And user enters "Johnn" and "Johnwick22@gmail.com" to signup input
        And user clicks Signup Button
        Then user verifies email already exist message 'Email Address already exist!' is visible









