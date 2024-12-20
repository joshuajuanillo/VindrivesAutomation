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

    @When("I click sort from New Price from autotrader")
    public void IClickSortFromNewPriceAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcNewPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_new_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcNewPriceSort).perform();
            AtcNewPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoNewPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoNewPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_new_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoNewPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoNewPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price Change from autotrader")
    public void IClickSortFromPriceChangeAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcPriceChangeSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_price_change']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcPriceChangeSort).perform();
            AtcPriceChangeSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoPriceChange = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPriceChange.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_price_change']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPriceChange.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoPriceChange);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Great Deal Rating from autotrader")
    public void IClickSortFromGreatDealRatingAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcGreatDealRatingSort).perform();
            AtcGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price At Great Deal Rating from autotrader")
    public void IClickSortFromPriceAtGreatDealRatingAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcPriceAtGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_price_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcPriceAtGreatDealRatingSort).perform();
            AtcPriceAtGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoPriceAtGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPriceAtGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_price_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPriceAtGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoPriceAtGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price Change At Great Deal Rating from autotrader")
    public void IClickSortFromPriceChangeAtGreatDealRatingAtc() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcPriceChangeAtGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_price_change_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcPriceChangeAtGreatDealRatingSort).perform();
            AtcPriceChangeAtGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price_change_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.AutoPriceChangeAtGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPriceChangeAtGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_price_change_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price_change_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.AutoPriceChangeAtGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.AutoPriceChangeAtGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from carsDotCom")
    public void IClickSortFromDealratingCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmDealRatingSort).perform();
            CcmDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from carsDotCom")
    public void IClickSortFromPriceCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmPriceSort).perform();
            CcmPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from New Deal Rating from carsDotCom")
    public void IClickSortFromNewDealratingCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmNewDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmNewDealRatingSort).perform();
            CcmNewDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsNewDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsNewDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsNewDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsNewDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from New Price from carsDotCom")
    public void IClickSortFromNewPriceCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmNewPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_new_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmNewPriceSort).perform();
            CcmNewPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsNewPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsNewPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_new_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsNewPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsNewPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price Change from carsDotCom")
    public void IClickSortFromPriceChangeCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmPriceChangeSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_price_change']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmPriceChangeSort).perform();
            CcmPriceChangeSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsPriceChange = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPriceChange.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_price_change']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPriceChange.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsPriceChange);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Great Deal Rating from carsDotCom")
    public void IClickSortFromGreatDealRatingCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmGreatDealRatingSort).perform();
            CcmGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price At Great Deal Rating from carsDotCom")
    public void IClickSortFromPriceAtGreatDealRatingCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmPriceAtGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_price_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmPriceAtGreatDealRatingSort).perform();
            CcmPriceAtGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsPriceAtGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPriceAtGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_price_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPriceAtGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsPriceAtGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price Change At Great Deal Rating from carsDotCom")
    public void IClickSortFromPriceChangeAtGreatDealRatingCcm() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmPriceChangeAtGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_price_change_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmPriceChangeAtGreatDealRatingSort).perform();
            CcmPriceChangeAtGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price_change_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CarsPriceChangeAtGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPriceChangeAtGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_price_change_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price_change_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CarsPriceChangeAtGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CarsPriceChangeAtGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from carfax")
    public void IClickSortFromDealratingCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxDealRatingSort).perform();
            CfxDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from carfax")
    public void IClickSortFromPriceCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxPriceSort).perform();
            CfxPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from New Deal Rating from carfax")
    public void IClickSortFromNewDealratingCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxNewDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxNewDealRatingSort).perform();
            CfxNewDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxNewDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxNewDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_new_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_new_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxNewDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxNewDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from New Price from carfax")
    public void IClickSortFromNewPriceCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxNewPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_new_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxNewPriceSort).perform();
            CfxNewPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxNewPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxNewPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_new_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_new_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxNewPrice.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxNewPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price Change from carfax")
    public void IClickSortFromPriceChangeCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxPriceChangeSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_price_change']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxPriceChangeSort).perform();
            CfxPriceChangeSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxPriceChange = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPriceChange.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_price_change']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPriceChange.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxPriceChange);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Great Deal Rating from carfax")
    public void IClickSortFromGreatDealRatingCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxGreatDealRatingSort).perform();
            CfxGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price At Great Deal Rating from carfax")
    public void IClickSortFromPriceAtGreatDealRatingCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxPriceAtGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_price_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxPriceAtGreatDealRatingSort).perform();
            CfxPriceAtGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxPriceAtGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPriceAtGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_price_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPriceAtGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxPriceAtGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price Change At Great Deal Rating from carfax")
    public void IClickSortFromPriceChangeAtGreatDealRatingCfx() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxPriceChangeAtGreatDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_price_change_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxPriceChangeAtGreatDealRatingSort).perform();
            CfxPriceChangeAtGreatDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.TipReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price_change_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            TipRprt.CfxPriceChangeAtGreatDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPriceChangeAtGreatDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_price_change_at_great_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price_change_at_great_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                TipRprt.CfxPriceChangeAtGreatDealRating.add(cellText);
            }

            System.out.println("CheckData"+ TipRprt.CfxPriceChangeAtGreatDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("price from cargurus has data for cargurus")
    public void price_from_cargurus_has_data_for_cargurus() {
        try {
            boolean allUnknown = TipRprt.CgrPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from cargurus has data for cargurus")
    public void deal_rating_from_cargurus_has_data_for_cargurus() {
        try {
            boolean allUnknown = TipRprt.CgrDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("new deal rating from cargurus has data for cargurus")
    public void new_deal_rating_from_cargurus_has_data_for_cargurus() {
        try {
            boolean allUnknown = TipRprt.CgrNewDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("new price from cargurus has data for cargurus")
    public void new_price_from_cargurus_has_data_for_cargurus() {
        try {
            boolean allUnknown = TipRprt.CgrNewPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("price change from cargurus has data for cargurus")
    public void price_change_from_cargurus_has_data_for_cargurus() {
        try {
            boolean allUnknown = TipRprt.CgrPriceChange.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from cargurus has data for autotrader")
    public void deal_rating_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price from cargurus has data for autotrader")
    public void price_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("New Deal Rating from cargurus has data for autotrader")
    public void new_deal_rating_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoNewDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("New Price from cargurus has data for autotrader")
    public void new_price_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoNewPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price Change from cargurus has data for autotrader")
    public void price_change_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoPriceChange.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Great Deal Rating from cargurus has data for autotrader")
    public void great_deal_rating_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price At Great Deal Rating from cargurus has data for autotrader")
    public void price_at_great_deal_rating_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoPriceAtGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price Change At Great Deal Rating from cargurus has data for autotrader")
    public void price_change_at_great_deal_rating_from_cargurus_has_data_for_autotrader() {
        try {
            boolean allUnknown = TipRprt.AutoPriceChangeAtGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from cargurus has data for carsDotCom")
    public void deal_rating_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    @Then("Price from cargurus has data for carsDotCom")
    public void price_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("New Deal Rating from cargurus has data for carsDotCom")
    public void new_deal_rating_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsNewDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("New Price from cargurus has data for carsDotCom")
    public void new_price_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsNewPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price Change from cargurus has data for carsDotCom")
    public void price_change_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsPriceChange.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Great Deal Rating from cargurus has data for carsDotCom")
    public void great_deal_rating_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price At Great Deal Rating from cargurus has data for carsDotCom")
    public void price_at_great_deal_rating_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsPriceAtGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price Change At Great Deal Rating from cargurus has data for carsDotCom")
    public void price_change_at_great_deal_rating_from_cargurus_has_data_for_cars_dot_com() {
        try {
            boolean allUnknown = TipRprt.CarsPriceChangeAtGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from cargurus has data for carfax")
    public void deal_rating_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price from cargurus has data for carfax")
    public void price_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("New Deal Rating from cargurus has data for carfax")
    public void new_deal_rating_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxNewDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("New Price from cargurus has data for carfax")
    public void new_price_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxNewPrice.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price Change from cargurus has data for carfax")
    public void price_change_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxPriceChange.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Great Deal Rating from cargurus has data for carfax")
    public void great_deal_rating_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price At Great Deal Rating from cargurus has data for carfax")
    public void price_at_great_deal_rating_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxPriceAtGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price Change At Great Deal Rating from cargurus has data for carfax")
    public void price_change_at_great_deal_rating_from_cargurus_has_data_for_carfax() {
        try {
            boolean allUnknown = TipRprt.CfxPriceChangeAtGreatDealRating.stream().allMatch(col -> col.equals("-"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }


}
