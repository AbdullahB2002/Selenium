package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverManager;

public class DriverFactory implements DriverManager {
	 private WebDriver driver;

	    // Constructor Initialization
	    public DriverFactory() {
	        System.out.println("DriverFactory Constructor Called");
	    }

	    @Override
	    public WebDriver createDriver() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        return driver;
	    }
	}

