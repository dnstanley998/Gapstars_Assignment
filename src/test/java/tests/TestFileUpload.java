package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.HomePage;

import java.nio.file.Paths;

public class TestFileUpload extends TestBase{
    @Test
    public void verifyFileUpload() {
        FileUploadPage page = new FileUploadPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.open();

        homePage.clickFileUpLinkLinkLink();
        String filePath = Paths.get("src/Data/test.txt").toAbsolutePath().toString();
        String expectedFileName = "test.txt";

        page.uploadFile(filePath);
        String actualFileName = page.getUploadedFileName();

        Assert.assertEquals(actualFileName, expectedFileName, "Uploaded filename incorrect");
    }
}
