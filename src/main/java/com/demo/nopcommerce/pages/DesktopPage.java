package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By desktopText = By.xpath("//h1[contains(text(),'Desktops')]");
    By buildYourCompLink = By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own computer')]");
    By digitalStormlink = By.xpath("//a[contains(text(),'Digital Storm VANQUISH 3 Custom Performance PC')]");
    By lenovaIdeaCentLink = By.xpath("//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]");
    By wishLishBtn = By.className("button-2 add-to-wishlist-button");

    public void setDesktopText() {
        verifyThatTextIsDisplayed(desktopText, "Desktops");
    }
    public String getDesktopText() {
        return getTextFromElement(desktopText);
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopText);
    }
    public void waitForElementToDisplay(){
        waitUntilElementToBeClickable(buildYourCompLink,20);
    }

    public void clickOnBuildYourOwnComputerLink() {
        clickOnElement(buildYourCompLink);
    }
    public void clickOnWishListButton (){
        clickOnElement(wishLishBtn);
            }


}