package steps;

import Resources.Common;
import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class dealsRatingByChannel {
    @Then("I select {int} per page in pagination")
    public void i_select_per_page_in_pagination(Integer int1) throws InterruptedException {
        Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
        Utility.driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[4]")).click();
        Thread.sleep(10000);
    }

    @Then("I click twice the sort by function in cargurus column and data are not unknown")
    public void i_click_twice_the_sort_by_function_in_cargurus_column_and_data_are_not_unknown() throws InterruptedException {
                Utility.driver.findElement(By.xpath(DemoClient.CargurusRankSort)).click();

                // Locate the table
                WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

                // Locate the specific column (e.g., the second column)
                List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
                ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

                for (WebElement cell : columnCells) {
                    String cellText = cell.getText().trim();
                    DemoClientCargurusDealsByRating.add(cellText);
                }

                Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)).click();

                // Locate the specific column (e.g., the second column)
                List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

                for (WebElement cell : columnCells2) {
                    String cellText = cell.getText().trim();
                    DemoClientCargurusDealsByRating.add(cellText);
                }

                Utility.checkAllUnkownData(DemoClientCargurusDealsByRating);
                Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Autotrader column and data are not unknown")
    public void i_click_twice_the_sort_by_function_in_autotrader_column_and_data_are_not_unknown() throws InterruptedException {
                Utility.driver.findElement(By.xpath(DemoClient.AutotraderRankSort)).click();

                // Locate the table
                WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

                // Locate the specific column (e.g., the second column)
                List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Autotrader']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
                ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

                for (WebElement cell : columnCells) {
                    String cellText = cell.getText().trim();
                    DemoClientCargurusDealsByRating.add(cellText);
                }

                Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)).click();

                // Locate the specific column (e.g., the second column)
                List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Autotrader']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

                for (WebElement cell : columnCells2) {
                    String cellText = cell.getText().trim();
                    DemoClientCargurusDealsByRating.add(cellText);
                }

                Utility.checkAllUnkownData(DemoClientCargurusDealsByRating);
                Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Cars column and data are not unknown")
    public void i_click_twice_the_sort_by_function_in_cars_column_and_data_are_not_unknown() throws InterruptedException {
        switch (Utility.DealerName) {
            case "Demo Client":
                Utility.driver.findElement(By.xpath(DemoClient.CarsDotCom)).click();

                // Locate the table
                WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

                // Locate the specific column (e.g., the second column)
                List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
                ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

                for (WebElement cell : columnCells) {
                    String cellText = cell.getText().trim();
                    DemoClientCargurusDealsByRating.add(cellText);
                }

                Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)).click();

                // Locate the specific column (e.g., the second column)
                List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

                for (WebElement cell : columnCells2) {
                    String cellText = cell.getText().trim();
                    DemoClientCargurusDealsByRating.add(cellText);
                }

                Utility.checkAllUnkownData(DemoClientCargurusDealsByRating);
                Thread.sleep(20000);

                break;
            case "Davies Ford":
                break;
        }
    }
}
