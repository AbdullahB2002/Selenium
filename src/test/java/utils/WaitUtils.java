package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WaitUtils {

    public static WebElement fluentWait(WebDriver driver, By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))  // max wait
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

