package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucelabs.base.BasePage.driver;

public class CheckoutPage {

    @FindBy(xpath = "//*[@id='cart_contents_container']/div/div[2]/a[2]")
    private static WebElement checkoutBtn;

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    public static void clickOnCheckout(){
        HelperMethods.doClick(checkoutBtn);
    }

}
