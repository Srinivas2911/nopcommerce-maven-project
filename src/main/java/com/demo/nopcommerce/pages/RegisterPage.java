package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    String email = null;
    String password = "Roger1980";

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By personalDetailsText = By.xpath("//strong[contains(text(),'Your Personal Details')]");
    By genderMaleRadioButton = By.id("gender-male");
    By firstNameField = By.xpath("//input[@name='FirstName']");
    By lastNameField = By.xpath("//input[@name='LastName']");
    By dayOfBirthField = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirthField = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirthField = By.xpath("//select[@name='DateOfBirthYear']");
    By newUserEmailField = By.xpath("//input[@name='Email']");
    By companyField = By.xpath("//input[@name='Company']");
    By newUserPasswordField = By.xpath("//input[@name='Password']");
    By confirmPasswordField = By.xpath("//input[@name='ConfirmPassword']");
    By newUserRegisterButton = By.xpath("//input[@name='register-button']");
    By registrationErrorMessage = By.xpath("//span[@id='ConfirmPassword-error']");

    public void setRegisterText() {
        verifyThatTextIsDisplayed(registerText, "Register");
    }

    public String getRegisterText (){
        return getTextFromElement(registerText);
    }

    public void clickOnGenderField() {
        clickOnElement(genderMaleRadioButton);
    }

    public void waitForElementIsVisible() {
        waitUntilElementToBeClickable(firstNameField, 20);
    }

    public void enterFirstNameField() {
        sendTextToElement(firstNameField, "Roger");
    }

    public void enterLastNameField() {
        sendTextToElement(lastNameField, "Moore");
    }

    public void setDayOfBirthField() {
        selectByVisibleTextFromDropDown(dayOfBirthField, "1");
    }

    public void setMonthOfBirthField() {
        selectByVisibleTextFromDropDown(monthOfBirthField, "January");
    }

    public void setYearOfBirthField() {
        selectByVisibleTextFromDropDown(yearOfBirthField, "1980");
    }

    public void setNewUserEmailField() {
        sendTextToElement(newUserEmailField, email = "Roger" + getRandomString(4) + "@gmail.com");
    }

    public void setCompanyField() {
        sendTextToElement(companyField, "Roger Moore International");
    }

    public void setNewUserPasswordField() {
        sendTextToElement(newUserPasswordField, password);
    }

    public void setConfirmPasswordField() {
        sendTextToElement(confirmPasswordField, password);
    }

    public void setWrongConfirmPasswordField() {
        sendTextToElement(confirmPasswordField, password = "Roger77777");
    }

    public void setNewUserRegisterButton() {
        mouseHoverToElementAndClick(newUserRegisterButton);
    }

    public void registrationErrorMessageText() {
        verifyThatTextIsDisplayed(registrationErrorMessage, "The password and confirmation password do not match.");
    }

    public String getRegistrationErrorMessage() {
        return getTextFromElement(registrationErrorMessage);
    }
}
