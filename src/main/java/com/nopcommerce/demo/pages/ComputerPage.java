package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement mouseHoverOnComputersTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDesktopsLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement clickOnNotebooksLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement clickOnSoftwareLink;


    public String verifyComputersText() {
        log.info("Getting text from : " + computersText.toString());
        return getTextFromElement(computersText);
    }

    public void mouseHoverOnComputersTab() {
        mouseHoverToElementAndClick(mouseHoverOnComputersTab);
        log.info("Mouse hover and click on computers tab : " + mouseHoverOnComputersTab.toString());
    }

    public void clickOnDesktopsTab() {
        clickOnElement(clickOnDesktopsLink);
        log.info("Click on desktops link : " + clickOnDesktopsLink.toString());
    }
    public void clickOnNotebooksLink() {
        clickOnElement(clickOnNotebooksLink);
        log.info("Click on notebooks link : " + clickOnNotebooksLink.toString());
    }
    public void clickOnSoftwareLink() {
        clickOnElement(clickOnSoftwareLink);
        log.info("Click on software link : " + clickOnSoftwareLink.toString());
    }


}
