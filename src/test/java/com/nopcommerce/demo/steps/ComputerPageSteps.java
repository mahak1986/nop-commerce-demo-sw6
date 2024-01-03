package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ComputerPageSteps {
    @And("User clicks on computer tab")
    public void userClicksOnComputerTab() {
        new ComputerPage().mouseHoverOnComputersTab();
    }

    @Then("User navigates to computer page")
    public void userNavigatesToComputerPage() {
        System.out.println("User navigates to computers page");
    }

    @Then("User verifies Computer text")
    public void userVerifiesComputerText() {
        String expected = "Computers";
        String actual = new ComputerPage().verifyComputersText();
        Assert.assertEquals(actual,expected,"Computers text not displayed");
    }
}
