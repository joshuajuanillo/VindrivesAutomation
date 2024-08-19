package steps;

import Resources.Common;
import Resources.DemoClient;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import Utility.*;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class common {

    @Before("@setup") public static void setup() throws InterruptedException {
        Utility.getDriver();
        Utility.driver.get("https://uat.vindrives.app");
        Utility.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Utility.driver.findElement(By.cssSelector("input[name=email]")).sendKeys("jjuanillo@dealercmo.com");
        Utility.driver.findElement(By.cssSelector("input[name=password]")).sendKeys("DealerCMO4321@");
        Thread.sleep(30000);
        Utility.driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        Thread.sleep(10000);
    }

    @And("I select {string}")
    public void i_select(String dealerName) throws InterruptedException {
        WebElement dropdown = Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        GlobalUtility.DealerName = dealerName;
        System.out.println(GlobalUtility.DealerName);
        List<WebElement> TestDealer = dropdown.findElements(By.xpath("//ul[@class='styles_dropdownMenu__jok5d']/li[normalize-space(.)='"+ dealerName +"']"));
        System.out.println(TestDealer);
        GlobalUtility.selectDropdown(TestDealer,dealerName);
//        switch (dealerName){
//            case "Demo Client":
//                List<WebElement> demoClients = dropdown.findElements(By.xpath(Common.DemoClient));
//                GlobalUtility.selectDropdown(demoClients,"Demo Client");
//                break;
//            case "Bill Brandt Ford" :
//                List<WebElement> billBrandt = dropdown.findElements(By.xpath(Common.BillBrandtFord));
//                GlobalUtility.selectDropdown(billBrandt,"Bill Brandt Ford");
//                break;
//            case "Dan Deery Toyota" :
//                List<WebElement> danDeeryToyota = dropdown.findElements(By.xpath(Common.DanDeeryToyota));
//                GlobalUtility.selectDropdown(danDeeryToyota,"Dan Deery Toyota");
//                break;
//            case "Dan Deery Motors" :
//                List<WebElement> danDeeryMotors = dropdown.findElements(By.xpath(Common.DanDeeryMotors));
//                GlobalUtility.selectDropdown(danDeeryMotors,"Dan Deery Motors");
//                break;
//            case "Lost Pines Toyota" :
//                List<WebElement> lostPinesToyota = dropdown.findElements(By.xpath(Common.LostPinesToyota));
//                GlobalUtility.selectDropdown(lostPinesToyota,"Lost Pines Toyota");
//                break;
//            case "Deery Brothers CDJR Waukee" :
//                List<WebElement> deeryBrothers = dropdown.findElements(By.xpath(Common.DeeryBrothers));
//                GlobalUtility.selectDropdown(deeryBrothers,"Deery Brothers CDJR Waukee");
//                break;
//            case "Valu Ford Chrysler" :
//                List<WebElement> valuFord = dropdown.findElements(By.xpath(Common.ValuFordChrysler));
//                GlobalUtility.selectDropdown(valuFord,"Valu Ford Chrysler");
//                break;
//            case "Moses Chevrolet" :
////                List<WebElement> mosesChevrolet = dropdown.findElements(By.xpath(Common.MosesChevrolet));
////                Utility.selectDropdown(mosesChevrolet,"Moses Chevrolet");
//                break;
//            case "Davies Ford" :
//                List<WebElement> daviesFord = dropdown.findElements(By.xpath(Common.DaviesFord));
//                GlobalUtility.selectDropdown(daviesFord,"Davies Ford");
//                break;
//            case "Moses BMW" :
//                List<WebElement> mosesBMW = dropdown.findElements(By.xpath(Common.MosesBMW));
//                GlobalUtility.selectDropdown(mosesBMW,"Moses BMW");
//                break;
//            case "Moses Outlet Corridor G" :
//                List<WebElement> MosesOutletCorridorG = dropdown.findElements(By.xpath(Common.MosesOutletCorridorG));
//                GlobalUtility.selectDropdown(MosesOutletCorridorG,"Moses Outlet Corridor G");
//                break;
//            case "Moses Outlet Teays Valley" :
//                List<WebElement> MosesOutletTeaysValley = dropdown.findElements(By.xpath(Common.MosesOutletTeaysValley));
//                GlobalUtility.selectDropdown(MosesOutletTeaysValley,"Moses Outlet Teays Valley");
//                break;
//            case "Moses Supercenter" :
//                List<WebElement> MosesSupercenter = dropdown.findElements(By.xpath(Common.MosesSupercenter));
//                GlobalUtility.selectDropdown(MosesSupercenter,"Moses Supercenter");
//                break;
//            case "Cowboy Toyota" :
//                List<WebElement> CowBoyToyota = dropdown.findElements(By.xpath(Common.CowBoyToyota));
//                GlobalUtility.selectDropdown(CowBoyToyota,"Cowboy Toyota");
//                break;
//            case "Test Dealer" :
//                List<WebElement> CowBoyToyota = dropdown.findElements(By.xpath(Common.TestDealer));
//                GlobalUtility.selectDropdown(CowBoyToyota,"Cowboy Toyota");
//                break;
//        }
        Thread.sleep(10000);
    }

    @And("I select vehicle type {string}")
    public void i_select_vehicle_type(String vehiclyType) throws InterruptedException {
        WebElement dropdown = Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]"));
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        GlobalUtility.vehicleType = vehiclyType;
        switch (vehiclyType){
            case "Used Inventory":
                List<WebElement> usedInventory = dropdown.findElements(By.xpath(Common.VehicleTypeUsed));
                GlobalUtility.selectDropdown(usedInventory,"Used Inventory");
                break;
            case "New Inventory" :
                List<WebElement> newInventory = dropdown.findElements(By.xpath(Common.VehicleTypeNew));
                GlobalUtility.selectDropdown(newInventory,"New Inventory");
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

    @Then("Close Browser")
    public void close_browser() {
        Utility.driver.quit();
    }
}
