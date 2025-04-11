package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.HomePage;

public class TestDropdown extends TestBase{
    @Test
    public void verifyDropdownSelection() {
        DropdownPage page = new DropdownPage(driver);
        HomePage home = new HomePage(driver);
        home.open();
        home.clickDropdownLinkLink();

        page.selectByVisibleText("Option 1");
        Assert.assertEquals(page.getSelectedOption(), "Option 1", "Option 1 Should be selected");

        }
}
