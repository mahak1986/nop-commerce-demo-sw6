package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath ="//ul[@class = 'top-menu notmobile']" )
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopcommerceLogo;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='My account']")
    WebElement clickOnMyAccountLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']/li")
    List<WebElement> menuTop;

    public void selectTopMenu(String topMenu) {
        for (WebElement allMenu : menuTop) {
            if (allMenu.getText().equalsIgnoreCase(topMenu)) {
                clickOnElement(allMenu);
                break;
            }
        }
    }
    public boolean nopCommerceLogoIsDisplayed() {
        log.info("Getting text from : " + nopcommerceLogo.toString());
        return nopcommerceLogo.isDisplayed();
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        log.info("Click on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        log.info("Click on login link : " + registerLink.toString());
    }

    public void clickOnMyAccountLink(){
        clickOnElement(clickOnMyAccountLink);
        log.info("Click on My accounts link : " + clickOnMyAccountLink.toString());
    }
    public void clickOnTopMenu(){
        clickOnElement(topMenu);
        log.info("Click on top menu : " + topMenu.toString());
    }
}
