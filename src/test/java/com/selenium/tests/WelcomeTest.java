
package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeTest {

    @Test
    public void welcomeMessageTest() {

        System.out.println("=================================");
        System.out.println("       WELCOME TO DEVOPS");
        System.out.println("=================================");

        String message = "Welcome to DevOps";

        System.out.println("Selenium Test Case Started");

        Assert.assertEquals(message, "Welcome to DevOps");

        System.out.println("Test Case Passed!");
        System.out.println(message);

        System.out.println("=================================");
    }
}
