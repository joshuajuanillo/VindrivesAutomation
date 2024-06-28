package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import Utility.Utility;
import Resources.*;

import org.openqa.selenium.WebElement;

import java.util.List;

public class merchandisingStepsDefinition {
    @When("I navigate to the {string} from merchandising report")
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
        }

    }

    @Then("the {string} should have data")
    public void the_should_have_data(String reportName) throws InterruptedException {

        switch (reportName) {
            case "Deal Ratings by channel":
                // Locate the table
                WebElement DealRatingByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> DealRatingByChannelTableDataRows = DealRatingByChannelTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + DealRatingByChannelTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(DealRatingByChannelTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Tip Report":

                // Select Provider
                Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]")).click();

                // Locate the table
                WebElement TipReportTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> TipReportTableDataRows = TipReportTable.findElements(By.xpath("//tbody/tr"));
                System.out.println("Row Count " + TipReportTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(TipReportTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Channel Stats report":
                // Locate the table
                WebElement ChannelStatReportTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> ChannelStatReportTableDataRows = ChannelStatReportTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + ChannelStatReportTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(ChannelStatReportTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Pre Shoot report":
                // Locate the table
                WebElement PreshootReportTable = Utility.driver.findElement(By.xpath(DemoClient.PreshootReportTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> PreshootReportTableDataRows = PreshootReportTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + PreshootReportTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(PreshootReportTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "VDP Result":
                // Locate the table
                WebElement VdpResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> VdpResultTableDataRows = VdpResultTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + VdpResultTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(VdpResultTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Leads":
                // Locate the table
                WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> LeadsTableDataRows = LeadsTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + LeadsTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(LeadsTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Most VDPs":
                // Locate the table
                WebElement MostVdpsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> MostVdpsTableDataRows = MostVdpsTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + MostVdpsTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(MostVdpsTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Least VDPs":
                // Locate the table
                WebElement LeastVdpsTable = Utility.driver.findElement(By.xpath(DemoClient.LeastVdpsTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> LeastVdpsTableDataRows = LeastVdpsTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + LeastVdpsTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(LeastVdpsTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Days On Lot":
                // Locate the table
                WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.DaysOnLotTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> DaysOnLotTableDataRows = DaysOnLotTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + DaysOnLotTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(DaysOnLotTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Budget ROI":
                // Locate the table
                WebElement BudgetRoiTable = Utility.driver.findElement(By.xpath(DemoClient.BudgetRoiTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> BudgetRoiTableDataRows = BudgetRoiTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + BudgetRoiTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(BudgetRoiTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Vdps by Channel":
                // Locate the table
                WebElement VdpsByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.VdpsByChannelTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> VdpsByChannelTableDataRows = VdpsByChannelTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + VdpsByChannelTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(VdpsByChannelTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "Top 10 Website":
                // Locate the table
                WebElement TopTenWebsiteTable = Utility.driver.findElement(By.xpath(DemoClient.TopTenWebsiteTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> TopTenWebsiteTableDataRows = TopTenWebsiteTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + TopTenWebsiteTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(TopTenWebsiteTableDataRows.size());
                Thread.sleep(15000);
                break;
            case "VDP ROI":
                // Locate the table
                WebElement VdpRoiTable = Utility.driver.findElement(By.xpath(DemoClient.VdpRoiTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> VdpRoiTableDataRows = VdpRoiTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + VdpRoiTableDataRows.size());

                // Check if the table body has data rows
                Utility.checkTableIfEmpty(VdpRoiTableDataRows.size());
                Thread.sleep(15000);
                break;
        }
    }
}
