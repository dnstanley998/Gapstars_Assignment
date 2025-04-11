package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasicAuthPage;
import pages.HomePage;

public class TestBasicAuth extends TestBase{

    public void testBasicAuth() {
        HomePage homePage = new HomePage(driver);
        homePage.open();

        BasicAuthPage authPage = new BasicAuthPage(driver);
        homePage.clickBasicAuthLink();
        authPage.typeUserAndPass("admin", "admin");

        String message = authPage.getSuccessMessage();
        Assert.assertTrue(message.contains("Congratulations"), "Login failed or message not found!");

    }
}
