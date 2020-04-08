package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationCompletePage extends Utility {

    By registrationConfirmText = By.xpath("//div[@class='result']");
    By registrationContinueButton = By.xpath("//input[@name='register-continue']");

    public void setRegistrationConfirmText(){
        verifyThatTextIsDisplayed(registrationConfirmText, "Your registration completed");
            }
    public String getRegistrationConfirmText() {
        return getTextFromElement(registrationConfirmText);

    }

    public void setRegistrationContinueButton(){
        clickOnElement(registrationContinueButton);
            }
}
