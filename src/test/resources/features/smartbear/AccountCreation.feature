@scenarioOutline
Feature: Testing the account creation and validation from SmartBear

  Scenario Outline: Testing account creation and validation with different datas

    When user sign in to smartbear website using username "tester",  password "test" and click login button
    When user click on Order Section
    When user provides product information "<productSelect>", "<quantity>"
    And user provides address information "<customerName>", "<street>", "<city>", "<state>", "<zipcode>"
    And user provides payment information "<card>","<cardNumber>", "<expireDate>"
    And user validated "New order has been successfully added." and clicks on view all orders section
    Then validates "<blank>", "<customerName>","<productSelect>", "<quantity>","<date>","<street>", "<city>", "<state>", "<zipcode>", "<card>","<cardNumber>", "<expireDate>"

    Examples:
      | blank | productSelect | quantity | customerName | date       | street     | city | state | zipcode | card             | cardNumber | expireDate |
      |       | MyMoney       | 5        | ahmet        | 03/29/2023 | 1234 C St. | CHI  | IL    | 20000   | Visa             | 99999999   | 02/22      |
      |       | FamilyAlbum   | 2        | mehmet       | 03/29/2023 | 4321 A St. | LA   | CA    | 50000   | MasterCard       | 1111111111 | 09/21      |
      |       | ScreenSaver   | 1        | ayse         | 03/29/2023 | 9999 T. St | NY   | NY    | 30000   | American Express | 55555555   | 01/14      |

    #First Create your hook class and add your @Before @After
    # Read username, password, url from Config properties
    # Start writing your test case in feature file
  #start creating your Page Object Model

