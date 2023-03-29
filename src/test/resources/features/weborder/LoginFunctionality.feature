@negativeTesting
  Feature: Testing Login Functionality of WebOrderPage

    @smoke1
    Scenario Outline:

      When User provides '<username>' and '<password>' for WebOrder Login Page
      And User clicks on sign in button
      Then user validates the header "Sign in Failed"

      Examples:
        | username              | password |
        | guest1@microworks.com |          |
        |                       | Guest1!  |

    @smoke2
    Scenario Outline:

      When User provides '<username>' and '<password>' for WebOrder Login Page
      And User clicks on sign in button
      Then user validates the header "Sign in Failed"

      Examples:
        | username              | password |
        | 1234@gmail.com        | etsy     |
        | guest1@microworks.com | 1234     |



