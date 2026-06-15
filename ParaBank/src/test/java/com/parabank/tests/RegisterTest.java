package com.parabank.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.parabank.base.BaseClass;
import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPage;
import com.parabank.utils.ExtentManager;
import com.parabank.utils.Utility;

public class RegisterTest extends BaseClass {

    @Test
    public void registerAndLoginTest() throws InterruptedException {

        // Create Extent Report
        ExtentReports extent = ExtentManager.getReportInstance();

        // Create Test
        ExtentTest test = extent.createTest("Register And Login Test");

        // Launch Browser
        setup();

        // Open Application
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        test.info("Application Opened");

        // Generate Unique Username
        String username = Utility.getUniqueUsername();

        String password = "Test123";

        // Register User
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.registerUser(username, password);

        test.pass("Registration Completed");

        // Verify Registration
        String pageText = driver.getPageSource();

        if (pageText.contains("Welcome")) {

            test.pass("Registration Verified");
        }

        // Wait for 3 seconds
        Thread.sleep(3000);

        // Logout
        driver.findElement(By.linkText("Log Out")).click();

        test.pass("Logout Successful");

        // Wait for 3 seconds
        Thread.sleep(1500);

        // Login Again
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        test.pass("Login Successful");

        // Wait for 10 seconds before closing browser
        Thread.sleep(2000);

        // Generate Report
        extent.flush();

        // Close Browser
        tearDown();
    }
}