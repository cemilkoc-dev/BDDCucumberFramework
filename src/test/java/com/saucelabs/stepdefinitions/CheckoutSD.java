package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CheckoutSD {

    @Given("user is actually successfully logged in")
    public void verifyUserLoggedIn() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
        LoginPage.clickOnLoginBtn();
        Assert.assertEquals("Swag Labs", HomePage.verifyTitle());
        Assert.assertTrue(HomePage.isLogoDisplayed());
    }

    @When("I click on item with name {string}")
    public void clickOnTheItemWithName(String itemName) {
        HomePage.clickItem(itemName);
    }

    @When("I click on the ADD TO CART button")
    public void clickOnAddToCart() {
        ItemPage.clickAddToCart();
    }

    @When("I click on the shopping cart button")
    public void clickOnShoppingCart() {
        ItemPage.clickShoppingCard();
    }

    @When("I click on the checkout button")
    public void clickOnTheCheckoutBtn() {
        CheckoutPage.clickOnCheckout();
    }

    @When("I enter the order information as {string}, {string}, and {string}")
    public void enterTheOrderInformation(String firstName, String lastName, String zipCode) {
        CheckoutStepOne.sendOrderInformation(firstName, lastName, zipCode);
    }

    @When("I click on continue button")
    public void clickOnContinueBtn() {
        CheckoutStepOne.clickContinue();
    }

    @Then("I verify the item name matches that of {string}")
    public void i_verify_the_item_name_matches_that_of(String itemName) {
        Assert.assertEquals(itemName, CheckoutStepTwo.getItemName());
    }

    @When("I provide the dataTable info")
    public void i_provide_the_data_table_info(DataTable dataTable) {

        System.out.println("1. -------------   ");
        System.out.println(dataTable);

        System.out.println("2. -------------");
        List<Map<String, String>> mapList = dataTable.asMaps();
        System.out.println(mapList);

        for( Map<String, String> map : mapList)
        {
            System.out.println(map);
        }

        System.out.println("3. ----------");
        List<String> list = dataTable.asList();
        System.out.println(list);

        System.out.println("4. ---------");
        List<List<String>> lists = dataTable.asLists();
        System.out.println(lists);

        //here we implement the logic

    }
}
