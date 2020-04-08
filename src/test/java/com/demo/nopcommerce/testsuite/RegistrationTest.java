package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.pages.RegistrationCompletePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationCompletePage registrationCompletePage = new RegistrationCompletePage();

    /*
     * Navigating to Registration Page
     */


    @Test (priority = 0)
    public void verifyThatUserIsAbleToNavigateToRegisterPage() {
        homePage.setRegisterLink();
        registerPage.setRegisterText();
        String expectedText = "Register";
        String actualText = registerPage.getRegisterText();
        Assert.assertEquals(expectedText, actualText);

    }


    /*
     * Testing Registration with valid credentials
     */

    @Test (priority = 1)
    public void verifyThatNewUserIsAbleToRegisterSuccessfully() {
        homePage.setRegisterLink();
        registerPage.clickOnGenderField();
        registerPage.waitForElementIsVisible();
        registerPage.enterFirstNameField();
        registerPage.enterLastNameField();
        registerPage.setDayOfBirthField();
        registerPage.setMonthOfBirthField();
        registerPage.setYearOfBirthField();
        registerPage.setNewUserEmailField();
        registerPage.setCompanyField();
        registerPage.setNewUserPasswordField();
        registerPage.setConfirmPasswordField();
        registerPage.setNewUserRegisterButton();
        registrationCompletePage.setRegistrationConfirmText();

        String expectedText = "Your registration completed";
        String actualText = registrationCompletePage.getRegistrationConfirmText();
        Assert.assertEquals(expectedText, actualText);
    }

    /*
     * Testing Login with invalid credentials
     * Expected error message
     */

    @Test (priority = 2)
    public void verifyUserisNotAbleToRegisterWithInvalidCredentials() {
        homePage.setRegisterLink();
        registerPage.clickOnGenderField();
        registerPage.waitForElementIsVisible();
        registerPage.enterFirstNameField();
        registerPage.enterLastNameField();
        registerPage.setDayOfBirthField();
        registerPage.setMonthOfBirthField();
        registerPage.setYearOfBirthField();
        registerPage.setNewUserEmailField();
        registerPage.setCompanyField();
        registerPage.setNewUserPasswordField();
        registerPage.setWrongConfirmPasswordField();
        registerPage.setNewUserRegisterButton();
        registerPage.registrationErrorMessageText();

        String expectedErrorMessage = "The password and confirmation password do not match.";
        String actualErrorMessage = registerPage.getRegistrationErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
