@regression2 @scenarioOutline

Feature: Testing the Search Functionality for Etsy Scenario Outline

  Scenario Outline: Testing different data for Search Function

    When user searches for "<item>" on Etsy Page
    Then user validates the title "<title>"

    Examples:
      | item | title      |
      | Hat  | Hat - Etsy |
      | Key  | Key - Etsy |
      | Pin  | Pin - Etsy |