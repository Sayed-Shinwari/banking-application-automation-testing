package com.guru99.demo.testcases;

import com.guru99.demo.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    // Test method for the home page
    @Test
    public void homePage(){
        HomePage homePage = new HomePage(driver);
        homePage.readDemoSiteTitle();
    }
}
