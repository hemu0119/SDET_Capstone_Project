package com.parabank.utils;

import org.openqa.selenium.WebElement;

public class Utility {

    public static String getUniqueUsername() {
        return "user" + System.currentTimeMillis();
    }

    public static void typeSlowly(WebElement element, String text)
            throws InterruptedException {

        for (char c : text.toCharArray()) {
            element.sendKeys(String.valueOf(c));
            Thread.sleep(200);
        }
    }
}