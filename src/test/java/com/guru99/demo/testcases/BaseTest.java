package com.guru99.demo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;

    // Method to open the Firefox browser and navigate to the website
    @BeforeTest
    public void openBrowser(){
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/V4/");
    }

    // Method to close the browser after test execution
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
