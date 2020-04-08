package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.*;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    //Object for Home Page, Login Page, WelcomeStorePage and WelcomeErrorPage

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    WelcomeStorePage welcomeStorePage = new WelcomeStorePage();
    LoginErrorMessagePage loginErrorMessagePage = new LoginErrorMessagePage();

    /*
     * Navigating to Login Page
     */

    @Test (priority = 0)
    public void verifyUserIsAbletoNavigatetoLoginPage() {
        homePage.setLoginLink();

        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);

    }

    /*
     * Testing Login with valid credentials
     */

    @Test (priority = 1)
    public void verifyUserIsAbleToLoginSuccessfully() {
        homePage.setLoginLink();
        loginPage.waitForVisibilityofElement();
        loginPage.enterReturningUserEmail();
        loginPage.enterReturningUserPassword();
        loginPage.clickonReturningUserLoginButton();
        welcomeStorePage.waitUntilWelcomeStoreisVisible();
        String expectedText = "Welcome to our store";
        String actualText = welcomeStorePage.getWelcomeStoreText();
        Assert.assertEquals(expectedText, actualText);
    }
}
