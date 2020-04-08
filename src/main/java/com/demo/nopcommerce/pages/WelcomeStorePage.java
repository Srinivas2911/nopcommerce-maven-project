package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeStorePage extends Utility {

    //By welcomeStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By welcomeStoreText = By.xpath("//div[@class='topic-block-title']//h2");
    By logOutOnStorePage = By.xpath("//a[@class='ico-logout']");

    public void setWelcomeStoreText (){
        verifyThatTextIsDisplayed(welcomeStoreText, "Welcome to our store");
    }
    public String getWelcomeStoreText() {
        return getTextFromElement(welcomeStoreText);
    }

    public void waitUntilWelcomeStoreisVisible(){
        waitUntilVisibilityOfElementLocated(welcomeStoreText, 40);
    }
    public void LogOutFromWelcomeStorePage (){
        clickOnElement(logOutOnStorePage);
    }
}
