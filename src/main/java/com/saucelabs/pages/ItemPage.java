package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucelabs.base.BasePage.driver;

public class ItemPage {

    @FindBy(xpath= "//button[text()='ADD TO CART']")
    private static WebElement addBtn;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    private static WebElement shoppingCard;

    public ItemPage() {
        PageFactory.initElements(driver, this);

    }

    public static void clickAddToCart(){
        HelperMethods.doClick(addBtn);
    }

    public static void clickShoppingCard(){
        HelperMethods.waitForVisibility(shoppingCard);
        HelperMethods.doClick(shoppingCard);
    }
}
