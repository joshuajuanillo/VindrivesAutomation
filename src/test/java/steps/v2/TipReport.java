package steps.v2;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import Utility.TipRprt;

public class TipReport {

    @When("I click sort from price from cargurus")
    public void IClickSortFromPriceCargurus() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrPriceSort).perform();
            CgrPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CgrPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CgrPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CgrPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CgrPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from cargurus")
    public void IClickSortFromDealratingCargurus() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrDealRatingSort).perform();
            CgrDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CgrDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CgrDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CgrDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CgrDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from new deal rating from cargurus")
    public void IClickSortFromNewDealratingCargurus() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrNewDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrNewDealRatingSort).perform();
            CgrNewDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CgrNewDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CgrNewDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CgrNewDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CgrNewDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from new price from cargurus")
    public void IClickSortFromNewPriceCargurus() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrNewPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_new_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrNewPriceSort).perform();
            CgrNewPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CgrNewPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CgrNewPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_new_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CgrNewPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CgrNewPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from price change from cargurus")
    public void IClickSortFromPriceChangeCargurus() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrPriceChange =  Utility.driver.findElement(By.xpath("//th[@id='cgr_price_change']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrPriceChange).perform();
            CgrPriceChange.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CgrPriceChange = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CgrPriceChange.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_price_change']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CgrPriceChange.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CgrPriceChange);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from autotrader")
    public void IClickSortFromDealratingAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcDealRatingSort).perform();
            AtcDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from autotrader")
    public void IClickSortFromPriceAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcPriceSort).perform();
            AtcPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from New Deal Rating from autotrader")
    public void IClickSortFromNewDealratingAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcNewDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcNewDealRatingSort).perform();
            AtcNewDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoNewDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoNewDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoNewDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoNewDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
