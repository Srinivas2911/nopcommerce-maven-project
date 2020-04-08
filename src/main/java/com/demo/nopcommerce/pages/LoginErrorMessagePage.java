package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginErrorMessagePage extends Utility {

  By errorMessageText = By.xpath("//div[@class='message-error validation-summary-errors']");
    //div[@class='message-error validation-summary-errors']


//    By errorMessageText = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]");

    public void waitUntilErrorMessageisVisible(){
        waitUntilVisibilityOfElementLocated(errorMessageText,90);
    }


    public void setErrorMessageText(){
        verifyThatTextIsDisplayed(errorMessageText, "Login was unsuccessful. Please correct the errors and try again.\n + The credentials provided are incorrect");
    }

    public String getErrorMessageText() {
        return getTextFromElement(errorMessageText);
    }

}
