package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By desktopPageText = By.xpath("//div[@class='page-title']//h1");

    public void setDesktopPageText (){
        verifyThatTextIsDisplayed(desktopPageText, "Desktops");
            }

            public String getDesktopPageText(){
        return getTextFromElement(desktopPageText);
            }


}
