package steps;

import Resources.BillBrandtFord;
import Resources.Common;
import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utility.GlobalUtility;

import java.util.ArrayList;
import java.util.List;

public class dealsRatingByChannel {
    @Then("I select {int} per page in pagination")
    public void i_select_per_page_in_pagination(Integer int1) throws InterruptedException {
        Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
        Utility.driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[4]")).click();
        Thread.sleep(10000);
    }

    @And("I select 100 per page in pagination Vtwo")
    public void iSelectPerPageInPaginationVtwo() {
        WebElement TipReportPagination = Utility.driver.findElement(By.xpath("//select[@class='chakra-select css-161pkch']"));
        TipReportPagination.click();
        WebElement TipReportPaginationOption = Utility.driver.findElement(By.xpath("//option[@value='100']"));
        TipReportPaginationOption.click();
        TipReportPagination.click();
    }

    @Then("I click twice the sort by function in Deal Rating column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknown() throws InterruptedException {
        Utility.driver.findElement(By.xpath("//th[@id='deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();

        // Locate the table
        WebElement TipReportTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = TipReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> TipReportTableArray = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            TipReportTableArray.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(TipReportTableArray);
        Thread.sleep(20000);
    }
}
