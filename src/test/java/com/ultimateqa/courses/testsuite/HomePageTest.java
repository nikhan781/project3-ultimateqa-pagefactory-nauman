package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)

public class HomePageTest extends BaseTest {

    //Declaring objects of 2 pages classes
    HomePage homePage;
    LoginPage loginPage;

    //Mehtod to intialize objects of 2 pages classes
    @BeforeMethod(alwaysRun = true)
    public void pageObjects() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        Thread.sleep(1500);
        //Invoking method from Home Page class to click on Sign in button
        homePage.clickOnSignInLink();
        //Invoking method from secure area Page class to verify text
        Assert.assertEquals(loginPage.getWelcomeBackText(), "Welcome Back!", "Sign In Page is not displayed");
    }

}
