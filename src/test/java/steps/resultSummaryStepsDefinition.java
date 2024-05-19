package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import Utility.Utility;

import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class resultSummaryStepsDefinition {

    @When("I navigate to the Result Summary Page")
    public void i_navigate_to_the_result_summary_page() throws InterruptedException {

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
            System.out.println(stringArray[2]);
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

}
