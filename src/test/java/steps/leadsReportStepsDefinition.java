package steps;

import Resources.DemoClient;
import Utility.Utility;
import Utility.GlobalUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class leadsReportStepsDefinition {
    @Then("I click twice the sort by function in Price column and data are not unknown from Leads report")
    public void iClickTwiceTheSortByFunctionInCargurusRankColumnAndDataAreNotUnknownFromLeadsReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }
}
