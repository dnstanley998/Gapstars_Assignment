package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InputsPage;

public class TestInputs extends TestBase{
    @Test
    public void verifyNumberInputWorks() {
        InputsPage page = new InputsPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickInputsLinkLink();
        page.enterNumber("12345");
        Assert.assertEquals(page.getInputValue(), "12345");
    }
}
