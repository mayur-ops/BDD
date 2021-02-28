Feature: HomePage functionality

  @search
  Scenario: search for individual product

    Given User is on the home page of argos website
    When User types nike in the search box
    And User clicks on search button
    Then User should be able to see all the nike product

  @account
  Scenario: check for account button

    Given User is on the home page of argos website
    When User clicks on account button
    Then User should be able to see sign in page

    @wishlist

    Scenario: check for wishlist button

      Given User is on the home page of argos website
      When User clicks on wishlist button
      Then User should be able to see your wishlist page

      @MultipleSearch
 Scenario Outline: search for multiple product

   Given User is on the home page of argos website
   When User search for product "<products>"
   Then User should be able to see all the products related to search

   Examples:
   |products|
   |nike    |
   |puma    |


