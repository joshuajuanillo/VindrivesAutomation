package Utility;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class Utility {
    public static String DealerName = "";
    public static String vehicleType = "";
    public static WebDriver driver;

    public static void getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/joshuajuanillo/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
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

    public static void checkAllZeroData(ArrayList<Integer> tippableCargurus){
        System.out.println("Array List " + tippableCargurus);
        boolean allZeros = tippableCargurus.stream().allMatch(num -> num == 0);
        System.out.println("All Zero List ? " + allZeros);
        Assert.assertNotEquals("Values should not be true",true, allZeros);
    }

    public static void checkTableIfEmpty(Integer ReportTable){
        Assert.assertTrue("Value should be greater than 3", 3 < ReportTable);
    }
}
