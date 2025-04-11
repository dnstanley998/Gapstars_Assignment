package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;

public class TestHomePage extends TestBase{

    @Test
    public void verifyHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        String headingText = homePage.getHeadingText();
        Assert.assertEquals(headingText, "Welcome to the-internet", "Incorrect Heading");


    }

}
