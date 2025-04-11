package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By heading = By.tagName("h1");

    By ABTestingLink = By.linkText("A/B Testing");
    By BasicAuthLink = By.linkText("Basic Auth");
    By CheckboxesLink = By.linkText("Checkboxes");
    By DropdownLink = By.linkText("Dropdown");
    By InputsLink = By.linkText("Inputs");
    By FileUpLink = By.linkText("File Upload");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void clickABTesting() {
        driver.findElement(ABTestingLink).click();
    }

    public void clickBasicAuthLink() {
        driver.findElement(BasicAuthLink).click();
    }

    public void clickCheckboxesLink() {
        driver.findElement(CheckboxesLink).click();
    }

    public void clickDropdownLinkLink() {
        driver.findElement(DropdownLink).click();
    }
    public void clickInputsLinkLink() {
        driver.findElement(InputsLink).click();
    }
    public void clickFileUpLinkLinkLink() {
        driver.findElement(FileUpLink).click();
    }
}
