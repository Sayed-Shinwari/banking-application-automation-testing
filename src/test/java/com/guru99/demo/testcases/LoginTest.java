package com.guru99.demo.testcases;


import com.guru99.demo.pages.HomePage;
import com.guru99.demo.pages.LandingPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LandingPage landingPage;

    // Test method for login scenario one
    @Test(priority = 1)
    public void loginScenarioOne() throws InterruptedException {
        landingPage = new LandingPage(driver);
        landingPage.enterUserId("invalid user id and valid password");
        landingPage.enterPassword("invalid user id and valid password");
        landingPage.clickBtnLogin();
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "User or Password is not valid";
        if (actualAlertText.equals(expectedAlertText)){
            System.out.println(actualAlertText);
        }
        else {
            System.out.println(expectedAlertText);
        }
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    // Test method fo login scenario two
    @Test(priority = 2)
    public void loginScenarioTwo() throws InterruptedException {
        landingPage = new LandingPage(driver);
        landingPage.enterUserId("valid user id and invalid password");
        landingPage.enterPassword("valid user id and invalid password");
        landingPage.clickBtnLogin();
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "User or Password is not valid";
        if (actualAlertText.equals(expectedAlertText)){
            System.out.println(actualAlertText);
        }
        else {
            System.out.println(expectedAlertText);
        }
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    // Test method for login scenario three
    @Test(priority = 3)
    public void loginScenarioThree() throws InterruptedException {
        landingPage = new LandingPage(driver);
        landingPage.enterUserId("invalid user id and invalid password");
        landingPage.enterPassword("invalid user id and invalid password");
        landingPage.clickBtnLogin();
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "User or Password is not valid";
        if (actualAlertText.equals(expectedAlertText)){
            System.out.println(actualAlertText);
        }
        else {
            System.out.println(expectedAlertText);
        }
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    // Test method for login scenario four
    @Test(priority = 4)
    public void loginScenarioFour() {
        landingPage = new LandingPage(driver);
        landingPage.enterUserId("valid user id and valid password");
        landingPage.enterPassword("valid user id and valid password");
        landingPage.clickBtnLogin();
        HomePage homePage = new HomePage(driver);
        homePage.readDemoSiteTitle();
        homePage.verifyUserRule();
    }
}
