package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
    @Then("User navigates to the login page")
    public void userNavigatesToTheLoginPage() {
        System.out.println("user navigated to the login page");
    }

    @And("User verifies the Welcome, Please Sign In! text")
    public void userVerifiesTheWelcomePleaseSignInText() {
        String expected = "Welcome, Please Sign In!";
        String actual =  new LoginPage().verifyWelcomeText();
        Assert.assertEquals(actual,expected,"Error Message");
    }

    ///@And("User enters Email Id {string}")
   // public void userEntersEmailId(String email) {
     //   new LoginPage().enterEmailID(email);
  //  }

    @And("User enters Password {string}")
    public void userEntersPassword(String password) {
        new LoginPage().enterPassword("Mahak123");
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("User verify the error message")
    public void userVerifyTheErrorMessage() {
        String expected1 = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actual1 = new LoginPage().verifyErrorMessage();
        Assert.assertEquals(actual1,expected1,"Error message displayed");
    }


    @Then("User verifies logout link is displayed")
    public void userVerifiesLogoutLinkIsDisplayed() {
        String expected = "Log out";
        String actual = new LoginPage().verifyLogoutLinkIsDisplayed();
        Assert.assertEquals(actual,expected,"Error message");
    }


    @And("User enters password {string}")
    public void userEntersPassword1(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("User verifies login link is displayed")
    public void userVerifiesLoginLinkIsDisplayed() {
        String expected = "Log in";
        String actual = new LoginPage().verifyLoginLink();
        Assert.assertEquals(actual,expected,"Log in link not found");
    }

    @When("User clicks on register link")
    public void userClicksOnRegisterLink(){
        new HomePage().clickOnRegisterLink();

    }

    @And("User enters Email Id {string}")
    public void userEntersEmailId(String email) {
        new LoginPage().enterEmailID(email);
    }

    @And("User enters email random email")
    public void userEntersEmailRandomEmail() {
        new RegisterPage().randomEmail();
    }




    //  loginPage.enterEmailID(randomEmail);
    }



