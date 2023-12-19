package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopsPageSteps {
    @Then("User clicks on desktops link")
    public void userClicksOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsTab();
    }

    @Then("User verifies Desktops text")
    public void userVerifiesDesktopsText() {
        String expected = "Desktops";
        String actual = new DesktopsPage().verifyDesktopsText();
        Assert.assertEquals(actual,expected,"Desktops text not displayed");
    }

    @Then("User navigates to Desktops page")
    public void userNavigatesToDesktopsPage() {
        System.out.println("user is on desktops page");
    }
}
