Feature: Login

  Scenario Outline: Logins in
    Given I want to write a step with "<name>"
    And i have to give "<password>"
    When I give sumbit
    Then I login to next page
    When clicks the search tab & enters the first four letters of the product
    When selects product from drop down
    When clicks on find details
    When adds the product to cart
    Then user should be in add to cart page

    Examples: 
      | name    | password    |
      | Lalitha | password123 |
