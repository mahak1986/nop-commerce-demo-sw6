package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class);

    public String randomEmail = randomEmail();
    @CacheLookup
    @FindBy(id ="Email")
    WebElement enterEmailAddress;

    public static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmailAddress1;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement clickOnRegisterLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegisterText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameOption;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameOption;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPasswordOption;
    @CacheLookup
    @FindBy(name = "ConfirmPassword")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthDay;


    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;

    public void enterEmailID(String email) {
        sendTextToElement(enterEmailAddress, email);
        log.info("Enter email address : " + enterEmailAddress.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(clickOnRegisterLink);
        log.info("Click on register link : " + clickOnRegisterLink.toString());
    }

    public String verifyRegisterText() {
        log.info("Verify register text : " + verifyRegisterText.toString());
        return getTextFromElement(verifyRegisterText);
    }

    public void selectGender(String maleOrFemale) {
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                log.info("Select gender : " + genderMale.toString());
                break;
            case "Female":
                clickOnElement(genderFemale);
                log.info("Select gender : " + genderFemale.toString());
                break;
            default:
                break;
        }
    }


    public void firstNameOption(String firstName) {
       sendTextToElement(firstNameOption, firstName);
        log.info("Enter first name : " + firstNameOption.toString());
    }

    public void lastNameOption(String lastName) {
        sendTextToElement(lastNameOption, lastName);
        log.info("Enter last name : " + lastNameOption.toString());
    }

    public void dateOfBirthDay(String day) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        log.info("select date of birth : " + dateOfBirthDay.toString());
    }

    public void dateOfBirthMonth(String month) {
        selectByVisibleTextFromDropDown(monthOfBirthDay, month);
        log.info("select month of birth : " + monthOfBirthDay.toString());
    }

    public void dateOfBirthYear(String year) {
        selectByVisibleTextFromDropDown(yearOfBirthDay, year);
        log.info("select year of birth : " + yearOfBirthDay.toString());
    }
    public void enterEmailAddress(String emailAddress) {
        sendTextToElement(enterEmailAddress1, emailAddress);
        log.info("Enter email address : " + enterEmailAddress1.toString());
    }


    public void enterPasswordOption(String password) {
        sendTextToElement(enterPasswordOption, password);
        log.info("Enter password : " + enterPasswordOption.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(enterConfirmPassword, confirmPassword);
        log.info("Enter confirm password : " + enterConfirmPassword.toString());
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on register button : " + registerButton.toString());
    }

    public String verifyFirstNameError() {
        log.info("Verify first name error : " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        log.info("Verify first name error : " + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String verifyPasswordError() {
        log.info("Verify password error : " + passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        log.info("Verify confirm password error : " + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }

    public String verifyEmailError() {
        log.info("Verify email error: " + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String verifyRegistrationCompleteMessage() {
        log.info("Verify registration complete message : " + verifyRegistration.toString());
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
        log.info("Click on continue buttom : " + continueTab.toString());
    }
}


