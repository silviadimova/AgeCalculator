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

    }

    @And("I enter \"([^\"]*)\" as date of birth")
    public void iEnterDateOfBirthInTheValidFormat(String date) {

    }

    @When("I tap on Calculate my age button")
    public void iClickOnCalculateMyAgeButton() {

    }

    @Then("I see correct results displayed")
    public void iSeeCorrectResultsDisplayed() {

    }

    @Then("I can not see any results displayed")
    public void iCanNotSeeAnyResultsDisplayed() {

    }
}
