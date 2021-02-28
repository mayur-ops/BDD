Feature: Result page functionality

  Background:

    Given User is on the home page of argos website
    When User types nike in the search box
    And User clicks on search button
    Then User should be able to see all the nike product

    @pricerange
    Scenario: click on £5 to £10 price range

      Given User is on the result page of argos website
      When  User click on five and ten pound  price range checkbox
      Then User should be able to see all the item within these price range