package com.calculator.stepDefinitions;

import com.calculator.robots.HomeScreenRobot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeScreenSteps {

    private HomeScreenRobot robot = new HomeScreenRobot();

    @Given("I am on the Home Screen")
    public void iAmOnTheHomeScreen() {
        robot.launchScreen();
    }

    @And("I enter (\\S+) as date of birth")
    public void isEnterDateOfBirthInTheValidFormat(String date) {
        robot.enterValidDateAndFormat(date);
    }

    @When("I tap on Calculate my age button")
    public void iTapOnCalculateMyAgeButton() {
       robot.tapOnCalculateMyAgeButton();
    }

    @Then("I see correct results displayed")
    public void iSeeCorrectResultsDisplayed() {
        robot.checkCorrectResultsDisplayed();
    }

    @Then("I can not see any results displayed")
    public void iCanNotSeeAnyResultsDisplayed() {
        robot.checResultsNotDisplayed();
    }

    @Then("I see title, date input and calculate age button, but not result view")
    public void iSeeDateInputDisplayed() {
        robot.checkTitleDisplayed();
        robot.checkDateInputDisplayed();
        robot.checkCalculateAgeButtonDisplayed();
        robot.checResultsNotDisplayed();
    }
}
