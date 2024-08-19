package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Utility {
    public static WebDriver driver;

    public static void getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/joshuajuanillo/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
}
