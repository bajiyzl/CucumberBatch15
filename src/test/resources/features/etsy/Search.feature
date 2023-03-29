@regression
Feature: Testing the search functionality of Etsy search bar

  Scenario: Validation Title of Etsy after searching Hat
    When user searches for "Hat" on Etsy Page
    Then user validates the title "Hat - Etsy"

  Scenario: Validation Title of Etsy after searching Key
    When user searches for "Key" on Etsy Page
    Then user validates the title "Key - Etsy"

  Scenario: Validation Title of Etsy after searching Pin
    When user searches for "Pin" on Etsy Page
    Then user validates the title "Pin - Etsy"


