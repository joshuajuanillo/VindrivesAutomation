package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import Utility.Utility;
import Resources.*;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class resultSummaryStepsDefinition {

    @When("I navigate to the Result Summary Page")
    public void i_navigate_to_the_result_summary_page() {

    }
    @Then("the totalVDPs should have data")
    public void the_totalled_should_have_data() {

        // Find the elements using Selenium
        List<WebElement> totalVDPs = Utility.driver.findElements(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));

        // Create an array to store the text from elements
        String[] totalVDPsArray = new String[totalVDPs.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < totalVDPs.size(); i++) {
            totalVDPsArray[i] = totalVDPs.get(i).getText();
        }

        // Print the text from the array
        for (String text : totalVDPsArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            Assert.assertNotEquals("Values should not be equal","0", stringArray[2]);
        }
    }

    @Then("the Avg VDPs Vehicle should have data")
    public void the_avg_vd_ps_vehicle_should_have_data() {

        List<WebElement> avgVDPs = Utility.driver.findElements(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]"));

        // Create an array to store the text from elements
        String[] totalavgVDPsArray = new String[avgVDPs.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < avgVDPs.size(); i++) {
            totalavgVDPsArray[i] = avgVDPs.get(i).getText();
        }

        // Print the text from the array
        for (String text : totalavgVDPsArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            System.out.println(stringArray[2]);
            Assert.assertNotEquals("Values should not be equal","0", stringArray[2]);
        }
    }

    @Then("the Front Line Ready should have data")
    public void the_front_line_ready_should_have_data() {

        List<WebElement> totalFrontLine = Utility.driver.findElements(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]"));

        // Create an array to store the text from elements
        String[] frontLineReadyArray = new String[totalFrontLine.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < totalFrontLine.size(); i++) {
            frontLineReadyArray[i] = totalFrontLine.get(i).getText();
        }

        // Print the text from the array
        for (String text : frontLineReadyArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            System.out.println(stringArray[2]);
            Assert.assertNotEquals("Values should not be equal","0", stringArray[2]);
        }
    }

    @Then("the Sales to FLR Ratio should have data")
    public void the_sales_to_flr_ratio_should_have_data() {
        // Find the elements using Selenium
        List<WebElement> totalSalesFLR = Utility.driver.findElements(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]"));

        // Create an array to store the text from elements
        String[] totalSalesFLRArray = new String[totalSalesFLR.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < totalSalesFLR.size(); i++) {
            totalSalesFLRArray[i] = totalSalesFLR.get(i).getText();
        }

        // Print the text from the array
        for (String text : totalSalesFLRArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            System.out.println(stringArray[2]);
            Assert.assertNotEquals("Values should not be equal","0", stringArray[2]);
        }
    }

    @Then("the Sales Pace should have data")
    public void the_sales_pace_should_have_data() {

        // Find the elements using Selenium
        List<WebElement> totalSalesPace = Utility.driver.findElements(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]"));

        // Create an array to store the text from elements
        String[] totalSPsArray = new String[totalSalesPace.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < totalSalesPace.size(); i++) {
            totalSPsArray[i] = totalSalesPace.get(i).getText();
        }

        // Print the text from the array
        for (String text : totalSPsArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            System.out.println(stringArray[2]);
            Assert.assertNotEquals("Values should not be equal","0", stringArray[2]);
        }
    }

    @Then("the Average days to sell have data")
    public void the_average_days_to_sell_have_data() {

        // Find the elements using Selenium
        List<WebElement> totalAvgDays = Utility.driver.findElements(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[3]"));

        // Create an array to store the text from elements
        String[] totalAvgDaysArray = new String[totalAvgDays.size()];

        // Iterate through the elements and store their text in the array
        for (int i = 0; i < totalAvgDays.size(); i++) {
            totalAvgDaysArray[i] = totalAvgDays.get(i).getText();
        }

        // Print the text from the array
        for (String text : totalAvgDaysArray) {
            // Split the input string by newline character '\n'
            String[] stringArray = text.split("\n");
            System.out.println(stringArray[2]);
            Assert.assertNotEquals("Values should not be equal","0", stringArray[2]);
        }
    }

    @Then("the result score should show data")
    public void the_result_score_should_show_data() {
        WebElement graphElement = Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
        System.out.println(graphElement.getText());
        // Check if the graph element has data
        if (graphElement.getText().isEmpty()) {
            System.out.println("Graph does not have data.");
        } else {
            System.out.println("Graph has data.");
        }
    }

    @Then("the Tippable Cargurus column should have data")
    public void the_tippable_cargurus_column_should_have_data() {
        // Locate the table
        WebElement table = Utility.driver.findElement(By.xpath(Common.ResultSummaryQuickResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = table.findElements(By.xpath(QuickResult.TippableCargurus)); // Adjust the xpath as necessary

        ArrayList<Integer> tippableCargurus = new ArrayList<>();

        for (WebElement cell : columnCells) {
            Integer cellText = Integer.valueOf(cell.getText().trim());
            tippableCargurus.add(cellText);
        }
        Utility.checkAllZeroData(tippableCargurus);

    }

    @Then("the Tippable Autotrader column should have data")
    public void the_tippable_autotrader_column_should_have_data() {
        // Locate the table
        WebElement table = Utility.driver.findElement(By.xpath(Common.ResultSummaryQuickResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = table.findElements(By.xpath(QuickResult.TippableAutotrader)); // Adjust the xpath as necessary

        ArrayList<Integer> tippableAutoTrader = new ArrayList<>();

        for (WebElement cell : columnCells) {
            Integer cellText = Integer.valueOf(cell.getText().trim());
            tippableAutoTrader.add(cellText);
        }
        Utility.checkAllZeroData(tippableAutoTrader);
    }

    @Then("the Tippable Cars dot com column should have data")
    public void the_tippable_cars_dot_com_column_should_have_data() {
        // Locate the table
        WebElement table = Utility.driver.findElement(By.xpath(Common.ResultSummaryQuickResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = table.findElements(By.xpath(QuickResult.TippableCarsDotCom)); // Adjust the xpath as necessary

        ArrayList<Integer> tippableCarsDotCom = new ArrayList<>();

        for (WebElement cell : columnCells) {
            Integer cellText = Integer.valueOf(cell.getText().trim());
            tippableCarsDotCom.add(cellText);
        }
        Utility.checkAllZeroData(tippableCarsDotCom);
    }

    @Then("the Zero Leads column should have data")
    public void the_zero_leads_column_should_have_data() {
        switch (Utility.DealerName) {
            case "Demo Client":
                // Locate the table
                WebElement table = Utility.driver.findElement(By.xpath(Common.ResultSummaryQuickResultTable));// Change to the actual table ID or selector
                List<WebElement> columnCells = null;
                if(Utility.vehicleType == "Used Inventory"){
                    // Locate the specific column (e.g., the second column)
                    columnCells = table.findElements(By.xpath(QuickResult.ZeroLeads)); // Adjust the xpath as necessary
                }else{
                    // Locate the specific column (e.g., the second column)
                    columnCells = table.findElements(By.xpath(DemoClient.NewInventoryDemoClientZeroLeads)); // Adjust the xpath as necessary
                }

                ArrayList<Integer> zeroLeads = new ArrayList<>();

                for (WebElement cell : columnCells) {
                    Integer cellText = Integer.valueOf(cell.getText().trim());
                    zeroLeads.add(cellText);
                }
                Utility.checkAllZeroData(zeroLeads);
                break;
            default:
                break;
        }
    }

    @Then("the Missing Photos column should have data")
    public void the_missing_photos_column_should_have_data() {
        // Locate the table
        WebElement table = Utility.driver.findElement(By.xpath(Common.ResultSummaryQuickResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = table.findElements(By.xpath(QuickResult.MissingPhotos)); // Adjust the xpath as necessary
        System.out.println("hello " + columnCells.size());
        ArrayList<Integer> zeroLeads = new ArrayList<>();

        for (WebElement cell : columnCells) {
            Integer cellText = Integer.valueOf(cell.getText().trim());
            zeroLeads.add(cellText);
        }
        Utility.checkAllZeroData(zeroLeads);
    }

    @Then("the Less than fifty Vdps column should have data")
    public void the_less_than_fifty_vdps_column_should_have_data() {
        // Locate the table
        WebElement table = Utility.driver.findElement(By.xpath(Common.ResultSummaryQuickResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = table.findElements(By.xpath(QuickResult.LessThanFiftyVdps)); // Adjust the xpath as necessary

        ArrayList<Integer> zeroLeads = new ArrayList<>();

        for (WebElement cell : columnCells) {
            Integer cellText = Integer.valueOf(cell.getText().trim());
            zeroLeads.add(cellText);
        }
        Utility.checkAllZeroData(zeroLeads);
    }
}
