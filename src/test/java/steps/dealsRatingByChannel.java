package steps;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utility.GlobalUtility;
import org.openqa.selenium.interactions.Actions;

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
    public void iSelectPerPageInPaginationVtwo() throws InterruptedException {
        WebElement TipReportPagination = Utility.driver.findElement(By.xpath("//select[@class='chakra-select css-161pkch']"));
        TipReportPagination.click();
        WebElement TipReportPaginationOption = Utility.driver.findElement(By.xpath("//option[@value='100']"));
        TipReportPaginationOption.click();
        TipReportPagination.click();
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Deal Rating column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='deal_rating']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Tip Report result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Price column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Price result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
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

    @Then("I click twice the sort by function in New Deal Rating column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInNewDealRatingColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='new_deal_rating']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='New Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Deal Rating result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='New Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in New Price column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInNewPriceColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='new_price']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='New Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='New Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Price Change column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInPriceChangeColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='price_change']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price Change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Price Change result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price Change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Great Deal Rating column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInGreatDealRatingColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='great_deal_rating']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Great Deal rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Great Deal Rating result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Great Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Price at Great Deal Rating column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInPriceAtGreatDealRatingColumnAndDataAreNotUnknown() throws InterruptedException {
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price at Great Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Price Change at Great Deal Rating column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInPriceChangeAtGreatDealRatingColumnAndDataAreNotUnknown() throws InterruptedException {
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price at Great Deal Rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Price Change at Great Deal Rating result: " + DemoClientCargurusDealsByRating);

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @Then("I click twice the sort by function in Age column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInAgeColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='age']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Age']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Age result: " + DemoClientCargurusDealsByRating);

        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Age']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in Price column and data are not zero from DeaRating by channel")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotZeroFromDeaRatingByChannel() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement priceSort =  Utility.driver.findElement(By.xpath(DemoClient.PriceSort));
        actions.moveToElement(priceSort).perform();
        priceSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DealRatingByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(DemoClient.PriceSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in Photos column and data are not zero from DeaRating by channel")
    public void iClickTwiceTheSortByFunctionInPhotosColumnAndDataAreNotZeroFromDeaRatingByChannel() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement photoSort =  Utility.driver.findElement(By.xpath(DemoClient.PhotoSort));
        actions.moveToElement(photoSort).perform();
        photoSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DealRatingByChannelTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='# of Photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(DemoClient.PhotoSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DealRatingByChannelTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='# of Photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }
}
