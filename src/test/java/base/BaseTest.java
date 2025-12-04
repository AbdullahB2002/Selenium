package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        DriverFactory factory = new DriverFactory();
        driver = factory.createDriver();

        driver.manage().window().maximize();

        // TODO: update with your actual application login URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
