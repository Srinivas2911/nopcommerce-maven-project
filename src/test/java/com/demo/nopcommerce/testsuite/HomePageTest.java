package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HomePageTest extends TestBase {


    //Object for Homepage
    HomePage homePage = new HomePage();

    @Test (priority = 0)
    public void verifyThatListofAllElementsDisplayedOnHomePage() {
        homePage.listofWebElementsDisplayed();
            }

    @Test (priority = 1)
    public void verifyThatComputerLinkisDisplayed() {
        homePage.setComputerLink();
        String expectedText = "Computers";
        String actualText = homePage.getComputerText();
        Assert.assertEquals(expectedText, actualText);

    }

   }