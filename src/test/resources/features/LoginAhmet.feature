Feature: Only	authorized	users	should	be	able	to	login	to	the	application

  Scenario: user logs in from home page
    Given user on login page
    When user enter the valid credential
    Then user can land the correct page
  @login
  Scenario: user can login
    Given user on login page
    When user enter the invalid credential
    Then user can not login and "Login and/or password are wrong." should displayed