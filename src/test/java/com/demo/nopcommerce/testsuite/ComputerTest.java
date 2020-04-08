package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.BuildYourComputerPage;
import com.demo.nopcommerce.pages.ComputersPage;
import com.demo.nopcommerce.pages.DesktopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();

    /*
     * Testing Navigate to Computers Page
     */

    @Test (priority = 0)
    public void verifyUserAbleToNavigateToComputersPage() {
        homePage.mouseOverToComputers();
        String expectedText = "Computers";
        String actualText = computersPage.getComputerText();
        Assert.assertEquals(expectedText, actualText);
    }

    /*
     * Testing Navigate to Desktop Page via Computers Page
     */

    @Test (priority = 1)
    public void verifyUserIsAbleToNavigateToDesktopPageViaComputersPage() {
        homePage.mouseOverToComputers();
        computersPage.clickOnDesktopLink();
        String expectedText = "Desktops";
        String actualText = desktopPage.getDesktopText();
        Assert.assertEquals(expectedText, actualText);
    }
}
