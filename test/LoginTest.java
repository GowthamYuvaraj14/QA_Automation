package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPageTitle() {
        LoginPage page = new LoginPage(driver);
        String title = page.getTitle();
        Assert.assertTrue(title.contains("Janitri"), "Title should contain 'Janitri'");
    }

    // optional: real login flow if credentials & locators available
    @Test(enabled = false)
    public void loginWithCredentials() {
        LoginPage page = new LoginPage(driver);
        page.enterUsername("testuser");
        page.enterPassword("testpass");
        page.clickLogin();
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
