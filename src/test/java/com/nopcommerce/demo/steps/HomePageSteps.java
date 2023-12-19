package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    @Given("User is on homepage")
    public void userIsOnHomepage() {
        System.out.println("User is on Homepage");
    }

    @When("User clicks on login link")
    public void userClicksOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }


    @Then("User navigates to the Homepage")
    public void userNavigatesToTheHomepage() {
        System.out.println("user navigates to Homepage");
    }

    @Then("User clicks on the logout link")
    public void userClicksOnTheLogoutLink() {
        new LoginPage().clickOnLogoutLink();
    }
}
