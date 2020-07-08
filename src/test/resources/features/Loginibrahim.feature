# new feature
# Tags: optional

Feature: Login Feature


@Login
  Scenario: Users	with	wrong	username	or	wrong	password	should	not	be	able	to	login.
    Given users should not be able to login
    When user logs in with invalid credentials
    Then error	message	Login	and/or password	are	wrong. should	be	displayed

#  Scenario: Users	with	wrong	username	or	wrong	password	should	not	be	able	to	login.
#    Given users should not be able to login
#    When user logs with blank username and blank password
#    Then error	message	Login	and/or password	are	wrong. should	be	displayed