Feature: User adds some items to cart
    Agile story : As a user I should be able to add items to chart

    Background:
      Given User is on the home page
  @wip
    Scenario: User login to application
      When user goes to login page
      And user enters credentials
      And user enters item to search box
      And User adds items to cart
      And User goes to cart
      And The quantity of any product in the cart is increased.
      And user goes to home page
      Then user logout from application