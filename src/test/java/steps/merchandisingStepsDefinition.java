package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import Utility.Utility;
import Resources.*;

import org.openqa.selenium.WebElement;

import java.util.List;

public class merchandisingStepsDefinition {
    @When("I navigate to the {string}")
    public void i_navigate_to_the(String reportName) throws InterruptedException {
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
                // Locate the table
                WebElement TipReportTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> TipReportTableDataRows = TipReportTable.findElements(By.xpath("//tbody[1]/tr"));
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
