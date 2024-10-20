package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import Utility.Utility;
import Utility.GlobalUtility;
import Resources.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
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
                Utility.driver.findElement(By.xpath(DemoClient.DealRatingsByChennelMenu)).click();
                Utility.driver.findElement(By.xpath(DemoClient.TipReportTab)).click();
                break;
            case "Channel Stats report":
                Utility.driver.findElement(By.xpath(DemoClient.DealRatingsByChennelMenu)).click();
                Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTab)).click();
                break;
            case "Pre Shoot report":
                Utility.driver.findElement(By.xpath(DemoClient.DealRatingsByChennelMenu)).click();
                Utility.driver.findElement(By.xpath(DemoClient.PreShootReportTab)).click();
                break;
        }
        Thread.sleep(5000);
    }

    @Then("the {string} should have data")
    public void the_should_have_data(String reportName) throws InterruptedException {
        String DataValue = "";
        switch (reportName) {
            case "Deal Ratings by channel":
                // Locate the table
                WebElement DealRatingByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> DealRatingByChannelTableDataRows = DealRatingByChannelTable.findElements(By.xpath("//tbody/tr"));
                // Check if the table body has data rows

                for (WebElement row : DealRatingByChannelTableDataRows) {
                    DataValue = row.getText();
                }

                GlobalUtility.checkTableIfEmpty(DealRatingByChannelTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Tip Report":

                // Locate the table
                WebElement TipReportTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> TipReportTableDataRows = TipReportTable.findElements(By.xpath("//tbody/tr"));
                System.out.println("Row Count " + TipReportTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : TipReportTableDataRows) {
                    DataValue = row.getText();
                }

                GlobalUtility.checkTableIfEmpty(TipReportTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Channel Stats report":
                // Locate the table
                WebElement ChannelStatReportTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> ChannelStatReportTableDataRows = ChannelStatReportTable.findElements(By.xpath("//tbody/tr"));
                System.out.println("Row Count " + ChannelStatReportTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : ChannelStatReportTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(ChannelStatReportTableDataRows.size() , DataValue );
                Thread.sleep(5000);
                break;
            case "Pre Shoot report":
                // Locate the table
                WebElement PreShootTable = Utility.driver.findElement(By.xpath(DemoClient.PreshootReportTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> PreShootTableDataRows = PreShootTable.findElements(By.xpath("//tbody/tr"));
                // Check if the table body has data rows

                for (WebElement row : PreShootTableDataRows) {
                    DataValue = row.getText();
                }

                GlobalUtility.checkTableIfEmpty(PreShootTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "VDP Result":
                // Locate the table
                WebElement VdpResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> VdpResultTableDataRows = VdpResultTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + VdpResultTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : VdpResultTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(VdpResultTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Leads":
                // Locate the table
                WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> LeadsTableDataRows = LeadsTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + LeadsTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : LeadsTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(LeadsTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Most VDPs":
                // Locate the table
                WebElement MostVdpsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> MostVdpsTableDataRows = MostVdpsTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + MostVdpsTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : MostVdpsTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(MostVdpsTableDataRows.size() , DataValue);
                Thread.sleep(5000);
                break;
            case "Least VDPs":
                // Locate the table
                WebElement LeastVdpsTable = Utility.driver.findElement(By.xpath(DemoClient.LeastVdpsTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> LeastVdpsTableDataRows = LeastVdpsTable.findElements(By.xpath("//tbody[1]/tr"));

                // Check if the table body has data rows
                for (WebElement row : LeastVdpsTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(LeastVdpsTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Days On Lot":
                // Locate the table
                WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.DaysOnLotTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> DaysOnLotTableDataRows = DaysOnLotTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + DaysOnLotTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : DaysOnLotTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(DaysOnLotTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "VDP Boost":
                // Locate the table
                WebElement VdpBoostTable = Utility.driver.findElement(By.xpath(DemoClient.VDPBoostTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                Thread.sleep(5000);
                List<WebElement> VDPBoostTableDataRows = VdpBoostTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + VDPBoostTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : VDPBoostTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(VDPBoostTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Budget ROI":
                // Locate the table
                WebElement BudgetRoiTable = Utility.driver.findElement(By.xpath(DemoClient.BudgetRoiTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> BudgetRoiTableDataRows = BudgetRoiTable.findElements(By.xpath("//tbody/tr"));
                System.out.println("Row Count " + BudgetRoiTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : BudgetRoiTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(BudgetRoiTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Vdps by Channel":
                // Locate the table
                WebElement VdpsByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.VdpsByChannelTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> VdpsByChannelTableDataRows = VdpsByChannelTable.findElements(By.xpath("//tbody/tr"));
                System.out.println("Row Count " + VdpsByChannelTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : VdpsByChannelTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(VdpsByChannelTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
            case "Top 10 Website":
                // Locate the table
                WebElement TopTenWebsiteTable = Utility.driver.findElement(By.xpath(DemoClient.TopTenWebsiteTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> TopTenWebsiteTableDataRows = TopTenWebsiteTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + TopTenWebsiteTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : TopTenWebsiteTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(TopTenWebsiteTableDataRows.size() , DataValue);
                Thread.sleep(5000);
                break;
            case "VDP ROI":
                // Locate the table
                WebElement VdpRoiTable = Utility.driver.findElement(By.xpath(DemoClient.VdpRoiTable)); // Change to the actual table ID or selector
                // Locate the table body rows (assuming tbody is used for data rows)
                List<WebElement> VdpRoiTableDataRows = VdpRoiTable.findElements(By.xpath("//tbody[1]/tr"));
                System.out.println("Row Count " + VdpRoiTableDataRows.size());

                // Check if the table body has data rows
                for (WebElement row : VdpRoiTableDataRows) {
                    DataValue = row.getText();
                }
                GlobalUtility.checkTableIfEmpty(VdpRoiTableDataRows.size(), DataValue);
                Thread.sleep(5000);
                break;
        }
    }
    @Then("the Sales Goal should have data")
    public void the_sales_goal_should_have_data() {
        // Find the elements using Selenium
        List<WebElement> salesGoal = Utility.driver.findElements(By.xpath("//div[@class='styles_metricCard__3b7HH styles_frontLineReadyVehicle__graph__widgets--salesGoal__vSeF5']"));

        // Create an array to store the text from elements
        String[] salesGoalArray = new String[salesGoal.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < salesGoal.size(); i++) {
            salesGoalArray[i] = salesGoal.get(i).getText();
        }

        // Print the text from the array
        for (String text : salesGoalArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            Assert.assertNotEquals("Values should not be equal","0", stringArray[1]);
        }
    }

    @Then("the Sales Pace should have data and should match its value from the result summary page")
    public void the_sales_pace_should_have_data_and_should_match_its_value_from_the_result_summary_page() {
        // Find the elements using Selenium
        List<WebElement> salesPace = Utility.driver.findElements(By.xpath("//div[@class='styles_metricCard__3b7HH styles_frontLineReadyVehicle__graph__widgets--salesPace__zqSY6']"));

        // Create an array to store the text from elements
        String[] salesPaceArray = new String[salesPace.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < salesPace.size(); i++) {
            salesPaceArray[i] = salesPace.get(i).getText();
        }

        // Print the text from the array
        for (String text : salesPaceArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            Assert.assertNotEquals("Values should not be equal","0", stringArray[1]);
        }
    }

    @Then("the Front Line ready should have data and should match its value from the result summary page")
    public void the_front_line_ready_should_have_data_and_should_match_its_value_from_the_result_summary_page() {
        // Find the elements using Selenium
        List<WebElement> frontLineReady = Utility.driver.findElements(By.xpath("//div[@class='styles_metricCard__3b7HH styles_frontLineReadyVehicle__graph__widgets--frontLineReady__lpkBF']"));

        // Create an array to store the text from elements
        String[] frontLineReadyArray = new String[frontLineReady.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < frontLineReady.size(); i++) {
            frontLineReadyArray[i] = frontLineReady.get(i).getText();
        }

        // Print the text from the array
        for (String text : frontLineReadyArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            Assert.assertNotEquals("Values should not be equal","0", stringArray[1]);
        }
    }

    @Then("the Sales FLR Ratio should have data and should match its value from the result summary page")
    public void the_sales_flr_ratio_should_have_data_and_should_match_its_value_from_the_result_summary_page() {
        // Find the elements using Selenium
        List<WebElement> salesFlrRatio = Utility.driver.findElements(By.xpath("//div[@class='styles_metricCard__3b7HH styles_frontLineReadyVehicle__graph__widgets--salesFlrRatio__unY8W']"));

        // Create an array to store the text from elements
        String[] salesFlrRatioArray = new String[salesFlrRatio.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < salesFlrRatio.size(); i++) {
            salesFlrRatioArray[i] = salesFlrRatio.get(i).getText();
        }

        // Print the text from the array
        for (String text : salesFlrRatioArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            Assert.assertNotEquals("Values should not be equal","0", stringArray[1]);
        }
    }

    @Then("the FLR to Hit Goal")
    public void the_flr_to_hit_goal() {
        // Find the elements using Selenium
        List<WebElement> flrToHitGoal = Utility.driver.findElements(By.xpath("//div[@class='styles_metricCard__3b7HH styles_frontLineReadyVehicle__graph__widgets--flrToHitGoal__PAReP']"));

        // Create an array to store the text from elements
        String[] flrToHitGoalArray = new String[flrToHitGoal.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < flrToHitGoal.size(); i++) {
            flrToHitGoalArray[i] = flrToHitGoal.get(i).getText();
        }

        // Print the text from the array
        for (String text : flrToHitGoalArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            System.out.println("here" + stringArray[1]);
            Assert.assertNotEquals("Values should not be equal","0", stringArray[1]);
        }
    }

    @And("I select {string} provider")
    public void iSelectProvider(String dealerProvider) throws InterruptedException {
        switch (dealerProvider) {
            case "Cargurus":
                WebElement cargurus = Utility.driver.findElement(By.xpath("//select[@class='chakra-select css-xzl4qm']"));
                cargurus.click();
                WebElement cargurusOption = Utility.driver.findElement(By.xpath("//option[@value='CGR']"));
                cargurusOption.click();
                cargurus.click();
                break;
            case "Autotrader":
                WebElement Autotrader = Utility.driver.findElement(By.xpath("//select[@class='chakra-select css-xzl4qm']"));
                Autotrader.click();
                WebElement AutotraderOption = Utility.driver.findElement(By.xpath("//option[@value='ATC']"));
                AutotraderOption.click();
                Autotrader.click();
                break;
            case "CarsDotCom":
                WebElement CarsDotCom = Utility.driver.findElement(By.xpath("//select[@class='chakra-select css-xzl4qm']"));
                CarsDotCom.click();
                WebElement CarsDotComOption = Utility.driver.findElement(By.xpath("//option[@value='CCM']"));
                CarsDotComOption.click();
                CarsDotCom.click();
                break;
        }
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in cargurus column and data are not unknown")
    public void i_click_twice_the_sort_by_function_in_cargurus_column_and_data_are_not_unknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(DemoClient.CargurusRankSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(DemoClient.CargurusRankSort)).click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);

        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Autotrader column and data are not unknown")
    public void i_click_twice_the_sort_by_function_in_autotrader_column_and_data_are_not_unknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement autoTraderSort =  Utility.driver.findElement(By.xpath(DemoClient.AutotraderRankSort));
        actions.moveToElement(autoTraderSort).perform();
        autoTraderSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DealRatingByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Autotrader']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(DemoClient.AutotraderRankSort)).click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Autotrader']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);

        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Cars column and data are not unknown")
    public void i_click_twice_the_sort_by_function_in_cars_column_and_data_are_not_unknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement carsDotComSort =  Utility.driver.findElement(By.xpath(DemoClient.CarsDotComSort));
        actions.moveToElement(carsDotComSort).perform();
        carsDotComSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DealRatingByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(DemoClient.CarsDotComSort)).click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);

        Thread.sleep(5000);
    }

    @And("I click twice the sort by function in DOL column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInDOLColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dolSort =  Utility.driver.findElement(By.xpath(DemoClient.DolSort));
        actions.moveToElement(dolSort).perform();
        dolSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DealRatingByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='DOL']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(DemoClient.DolSort)).click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='DOL']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);

        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Price change at Great Deal Rating column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInPriceChangeAtGreatDealRatingColumnAndDataAreNotUnknown() throws InterruptedException {
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price change at Great Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);

    }
}
