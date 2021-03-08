package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.HomePage;
import com.saucelabs.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {

    @Given("I am on the login page")
    public void verifyTitle(){
        Assert.assertEquals("Swag Labs", LoginPage.verifyTitle());
    }

    @When("I enter valid username in the username field")
    public void enterValidUsername(){
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @And("I enter valid password in the password field")
    public void enterValidPassword(){
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on the login button")
    public void clickOnLogin(){
        LoginPage.clickOnLoginBtn();
    }

    @Then("I see the home page")
    public void verifyHomePageTitle() {
        Assert.assertEquals("Swag Labs", HomePage.verifyTitle());
    }

    @When("I enter invalid username in the username field")
    public void enterInValidUsername(){
        LoginPage.enterUserName(ConfigReader.getProperty("incorrectusername"));
    }

    @And("I enter invalid password in the password field")
    public void enterInValidPassword(){
        LoginPage.enterPassword(ConfigReader.getProperty("incorrectpassword"));
    }

    @Then("I see the error message")
    public void verifyErrorMessage(){
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", LoginPage.invalidLoginMsg());
    }

}
