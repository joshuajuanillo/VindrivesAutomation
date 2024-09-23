package steps;

import Resources.DemoClient;
import Resources.PreShootReport;
import Utility.Utility;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import Utility.GlobalUtility;

public class preShootReport {
    @And("I select 100 per page in pagination from advance report")
    public void iSelectPerPageInPaginationFromAdvanceReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);
        WebElement preShootPagination = Utility.driver.findElement(By.xpath("//div[@class=' css-t3ipsp-control']"));
        actions.moveToElement(preShootPagination).perform();
        preShootPagination.click();
        Utility.driver.findElement(By.xpath("//div[@id='react-select-9-option-3']")).click();
        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in Price column and data are not unknown from Pre Shoot Report")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknownFromPreShootReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement priceSort =  Utility.driver.findElement(By.xpath(PreShootReport.priceSort));
        actions.moveToElement(priceSort).perform();
        priceSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.PreshootReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Price result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(priceSort).perform();
        priceSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }
}
