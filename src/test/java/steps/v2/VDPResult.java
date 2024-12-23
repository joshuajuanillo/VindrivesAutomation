package steps.v2;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import Utility.VdpRslt;

public class VDPResult {
    @When("I click sort from cargurus rank from Vdp Result")
    public void IClickSortFromCargurusRankVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrRankSort).perform();
            CgrRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement PreShootReportTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.CargurusRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.CargurusRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.CargurusRank.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.CargurusRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
