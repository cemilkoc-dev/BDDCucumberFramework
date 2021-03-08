package com.saucelabs.base;

import com.saucelabs.pages.LoginPage;

public class PageManager {
    public static LoginPage loginPage;

    public static void initialize() {
        // initialize pages
        loginPage = new LoginPage();
    }
}
