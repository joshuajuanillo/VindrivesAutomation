package steps;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class marketingResultStepsDefinition {
    @When("I navigate to the {string} from marketing result report")
    public void i_navigate_to_the_from_merchandising_report(String reportName) throws InterruptedException {
        switch (reportName) {
            case "Deal Ratings by channel":
                Utility.driver.findElement(By.xpath(DemoClient.DealRatingsByChennelMenu)).click();
                Utility.driver.findElement(By.xpath(DemoClient.DealRatingsByChennelTab)).click();
                break;
            case "Tip Report":
                Utility.driver.findElement(By.xpath(DemoClient.TipReportTab)).click();
                Thread.sleep(10000);
                break;
            case "Channel Stats report":
                Utility.driver.findElement(By.xpath(DemoClient.DealRatingsByChennelMenu)).click();
                Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTab)).click();
                break;
            case "Pre Shoot report":
                Utility.driver.findElement(By.xpath(DemoClient.PreShootReportTab)).click();
                Thread.sleep(10000);
                break;
            case "VDP Result":
                Utility.driver.findElement(By.xpath(DemoClient.VdpResults)).click();
                Thread.sleep(10000);
                break;
            case "Leads":
                Utility.driver.findElement(By.xpath(DemoClient.LeadsTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.Leads)).click();
                break;
            case "Most VDPs":
                Utility.driver.findElement(By.xpath(DemoClient.MostVdps)).click();
                break;
            case "Least VDPs":
                Utility.driver.findElement(By.xpath(DemoClient.LeastVdps)).click();
                break;
            case "Days on Lot":
                Utility.driver.findElement(By.xpath(DemoClient.DaysOnLot)).click();
                break;
            case "Budget ROI":
                Utility.driver.findElement(By.xpath(DemoClient.BudgetRoiTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.BudgetRoi)).click();
                break;
            case "Vdps by Channel":
                Utility.driver.findElement(By.xpath(DemoClient.VdpsByChannelTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.VdpsByChannel)).click();
                break;
            case "Top 10 Website":
                Utility.driver.findElement(By.xpath(DemoClient.TopTenWebsiteTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.TopTenWebsite)).click();
                break;
            case "VDP ROI":
                Utility.driver.findElement(By.xpath(DemoClient.VdpRoiTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.VdpRoi)).click();
                break;
        }

    }
}
