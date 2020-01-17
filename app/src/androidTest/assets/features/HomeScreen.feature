Feature: Home Screen
  As a user, I want to be able to type my date of birth in the required field
  So that the app can calculate my age and display the calculated value

  Scenario: Submitting valid date of birth in the required format
    Given I am on the Home Screen
    And I enter "10/12/1990" as date of birth
    When I tap on Calculate my age button
    Then I see correct results displayed

  Scenario: Submitting invalid date of birth in the required format
    Given I am on the Home Screen
    And I enter "15/20/1990" as date of birth
    When I tap on Calculate my age button
    Then I can not see any results displayed

  Scenario: Submitting valid date of birth in invalid format
    Given I am on the Home Screen
    And I enter "06.07.2000" as date of birth
    When I tap on Calculate my age button
    Then I can not see any results displayed

  Scenario: Submitting invalid date of birth in invalid format
    Given I am on the Home Screen
    And I enter "00.01.0050" as date of birth
    When I tap on Calculate my age button
    Then I can not see any results displayed





