package steps;

import Resources.Common;
import Resources.DemoClient;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import Utility.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class common {

    @Before("@setup") public static void setup() throws InterruptedException {
        Utility.getDriver();
        Utility.driver.get("https://vindrives.app");
        Utility.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Utility.driver.findElement(By.cssSelector("input[name=email]")).sendKeys("jjuanillo@dealercmo.com");
        Utility.driver.findElement(By.cssSelector("input[name=password]")).sendKeys("!Pass1234");
        Thread.sleep(30000);
        Utility.driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        Thread.sleep(10000);
    }

    @And("I select {string}")
    public void i_select(String dealerName) throws InterruptedException {
        WebElement dropdown = Utility.driver.findElement(By.xpath("//button[@id='menu-button-:rd:']"));
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        GlobalUtility.DealerName = dealerName;
        System.out.println(GlobalUtility.DealerName);
        List<WebElement> TestDealer = dropdown.findElements(By.xpath("//button[contains(text(),'"+ dealerName +"')]"));
        System.out.println(TestDealer);
        GlobalUtility.selectDropdown(TestDealer,dealerName);

        Thread.sleep(10000);
    }

    @And("I select vehicle type {string}")
    public void i_select_vehicle_type(String vehiclyType) throws InterruptedException {
        WebElement dropdown = Utility.driver.findElement(By.xpath("//button[@id='menu-button-:r9:']"));
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        GlobalUtility.vehicleType = vehiclyType;
        switch (vehiclyType){
            case "Used Inventory":
                  dropdown.findElement(By.xpath(Common.VehicleTypeUsed)).click();
//                List<WebElement> usedInventory = dropdown.findElements(By.xpath(Common.VehicleTypeUsed));
//                GlobalUtility.selectDropdown(usedInventory,"Used Inventory");
                break;
            case "New Inventory" :
                  dropdown.findElement(By.xpath(Common.VehicleTypeNew)).click();
//                List<WebElement> newInventory = dropdown.findElements(By.xpath(Common.VehicleTypeNew));
//                GlobalUtility.selectDropdown(newInventory,"New Inventory");
                break;
        }
        Thread.sleep(10000);
    }

    @Then("I click {string}")
    public void i_click_last_7_days(String DateFilter) throws InterruptedException {
        Utility.driver.findElement(By.xpath(Common.LastSevenDays)).click();
        switch (DateFilter) {
            case "Last 7 Days":
                Utility.driver.findElement(By.xpath(Common.LastSevenDays)).click();
                break;
            case "Last Month":
                Utility.driver.findElement(By.xpath(Common.LastMonth)).click();
                break;
            case "Last 30 Days":
                Utility.driver.findElement(By.xpath(Common.LastThirtyDays)).click();
                break;
            case "Last 60 Days":
                Utility.driver.findElement(By.xpath(Common.LastSixtyDays)).click();
                break;
            case "Last 90 Days":
                Utility.driver.findElement(By.xpath(Common.LastNinetyDays)).click();
                break;
            case "All Time":
                Utility.driver.findElement(By.xpath(Common.AllTime)).click();
                break;
            case "VDP Result Last Month":
                Utility.driver.findElement(By.xpath(DemoClient.VDPResultLastMonth)).click();
                break;
            case "Advance Report Last Month":
                Utility.driver.findElement(By.xpath(DemoClient.AdvanceReportLastMonth)).click();
                break;
            case "Budget Roi Last 7 Days":
                Utility.driver.findElement(By.xpath(DemoClient.BudgetRoiLastSevenDays)).click();
                break;
            case "Budget Roi Last Month":
                Utility.driver.findElement(By.xpath(DemoClient.BudgetRoiLastMonth)).click();
                break;
            case "Budget Roi Last 90 Days":
                Utility.driver.findElement(By.xpath(DemoClient.BudgetRoiLastNinetyDays)).click();
                break;
            case "Vdps by Channel Last 7 Days":
                Utility.driver.findElement(By.xpath(DemoClient.VdpsByChannelLastSevenDays)).click();
                break;
            case "Vdps by Channel Last Month":
                Utility.driver.findElement(By.xpath(DemoClient.VdpsByChannelLastMonth)).click();
                break;
            case "Vdps by Channel Last 90 Days":
                Utility.driver.findElement(By.xpath(DemoClient.VdpsByChannelLastNinetyDays)).click();
                break;
            case "Top 10 Website Last 7 Days":
                Utility.driver.findElement(By.xpath(DemoClient.TopTenWebsiteLastSevenDays)).click();
                break;
            case "Top 10 Website Last Month":
                Utility.driver.findElement(By.xpath(DemoClient.TopTenWebsiteLastMonth)).click();
                break;
            case "Top 10 Website Last 90 Days":
                Utility.driver.findElement(By.xpath(DemoClient.TopTenWebsiteLastNinetyDays)).click();
                break;
            case "VDP ROI Last 7 Days":
                Utility.driver.findElement(By.xpath(DemoClient.VdpRoiLastSevenDays)).click();
                break;
            case "VDP ROI Last Month":
                Utility.driver.findElement(By.xpath(DemoClient.VdpRoiLastMonth)).click();
                break;
            case "VDP ROI Last 90 Days":
                Utility.driver.findElement(By.xpath(DemoClient.VdpRoiLastNinetyDays)).click();
                break;
            default:
                break;
        }
        Thread.sleep(10000);
    }

    @Then("I click {string} V2")
    public void iClickV2(String DateFilter) {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);
        switch (DateFilter) {
            case "Last 7 Days":
                WebElement dateFilterSevenDays =  Utility.driver.findElement(By.xpath(Common.LastSevenDaysV2));
                actions.moveToElement(dateFilterSevenDays).perform();
                dateFilterSevenDays.click();
                break;
            case "Last Month":
                WebElement dateFilterLastMonth =  Utility.driver.findElement(By.xpath(Common.LastMonthV2));
                actions.moveToElement(dateFilterLastMonth).perform();
                dateFilterLastMonth.click();
                break;
            case "All Time":
                Utility.driver.findElement(By.xpath(Common.AllTimeV2)).click();
                break;
            case "Last 30 Days":
                Utility.driver.findElement(By.xpath(Common.LastThirtyDaysV2)).click();
                break;
            case "Last 60 Days":
                Utility.driver.findElement(By.xpath(Common.LastSixtyDaysV2)).click();
                break;
            case "Last 90 Days":
                Utility.driver.findElement(By.xpath(Common.LastNinetyDaysV2)).click();
                break;
            default:
                break;
        }
    }

    @Then("Close Browser")
    public void close_browser() {
        Utility.driver.quit();
    }


}
