package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FileUploadPage {
    WebDriver driver;

    By chooseFileInput = By.id("file-upload");
    By uploadButton = By.id("file-submit");
    By uploadedFileName = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(chooseFileInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadedFileName).getText();
    }
}
