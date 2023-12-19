package com.nopcommerce.demo.steps;


import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;

import java.util.UUID;

public class Hooks extends Utility {

    public String randomEmail = randomEmail();
    By emailAddressOption = By.id("Email");
    public void enterEmailAddress(){
        sendTextToElement(emailAddressOption, randomEmail);
    }

    private static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        } else if (!scenario.isFailed()) {
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
            closeBrowser();

        }
    }
}
