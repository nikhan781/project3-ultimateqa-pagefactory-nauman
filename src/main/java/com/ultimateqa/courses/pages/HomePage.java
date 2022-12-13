package com.ultimateqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInLink;

    //This method will click on Sign in link
    public void clickOnSignInLink() {
        Reporter.log("Clicking on Signin Button " + signInLink.toString());
        clickOnElement(signInLink);
        CustomListeners.test.log(Status.PASS, "Click on Login Button");

    }

}
