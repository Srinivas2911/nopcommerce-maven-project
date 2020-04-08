package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourComputerPage extends Utility {

    By buildYourCompText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By gb400Attribute = By.xpath("//dd[@id='product_attribute_input_3']//li[2]//input[1]");
    By addCartBuildYourCompPage = By.xpath("//input[@id='add-to-cart-button-1']");
    By productAddedText = By.xpath("//p[@class='content']");
    By getProductAddedText = By.xpath("//p[contains(text(),'The product has been added to your')]");

    public void setBuildYourCompTextMsgisDisplsyed() {
        verifyThatTextIsDisplayed(buildYourCompText, "Build your own computer");
    }

    public String setBuildYourCompText() {
        return getTextFromElement(buildYourCompText);
    }

    public void setGb400Attribute() {
        clickOnElement(gb400Attribute);
    }

    public void clickOnAddToCartOnBuilOnCompPage() {
        clickOnElement(addCartBuildYourCompPage);
    }

    public void setGetProductAddedText() {
    verifyThatTextIsDisplayed(productAddedText, "The product has been added to your ");

}
    public String getTextProductAddedToCart(){
        return getTextFromElement(productAddedText);
    }

}
