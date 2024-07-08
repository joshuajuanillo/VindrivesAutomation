package Utility;

import Resources.DemoClient;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    public static void checkTableIfEmpty(Integer ReportTable, String DataValue){
        if(DataValue.equalsIgnoreCase("No Data")){
            Assert.assertTrue("Data should have data", 0 > 1);
        }else{
            Assert.assertTrue("Data should have data", 0 < ReportTable);
        }
    }

    public static void checkAllUnkownData(ArrayList<String> column){
        System.out.println("Array List " + column);
        boolean allUnknown = column.stream().allMatch(col -> col.equals("Unknown"));
        System.out.println("All Zero List ? " + allUnknown);
        Assert.assertNotEquals("Values should not be true",true, allUnknown);
    }

    public static void getArrayList(WebElement column){
        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = column.findElements(By.xpath("//tbody/tr/td[3]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }
    }
}
