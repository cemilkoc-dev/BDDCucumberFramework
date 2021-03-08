package com.saucelabs.stepdefinitions;

import com.saucelabs.base.BasePage;
import com.saucelabs.testutilities.TestUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void start() {
        BasePage.initializeDriver();
    }

    @After
    public void end(Scenario scenario) {

        byte[] picture;
        if (scenario.isFailed()) {
            // take screenshot and save it in /failed
            picture = TestUtil.takeScreenshot("failed/" + scenario.getName());
        } else {
            // take screenshot and put it in /passed folder
            picture = TestUtil.takeScreenshot("passed/" + scenario.getName());
        }

        scenario.attach(picture, "image/png", scenario.getName());

        BasePage.tearDown();
    }

}
