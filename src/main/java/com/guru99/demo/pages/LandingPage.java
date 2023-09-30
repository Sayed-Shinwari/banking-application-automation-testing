package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage {

    @FindBy(name = "uid")
    private WebElement userId;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "btnLogin")
    private WebElement btnLogin;

    // Constructor to initialize the page elements using PageFactory
    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Method to enter the user ID based on different scenarios
    public void enterUserId(String username) {

            // Handle different username scenarios
            if (username.equals("valid user id and valid password")) {
                userId.sendKeys("cant show username");
            } else if (username.equals("invalid user id and valid password")) {
                userId.sendKeys("cant show username");
            } else if (username.equals("valid user id and invalid password")) {
                userId.sendKeys("cant show username");
            } else if (username.equals("invalid user id and invalid password")) {
                userId.sendKeys("cant show username");
            } else {
                System.out.println("User or Password is not valid");
            }
        }

    // Method to enter the user password based on different scenarios
    public void enterPassword(String userPassword) {

            // Handle different password scenarios
            if (userPassword.equals("valid user id and valid password")) {
                password.sendKeys("cant show password");
            } else if (userPassword.equals("invalid user id and valid password")) {
                password.sendKeys("cant show password");
            } else if (userPassword.equals("valid user id and invalid password")) {
                password.sendKeys("cant show password");
            } else if (userPassword.equals("invalid user id and invalid password")) {
                password.sendKeys("cant show password");
            } else {
                System.out.println("User or Password is not valid");
            }

        }

        // Method to click the Login button
        public void clickBtnLogin(){
        btnLogin.click();
    }

}
