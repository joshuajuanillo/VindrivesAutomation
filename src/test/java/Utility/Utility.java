package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Utility {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/joshuajuanillo/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }

    public static void selectDropdown(List<WebElement> clickDealer,String dealerName) throws InterruptedException {

        for (WebElement option : clickDealer)
        {
            if (option.getText().equals(dealerName))
            {
                option.click(); // click the desired option
                break;
            }
        }
        Thread.sleep(10000);
    }
}
