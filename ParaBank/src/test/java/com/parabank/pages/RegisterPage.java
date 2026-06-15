package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    By firstName = By.name("customer.firstName");
    By lastName = By.name("customer.lastName");
    By address = By.name("customer.address.street");
    By city = By.name("customer.address.city");
    By state = By.name("customer.address.state");
    By zip = By.name("customer.address.zipCode");
    By phone = By.name("customer.phoneNumber");
    By ssn = By.name("customer.ssn");
    By username = By.name("customer.username");
    By password = By.name("customer.password");
    By confirmPassword = By.name("repeatedPassword");

    By registerButton = By.xpath("//input[@value='Register']");
    
    public void registerUser(String uname, String pwd) throws InterruptedException {

        driver.findElement(firstName).sendKeys("Hemanth");
        Thread.sleep(1000);

        driver.findElement(lastName).sendKeys("Kumar");
        Thread.sleep(1000);

        driver.findElement(address).sendKeys("4-27 , pothuru");
        Thread.sleep(1000);

        driver.findElement(city).sendKeys("Guntur");
        Thread.sleep(1000);

        driver.findElement(state).sendKeys("Andhra Pradesh");
        Thread.sleep(1000);

        driver.findElement(zip).sendKeys("522005");
        Thread.sleep(1000);

        driver.findElement(phone).sendKeys("9391941256");
        Thread.sleep(1000);

        driver.findElement(ssn).sendKeys("12345");
        Thread.sleep(1000);

        driver.findElement(username).sendKeys(uname);
        Thread.sleep(1000);

        driver.findElement(password).sendKeys(pwd);
        Thread.sleep(1000);

        driver.findElement(confirmPassword).sendKeys(pwd);
        Thread.sleep(1000);

        driver.findElement(registerButton).click();
    }
}
