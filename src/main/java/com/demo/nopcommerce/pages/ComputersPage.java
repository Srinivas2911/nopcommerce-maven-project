package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    By computerText = By.xpath("//div[@class='page-title']//h1");
    By desktopLink = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By noteBookLink = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    By getNoteBookLink = By.partialLinkText("Noteboo");
    By softwareLink = By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");


    public void setComputerText(){
        verifyThatTextIsDisplayed(computerText, "Computers");
    }

    public String getComputerText() {
        return getTextFromElement(computerText);
    }

    public void setDesktopLink() {
        verifyThatTextIsDisplayed(desktopLink, " Desktops ");
    }

    public String getDesktopText() {
        return getTextFromElement(desktopLink);
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
    }

    public void setNoteBookLink() {
        verifyThatTextIsDisplayed(getNoteBookLink, " Notebooks ");
    }

    public void setGetNoteBookLink() {
        clickOnElement(noteBookLink);
    }

    public void setSoftwareLink() {
        verifyThatTextIsDisplayed(softwareLink, " Software ");
    }

    public void setGetSoftwareLink() {
        clickOnElement(softwareLink);
    }

}
