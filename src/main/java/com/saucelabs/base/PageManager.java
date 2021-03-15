package com.saucelabs.base;

import com.saucelabs.pages.*;

public class PageManager {
    public static LoginPage loginPage;
    public static ItemPage itemPage;
    public static HomePage homePage;
    public static CheckoutPage checkoutPage;
    public static CheckoutStepOne checkoutStepOne;
    public static CheckoutStepTwo checkoutStepTwo;

    public static void initialize() {
        // initialize pages
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        homePage = new HomePage();
        checkoutPage = new CheckoutPage();
        checkoutStepOne = new CheckoutStepOne();
        checkoutStepTwo = new CheckoutStepTwo();
    }
}
