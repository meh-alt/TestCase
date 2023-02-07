Feature:User updates his/her birthday info
  Agile story: As a user, I login to app then I change my birthday info

  Background:
    Given User is on the home page


  Scenario: User login to application
    When user goes to login page
    And user enters credentials
    And user goes to User Info page
    And User changes birthday Info
    And User click update button
    Then user logout




