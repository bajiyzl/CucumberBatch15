@regression
Feature: WebOrder Page Food Order Fucntionality

Background: food order same steps

    Given User provides 'guest1@microworks.com' and 'Guest1!' for WebOrder
    And User validates the "ORDER DETAILS - Weborder" from homepage
    When User clicks Group Order Box and Next Button
    And User sends the word "I love Cucumber" for note to the invitees section
    And User sends e-mail address which are "baji@gmail.com" ", " and "lol@gmail.com" to the Invite List

  @ahmet @ayse
  Scenario: Testing the Happy Path food order for my House

    And User chooses the delivery address "My House" and validates the address "3137 3137 Laguna Street"
    And User clicks the create Group Order Button
    Then User validates the header of page "View Group Order"
    And User validates the word "Your group order is now pending" from description
@mahmut
  Scenario: Testing the Happy Path food order for Office

      And User chooses the delivery address "Office" and validates the address "2012 EMPIRE"
      And User clicks the create Group Order Button
      Then User validates the header of page "View Group Order"
