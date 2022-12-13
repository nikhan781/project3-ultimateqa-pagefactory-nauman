package com.ultimateqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement welcomeBackText;
    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "user[password]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement errorMessage;


    //This method will get text
    public String getWelcomeBackText() {
        Reporter.log("The welcome Text is " + welcomeBackText.toString());
        CustomListeners.test.log(Status.PASS, "The welcome Text is " + welcomeBackText.toString());
        return getTextFromElement(welcomeBackText);
    }

    //This method will send text to user field
    public void enterEmailId(String emailId) {
        Reporter.log("Enter user name " + emailId + " to username field " + emailField.toString());
        sendTextToElement(emailField, emailId);
        CustomListeners.test.log(Status.PASS, "Enter user name " + emailId);

    }

    //This method will send text to password field
    public void enterPassword(String password) {
        Reporter.log("Enter user name " + password + " to username field " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter user name " + password);

    }

    //This method will click on sign in button
    public void clickOnSignInButton() {
        Reporter.log("Clicking on Login Button " + signInButton.toString());
        clickOnElement(signInButton);
        CustomListeners.test.log(Status.PASS, "Click on Login Button");

    }

    //This method will get error message in case of using invalid credentials
    public String getErrorTextWithInvalidCredentials() {
        Reporter.log("The error message is" + errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "The error message is " + errorMessage.getText());
        return getTextFromElement(errorMessage);
    }
}
