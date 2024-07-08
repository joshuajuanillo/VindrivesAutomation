package steps;

import Resources.Common;
import Resources.DemoClient;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import Utility.*;
import org.openqa.selenium.WebElement;
import org.slf4j.helpers.Util;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class common {
    @Given("a user with a correct credentials")
    public void a_user_with_a_correct_credentials(DataTable dataTable) throws InterruptedException {
        Utility.getDriver();
        Utility.driver.get("https://vindrives.app");
        List<List<String>> credentials = dataTable.asLists(String.class);
        Utility.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Utility.driver.findElement(By.cssSelector("input[name=email]")).sendKeys(credentials.get(0).get(1));
        Utility.driver.findElement(By.cssSelector("input[name=password]")).sendKeys(credentials.get(1).get(1));
        Thread.sleep(30000);
        Utility.driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        Thread.sleep(10000);
    }

    @And("I select {string}")
    public void i_select(String dealerName) throws InterruptedException {
        WebElement dropdown = Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        Utility.DealerName = dealerName;
        switch (dealerName){
            case "Demo Client":
                List<WebElement> demoClients = dropdown.findElements(By.xpath(Common.DemoClient));
                Utility.selectDropdown(demoClients,"Demo Client");
                System.out.println("Dito si " + Utility.DealerName);
                break;
            case "Bill Brandt Ford" :
                List<WebElement> billBrandt = dropdown.findElements(By.xpath(Common.BillBrandtFord));
                Utility.selectDropdown(billBrandt,"Bill Brandt Ford");
                break;
            case "Dan Deery Toyota" :
                List<WebElement> danDeeryToyota = dropdown.findElements(By.xpath(Common.DanDeeryToyota));
                Utility.selectDropdown(danDeeryToyota,"Dan Deery Toyota");
                break;
            case "Dan Deery Motors" :
                List<WebElement> danDeeryMotors = dropdown.findElements(By.xpath(Common.DanDeeryMotors));
                Utility.selectDropdown(danDeeryMotors,"Dan Deery Motors");
                break;
            case "Lost Pines Toyota" :
                List<WebElement> lostPinesToyota = dropdown.findElements(By.xpath(Common.LostPinesToyota));
                Utility.selectDropdown(lostPinesToyota,"Lost Pines Toyota");
                break;
            case "Deery Brothers CDJR Waukee" :
                List<WebElement> deeryBrothers = dropdown.findElements(By.xpath(Common.DeeryBrothers));
                Utility.selectDropdown(deeryBrothers,"Deery Brothers CDJR Waukee");
                break;
            case "Valu Ford Chrysler" :
                List<WebElement> valuFord = dropdown.findElements(By.xpath(Common.ValuFordChrysler));
                Utility.selectDropdown(valuFord,"Valu Ford Chrysler");
                break;
            case "Moses Chevrolet" :
//                List<WebElement> mosesChevrolet = dropdown.findElements(By.xpath(Common.MosesChevrolet));
//                Utility.selectDropdown(mosesChevrolet,"Moses Chevrolet");
                break;
            case "Davies Ford" :
                List<WebElement> daviesFord = dropdown.findElements(By.xpath(Common.DaviesFord));
                Utility.selectDropdown(daviesFord,"Davies Ford");
                break;
            case "Moses BMW" :
                List<WebElement> mosesBMW = dropdown.findElements(By.xpath(Common.MosesBMW));
                Utility.selectDropdown(mosesBMW,"Moses BMW");
                break;
            case "Moses Outlet Corridor G" :
                List<WebElement> MosesOutletCorridorG = dropdown.findElements(By.xpath(Common.MosesOutletCorridorG));
                Utility.selectDropdown(MosesOutletCorridorG,"Moses Outlet Corridor G");
                break;
            case "Moses Outlet Teays Valley" :
                List<WebElement> MosesOutletTeaysValley = dropdown.findElements(By.xpath(Common.MosesOutletTeaysValley));
                Utility.selectDropdown(MosesOutletTeaysValley,"Moses Outlet Teays Valley");
                break;
            case "Moses Supercenter" :
                List<WebElement> MosesSupercenter = dropdown.findElements(By.xpath(Common.MosesSupercenter));
                Utility.selectDropdown(MosesSupercenter,"Moses Supercenter");
                break;
            case "Cowboy Toyota" :
                List<WebElement> CowBoyToyota = dropdown.findElements(By.xpath(Common.CowBoyToyota));
                Utility.selectDropdown(CowBoyToyota,"Cowboy Toyota");
                break;
        }
        Thread.sleep(10000);
    }

    @Then("Close Browser")
    public void close_browser() {
        Utility.driver.quit();
    }


    @And("I select vehicle type {string}")
    public void i_select_vehicle_type(String vehiclyType) throws InterruptedException {
        WebElement dropdown = Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]"));
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        Utility.vehicleType = vehiclyType;
        switch (vehiclyType){
            case "Used Inventory":
                List<WebElement> usedInventory = dropdown.findElements(By.xpath(Common.VehicleTypeUsed));
                Utility.selectDropdown(usedInventory,"Used Inventory");
                break;
            case "New Inventory" :
                List<WebElement> newInventory = dropdown.findElements(By.xpath(Common.VehicleTypeNew));
                Utility.selectDropdown(newInventory,"New Inventory");
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
}
