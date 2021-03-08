package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;

public class HomePage {

    public static String verifyTitle(){
       return HelperMethods.doGetPageTitle();
    }
}
