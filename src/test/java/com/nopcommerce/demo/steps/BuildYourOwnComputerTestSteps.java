package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BuildYourOwnComputerTestSteps {
    @And("User should click on Build your own computer product")
    public void userShouldClickOnBuildYourOwnComputerProduct() {
        new DesktopsPage().clickOnBuildYourOwnComputer();

    }

    @Then("User should navigate to build your own computer page")
    public void userShouldNavigateToBuildYourOwnComputerPage() {
        System.out.println("user navigates to build your own computer page");
    }


    @And("User select processor {string}")
    public void userSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().processorOption(processor);
    }

    @And("User select RAM {string}")
    public void userSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRamOption(ram);
    }

    @And("User select HDD {string}")
    public void userSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHddOption(hdd);
    }

    @And("User select Os {string}")
    public void userSelectOs(String os) {
        new BuildYourOwnComputerPage().clickOnOsOption(os);
    }

    @And("User select software {string}")
    public void userSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftwareOption(software);
    }

    @And("User click on Add to cart button")
    public void userClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("User verify message the {string}")
    public void userVerifyMessageThe(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().productAddedToCartText(), message, "Incorrect message displayed");
}
}