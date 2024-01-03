package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    //Desktops text, Sortby, Display, selectProductList Locators and it's actions

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement sortByDisplayDropDown;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;

    public String verifyDesktopsText(){
        log.info("Getting Desktops text from : " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }
    public void selectBySortBySortByDropDown(String sortBy) {
        selectByVisibleTextFromDropDown(sortByDropDown, sortBy);
        log.info("Sorting  : " + sortByDropDown.toString());
    }

    public void selectByDisplayDropDown(String displayBy) {
        selectByVisibleTextFromDropDown(sortByDisplayDropDown, displayBy);
        log.info("Sorting by Display drop down : " + sortByDisplayDropDown.toString());
    }

    public void selectByProductList() {
        clickOnElement(productList);
        log.info("Click on product list : " + productList.toString());
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
        log.info("Click on build your own computer : " + buildYourOwnComputer.toString());
    }
}

