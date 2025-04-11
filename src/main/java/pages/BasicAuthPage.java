package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasicAuthPage {
    WebDriver driver;

    By message = By.cssSelector(".example p");

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUserAndPass(String username, String password) {
        Actions actions = new Actions(driver);
        actions.sendKeys("admin").sendKeys(Keys.TAB).sendKeys("admin").sendKeys(Keys.ENTER).build().perform();
    }

    public String getSuccessMessage() {
        return driver.findElement(message).getText();
    }
}
