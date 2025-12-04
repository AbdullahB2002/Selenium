package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage lp = new LoginPage(driver);

        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();

        // Wait for dashboard to load (temporary)
        try { Thread.sleep(2000); } catch (Exception e) {}

        // Assertion based on URL
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"),
                "Login failed! Actual URL: " + currentUrl);
    }
}
