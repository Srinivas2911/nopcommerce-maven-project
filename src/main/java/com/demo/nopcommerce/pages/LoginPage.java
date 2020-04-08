package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginWelcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By loginEmailField = By.id("Email");
    By loginPasswordField = By.xpath("//input[@name='Password']");
    By rememberMeCheckBox = By.xpath("//label[contains(text(),'Remember me?')]");
    By forgotPasswordLink = By.xpath("//a[contains(text(),'Forgot password?')]");
    By loginUserButton = By.xpath("//input[@class='button-1 login-button']");

    public void welcomeSignInPage() {
        verifyThatTextIsDisplayed(loginWelcomeText, "Welcome, Please Sign In!");
    }
    public String getWelcomeText() {
        return getTextFromElement(loginWelcomeText);
    }

    public void waitForVisibilityofElement(){
        waitUntilVisibilityOfElementLocated(loginEmailField, 90);
    }

    public void enterReturningUserEmail() {
        sendTextToElement(loginEmailField, "Roger123@gmail.com" );
    }

    public void enterReturningUserPassword() {
        sendTextToElement(loginPasswordField,"Roger1980" );
    }

    public void enterReturningUserWrongPassword() {
        sendTextToElement(loginPasswordField, "1213131");
    }

    public void clickonReturningUserLoginButton() {
        clickOnElement(loginUserButton);
    }
    public void setRememberMeCheckBox() {
        sendTextToElement(rememberMeCheckBox, "");
    }

    public void setForgotPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }
}
