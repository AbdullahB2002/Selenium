package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By username = By.cssSelector("input[name='username']");
    private By password = By.cssSelector("input[name='password']");
    private By loginBtn = By.cssSelector("button[type='submit']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions
    public void enterUsername(String uname) {
        WebElement ele = WaitUtils.fluentWait(driver, username);
        ele.clear();          // clear any pre-filled value
        ele.sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        WebElement ele = WaitUtils.fluentWait(driver, password);
        ele.clear();
        ele.sendKeys(pwd);
    }

    public void clickLogin() {
        WebElement ele = WaitUtils.fluentWait(driver, loginBtn);
        ele.click();
    }
}
