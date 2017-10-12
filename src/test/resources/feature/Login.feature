Feature: Login User

  Background:
    Given I am on the Homepage
    And I click sigin button

  @Login
  Scenario Outline: As a user I want to Login successfully
    When I enter email "<email>" details
    And I enter password "<passw>" details
    And I click Signin button
    Then I verify that I am logged in
    And I log out successfully

    Examples:
      | email | passw    |
      | admin | password |


