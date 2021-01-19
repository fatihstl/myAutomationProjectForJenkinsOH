
Feature: login feature

  Scenario: Basic login
    Given user is on the login page
    When user enter credentials
    And user click login button
    Then User should be able to see welcome page

