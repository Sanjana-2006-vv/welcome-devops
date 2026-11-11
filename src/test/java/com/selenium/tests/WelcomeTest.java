
package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeTest {

    @Test
    public void welcomeMessageTest() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        try {

            System.out.println("=================================");
            System.out.println("       WELCOME TO DEVOPS");
            System.out.println("=================================");

            System.out.println("Selenium Test Case Started");

            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            String title = driver.getTitle();

            System.out.println("Browser Launched Successfully");
            System.out.println("Page Title: " + title);

            Assert.assertEquals(title, "Web form");

            String message = "Welcome to DevOps";

            Assert.assertEquals(message, "Welcome to DevOps");

            System.out.println("Test Case Passed!");
            System.out.println(message);

        } finally {

            driver.quit();

            System.out.println("Browser Closed Successfully");

            System.out.println("=================================");
        }
    }
}
