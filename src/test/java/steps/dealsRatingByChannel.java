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
        Utility.driver.findElement(By.xpath("//div[@id='react-select-3-option-3']")).click();
        Thread.sleep(10000);
    }

    @Then("I click twice the sort by function in cargurus column")
    public void i_click_twice_the_sort_by_function_in_cargurus_column() throws InterruptedException {
        switch (Utility.DealerName) {
            case "Demo Client":
                Utility.driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/div[2]/*[1]")).click();

                // Locate the table
                WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

                // Locate the specific column (e.g., the second column)
                List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//tbody/tr/td[3]")); // Adjust the xpath as necessary
                ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

                for (WebElement cell : columnCells) {
                    String cellText = cell.getText().trim();
                    DemoClientCargurusDealsByRating.add(cellText);
                }
                System.out.println("Hello Here" + DemoClientCargurusDealsByRating);
                Utility.driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/div[2]/*[1]")).click();
                Thread.sleep(20000);
                //        Utility.checkAllZeroData(DemoClientCargurusDealsByRating);
                break;
            case "Davies Ford":
                break;
        }
    }

    @Then("all value should not unknown data")
    public void all_value_should_not_unknown_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
