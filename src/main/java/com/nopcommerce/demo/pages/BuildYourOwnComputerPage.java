package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]" )
    WebElement verifyBuildYourOwnComputerText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorOption;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']" )
    WebElement ramOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectHddOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement OsOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement selectSoftwareOption;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTextFromPriceHeading;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']" )
    WebElement clickOnAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
    WebElement productAddedToCartText;


    public String verifyBuildYourOwnComputerText() {
        log.info("Getting text from : " + verifyBuildYourOwnComputerText.toString());
        return getTextFromElement(verifyBuildYourOwnComputerText);
    }
    public void processorOption(String processor){
        selectByVisibleTextFromDropDown(processorOption,processor);
        log.info("Selecting processor option : " + processorOption.toString());
    }


    public void selectRamOption(String ram){
        selectByVisibleTextFromDropDown(ramOption, ram);
        log.info("Selecting ram option : " + ramOption.toString());
    }

    public void selectHddOption(String hdd){
        clickOnElement(selectHddOption);
        log.info("Selecting Hdd option : " + selectHddOption.toString());
    }
    public void clickOnOsOption(String Os){
        clickOnElement(OsOption);
        log.info("Selecting Os option : " + OsOption.toString());
    }
    public void selectSoftwareOption(String software1){
        clickOnElement(selectSoftwareOption);
        log.info("Selecting software option : " + selectSoftwareOption.toString());
    }
    public String verifyTextFromPriceHeading(){
        log.info("Getting text from : " + verifyTextFromPriceHeading.toString());
        return getTextFromElement(verifyTextFromPriceHeading);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
        log.info("Click on Add to cart button : " + clickOnAddToCartButton.toString());
    }
    public String productAddedToCartText() {
        log.info("Getting text from : " + productAddedToCartText.toString());
        return getTextFromElement(productAddedToCartText);
    }
}
