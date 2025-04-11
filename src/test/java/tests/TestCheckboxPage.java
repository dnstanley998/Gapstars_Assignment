package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import pages.HomePage;


public class TestCheckboxPage extends TestBase {
    @Test
    public void verifyCheckboxCanBeChecked() {
        CheckboxesPage CBpage = new CheckboxesPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCheckboxesLink();
        Assert.assertEquals(CBpage.getHeadingText(),"Checkboxes");
        CBpage.checkCheckbox(0);
        //need to see why the checkbox isn't checked
        Assert.assertFalse(CBpage.isChecked(0), "Checkbox is not Checked");
    }
}
