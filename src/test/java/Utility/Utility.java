package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Utility {
    public static WebDriver driver;

    public static void getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Setup WebDriverManager to manage ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }

    public static boolean isElementExists(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
