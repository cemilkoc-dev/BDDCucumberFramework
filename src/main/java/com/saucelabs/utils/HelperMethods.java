package com.saucelabs.utils;

import org.openqa.selenium.WebElement;

import static com.saucelabs.base.BasePage.driver;

public class HelperMethods {

    public static void sendText(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
        }
        catch (Exception e) {
            System.out.println("Some exception occurred while sending keys at " + element);
        }
    }

    public static void doClick(WebElement element){
        try {
            element.click();
        }catch (Exception e) {
            System.out.println("Some exception occurred while clicking at " + element);
        }
    }

    public static String doGetPageTitle(){
        try {
            return driver.getTitle();
        }catch (Exception e) {
            System.out.println("Some exception occurred while getting the title");
            return null;
        }
    }

    public static String doGetText(WebElement element){
        try {
            return element.getText();
        }catch (Exception e) {
            System.out.println("Some exception occured while getting the text " + element);
            return null;
        }
    }
}
