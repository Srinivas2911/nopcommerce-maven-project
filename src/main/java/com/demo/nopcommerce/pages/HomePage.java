package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
/* Homepage extends to Utility for the methods that needs to be performed.
* Listing all the elements through their locators
 */
    By tagName = By.tagName("a");
    By logoLink = By.xpath("//div[@class='header-logo']//a//img");
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By wishListLink = By.xpath("//span[@class='wishlist-label']");
    By shoppingCartLink = By.className("cart-label");
    //By computerLink = By.xpath("//body/div[@class='master-wrapper-page']/div[@class='header-menu']/ul[@class='top-menu notmobile']/li[1]/a[1]");
    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.partialLinkText("Electroni");

    By apparelLink = By.partialLinkText("Appar");
    By digitalDownloadLink = By.partialLinkText("Digital downloa");
    By booksLink = By.partialLinkText("Books");
    By jewelryLink = By.partialLinkText("Jewel");
    By giftCardsLink = By.partialLinkText("Gift Car");
    By searchStoreField = By.xpath("//input[@name='q']");
    By searchButton = By.xpath("//input[@class='button-1 search-box-button']");
    By subDesktopLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Desktops')]");
    By subNoteBooksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Notebooks')]");
    By subSoftwareLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Software')]");
    By subCameraAndPhotoLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Camera & photo')]");
    By subCellPhonesLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]");
    By subOthersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Others')]");

    public void listofWebElementsDisplayed(){
        webElementList(tagName);
        System.out.println(webElementList(tagName));
        }

    public String getListofWebElementsDisplayed (){
        return getTextFromElement(tagName);
       }

    public void setLogoLink() {
        verifyThatElementIsDisplayed(logoLink);
    }
    public void registerLinkIsDisplayed(){
        verifyThatTextIsDisplayed(registerLink, "Register ");
    }
    public void setRegisterLink() {
        clickOnElement(registerLink);
    }
    public void setLoginLink() {
        clickOnElement(loginLink);
    }
    public void setComputerLink() {
        clickOnElement(computerLink);
    }
        public String getComputerText(){
            return getTextFromElement(computerLink);
    }
    public void mouseOverToComputers() {
        mouseHoverToElementAndClick(computerLink);
    }
    public void setSubDesktopLink(){
        verifyThatTextIsDisplayed(subDesktopLink, "Desktops ");
    }
    public void setSubNoteBooksLink (){
        verifyThatTextIsDisplayed(subNoteBooksLink, "Notebooks ");
    }
    public void setSubSoftwareLink (){
        verifyThatTextIsDisplayed(subSoftwareLink, "Software  ");
    }
    public void selectDeskTopLinkFromDropDown() {
        selectByVisibleTextFromDropDown(subDesktopLink, "Desktops ");
    }
    public void selectNotebooksFromDropDown() {
        selectByVisibleTextFromDropDown(subNoteBooksLink, "Notebooks ");
    }
    public void selectSoftwareFromDropDown() {
        selectByVisibleTextFromDropDown(subSoftwareLink, "Software ");
    }
    public void setElectronicsLink() {
        clickOnElement(electronicsLink);
    }
    public void mouseOverToElectronics() {
        mouseHoverToElementAndClick(electronicsLink);
    }

public void setSubCameraAndPhotoLink (){
        verifyThatTextIsDisplayed(subCameraAndPhotoLink, "Camera & photo ");
}

public void setSubCellPhonesLink(){
        verifyThatTextIsDisplayed(subCellPhonesLink, "Cell phones ");
}
    public void selectCameraAndPhotoFromDropDown() {
        selectByVisibleTextFromDropDown(subCameraAndPhotoLink, "Camera & photo ");
    }
    public void selectCellPhonesfromDropDown() {
        selectByVisibleTextFromDropDown(subCellPhonesLink, "Cell phones ");
    }
    public void selectOthersFromdopDown() {
        selectByVisibleTextFromDropDown(subOthersLink, "Others ");
    }

    public void setBooksLink() {
        clickOnElement(booksLink);
    }

    public void mouseOverToBooks() {
        mouseHoverToElementAndClick(booksLink);
    }

}
