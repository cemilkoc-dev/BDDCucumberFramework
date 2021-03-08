# Author: Cemil Koc
@login
Feature: Sauce Labs Login

  Scenario: Valid login
    Given I am on the login page
    When I enter valid username in the username field
    And I enter valid password in the password field
    And I click on the login button
    Then I see the home page

  Scenario: Invalid login
    Given I am on the login page
    When I enter invalid username in the username field
    And I enter invalid password in the password field
    And I click on the login button
    Then I see the error message