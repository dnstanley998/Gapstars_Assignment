package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckboxesPage{
    WebDriver driver;
    By checkboxes = By.xpath("//*[@id=\"checkboxes\"]");

    By heading = By.tagName("h3");
    public String getHeadingText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(heading));
        return driver.findElement(heading).getText();
    }

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllCheckboxes() {
        return driver.findElements(checkboxes);
    }

    public void checkCheckbox(int index) {
        WebElement checkbox = getAllCheckboxes().get(index);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isChecked(int index) {
        return getAllCheckboxes().get(index).isSelected();
    }

}
