package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage {
    WebDriver driver;

    By numberInput = By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterNumber(String number) {
        WebElement input = driver.findElement(numberInput);
        input.clear();
        input.sendKeys(number);
    }

    public String getInputValue() {
        return driver.findElement(numberInput).getAttribute("value");
    }
}
