package com.demo.nopcommerce.basepage;

import org.openqa.selenium.WebDriver;

public class BasePage {

    /*    assigning Webdriver as driver as a static variable
     *    all BrowserSelector, Utility, and TestBase pages are extended to the BasePage for driver
     *    driver in BasePage is responsible fr locating all the elements of the project
     */
    public static WebDriver driver;

}
