package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.saucelabs.base.BasePage.driver;

public class HomePage {
    @FindBy(xpath = "//div[@class='app_logo']")
    private static WebElement appLogo;

    @FindBy(xpath = "//div[@class = 'inventory_item_name']")
    private static List<WebElement> itemList;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public static boolean isLogoDisplayed() {
        return HelperMethods.doIsDisplayed(appLogo);
    }

    public static String verifyTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static void clickItem(String itemName) {
        for (WebElement item : itemList) {
            if (item.getText().equals(itemName)) {
                HelperMethods.doClick(item);
                break;
            }
        }
    }

}
