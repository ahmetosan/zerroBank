Feature: I will login to my account

  Background:
    Given I navigate to the login page


  @wip
  Scenario: I will login to the application  with my username and password

    When I have my username and password entered
    Then I click on the signin button
    And I can navigate to the next page


  @NegativeTest
  Scenario: I will try to login with invalid Username but correct password

    When I have my username and wrong password entered
    Then I click on the signin button
    And I can get failed-error message
