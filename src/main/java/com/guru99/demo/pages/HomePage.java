package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class HomePage {
    @FindBy(linkText = "Demo Site")
    private WebElement demoSiteTitle;

    @FindBy(xpath = "//td[contains(@style, 'color: green')]")
    private WebElement welcomeUserRule;

    // Constructor to initialize the page elements using PageFactory
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Method to read and verify the Demo Site title
    public void readDemoSiteTitle(){
        String actualText = demoSiteTitle.getText();
        String expectedText = "Demo Site";
        if (actualText.equals(expectedText)){
            System.out.println("User has successfully logged in and is on the homepage");
        }
        else {
            System.out.println("User was not able to successfully log in and is not on the homepage");
        }
    }

    // Method to verify the user's role based on the welcome message
    public void verifyUserRule(){
        String actualText = welcomeUserRule.getText();
        String partOfActualText="mngr";
        String anotherPartOfActualText="Manager";
        System.out.print("Logged user Id is: ");
        for (int i=12; i<=actualText.length()-1; i++){
                System.out.print(actualText.charAt(i));

            }
        if (actualText.contains(partOfActualText)){
            System.out.println("\nmanager is logged in");
        } else if (actualText.contains(anotherPartOfActualText)){
            System.out.println("\nmanager is logged in");
        }
        else {
            System.out.println("\ncustomer is logged in");
        }

    }
}
