package com.WebDriver.Command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com");
        
        System.out.println("Printing page source:");
        System.out.println(driver.getPageSource());

        System.out.println("Printing current URL:");
        System.out.println(driver.getCurrentUrl());

        System.out.println("Printing page title:");
        System.out.println(driver.getTitle());
       

        driver.quit();
    }
}
