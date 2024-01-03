package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterPageSteps {


    @Then("User navigates to register page")
    public void userNavigatesToRegisterPage() {
        System.out.println("User navigates to register page");
    }

    @Then("User verifies Register text")
    public void userVerifiesRegisterText() {
        String expected = "Register";
        String actual = new RegisterPage().verifyRegisterText();
        Assert.assertEquals(actual, expected, "No Register text found");
    }

    @And("User clicks on register button")
    public void userClicksOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("User verifies error message First name is required")
    public void userVerifiesErrorMessageFirstNameIsRequired() {
        String expected = "First name is required.";
        String actual = new RegisterPage().verifyFirstNameError();
        Assert.assertEquals(actual, expected, "Error message not displayed");
    }

    @And("User verifies error message Last name is required")
    public void userVerifiesErrorMessageLastNameIsRequired() {
        String expected = "Last name is required.";
        String actual = new RegisterPage().verifyLastNameError();
        Assert.assertEquals(actual, expected, "Error message not displayed");

    }

    @And("User verifies error message Email is required")
    public void userVerifiesErrorMessageEmailIsRequired() {
        String expected = "Password is required.";
        String actual = new RegisterPage().verifyPasswordError();
        Assert.assertEquals(actual, expected, "Error message not displayed");
    }

    @And("User verifies error message Password is required")
    public void userVerifiesErrorMessagePasswordIsRequired() {
        String expected = "Password is required.";
        String actual = new RegisterPage().verifyPasswordError();
        Assert.assertEquals(actual, expected, "Error message not displayed");
    }


    @And("User verifies error message Confirm Password is required")
    public void userVerifiesErrorMessageConfirmPasswordIsRequired() {
        String expected = "Password is required.";
        String actual = new RegisterPage().verifyConfirmPasswordError();
        Assert.assertEquals(actual, expected, "Error message not displayed");
    }

    @And("User selects gender")
    public void userSelectsGender() {
        new RegisterPage().selectGender("Female");
    }

    @And("User enters first name")
    public void userEntersFirstName() {
        new RegisterPage().firstNameOption("Mahak");
    }

    @And("User enter last name")
    public void userEnterLastName() {
        new RegisterPage().lastNameOption("Agarwal");
    }

    @And("User selects date of birth")
    public void userSelectsDateOfBirth() {
        new RegisterPage().dateOfBirthDay("23");
    }

    @And("User selects month of year")
    public void userSelectsMonthOfYear() {
        new RegisterPage().dateOfBirthMonth("January");

    }

    @And("User selects year of birth")
    public void userSelectsYearOfBirth() {
        new RegisterPage().dateOfBirthYear("1999");
    }

    @And("User enters email")
    public void userEntersEmail() throws InterruptedException {
        Thread.sleep(3000);
        new RegisterPage().enterEmailAddress();

    }

    @And("User enters password")
    public void userEntersPassword() {
        new RegisterPage().enterPasswordOption("Mahak123");
    }

    @And("User enters confirm password")
    public void userEntersConfirmPassword() {
        new RegisterPage().enterConfirmPassword("Mahak123");
    }


    @Then("User verifies text Your registration completed")
    public void userVerifiesTextYourRegistrationCompleted() {
        String expected = "Your registration completed";
        String actual = new RegisterPage().verifyRegistrationCompleteMessage();
        Assert.assertEquals(actual,expected,"Error message");
    }
}