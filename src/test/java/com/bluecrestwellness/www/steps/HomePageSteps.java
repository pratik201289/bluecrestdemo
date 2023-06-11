package com.bluecrestwellness.www.steps;

import com.bluecrestwellness.www.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @Given("^I click on accept link$")
    public void iClickOnAcceptLink() throws InterruptedException {
        new HomePage().clickOnAcceptBtn();
    }

    @When("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on about us link$")
    public void iClickOnAboutUsLink() throws InterruptedException {
    }

    @Then("^I should navigate to about us page successfully$")
    public void iShouldNavigateToAboutUsPageSuccessfully() {
    }
}
