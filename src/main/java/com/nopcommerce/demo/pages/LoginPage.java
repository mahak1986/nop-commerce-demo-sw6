package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    public static String generatedEmail;

   @CacheLookup
   @FindBy(name = "Email")
   WebElement enterEmailAddress2;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement verifyLogoutLinkIsDisplayed;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement verifyLoginLink;

   public void enterEmailID(String email) {
        sendTextToElement(enterEmailAddress2, email);
       log.info("Enter email address : " + enterEmailAddress2.toString());
   }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on login button : " + loginButton.toString());
    }

    public String verifyWelcomeText() {
        log.info("Getting text from welcome text : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String verifyErrorMessage() {
        log.info("Getting text from error message : " + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }
    public void clickOnLogoutLink() {
        clickOnElement(logout);
        log.info("Click on logout link : " + logout.toString());
    }
    public String verifyLogoutLinkIsDisplayed(){
        log.info("Verify logout link is displayed : " + verifyLogoutLinkIsDisplayed.toString());
        return getTextFromElement(verifyLogoutLinkIsDisplayed);
    }
    public String verifyLoginLink(){
        log.info("Verify log in link is displayed : " + verifyLoginLink.toString());
        return getTextFromElement(verifyLoginLink);
    }
}

