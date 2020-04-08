package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    /*
     * TestBase Page extends to BasePage for the driver.
     * This page is used for browser selection, getting the url
     * And assigning browser open and close methods before and after tests in the tests.
     */

    //Object created for Browser Selector for choosing browser and running the browser

    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://demo.nopcommerce.com/";


    @BeforeMethod
        public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
