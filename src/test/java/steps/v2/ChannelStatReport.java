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
import Utility.ChannelStatRprt;

public class ChannelStatReport {

    @When("I click sort from Price from autotrader ChannelStat")
    public void IClickSortFromPriceAtcChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcPriceSort).perform();
            AtcPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.AutoPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoPrice.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.AutoPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from autotrader ChannelStat")
    public void IClickSortFromDealRatingAtcChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcDealRatingSort).perform();
            AtcDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.AutoDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoDealRating.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.AutoDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from srp from autotrader ChannelStat")
    public void IClickSortFromsrpAtcChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcSrpSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_total_srps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcSrpSort).perform();
            AtcSrpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.AutoSRP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoSRP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_total_srps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoSRP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.AutoSRP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from vdp from autotrader ChannelStat")
    public void IClickSortFromvdpAtcChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcVdpsSort).perform();
            AtcVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.AutoVDP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoVDP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoVDP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.AutoVDP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from srp and vdp from autotrader ChannelStat")
    public void IClickSortFromSrpAndVdpAtcChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcSrpVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_srps_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcSrpVdpsSort).perform();
            AtcSrpVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.AutoSRPandVDP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoSRPandVDP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.AutoSRPandVDP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.AutoSRPandVDP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from cargurus ChannelStat")
    public void IClickSortFromPriceCgrChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrPriceSort).perform();
            CgrPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CgrPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CgrPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CgrPrice.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CgrPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from cargurus ChannelStat")
    public void IClickSortFromDealRatingCgrChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrDealRatingSort).perform();
            CgrDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CgrDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CgrDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CgrDealRating.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CgrDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from vdp from cargurus ChannelStat")
    public void IClickSortFromvdpCgrChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrVdpsSort).perform();
            CgrVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CgrVDP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CgrVDP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CgrVDP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CgrVDP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from carsdotcom ChannelStat")
    public void IClickSortFromPriceCcmChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmPriceSort).perform();
            CcmPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CcmPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmPrice.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CcmPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from carsdotcom ChannelStat")
    public void IClickSortFromDealRatingCcmChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmDealRatingSort).perform();
            CcmDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CcmDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmDealRating.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CcmDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from srp from carsdotcom ChannelStat")
    public void IClickSortFromsrpCcmChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmSrpSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_total_srps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmSrpSort).perform();
            CcmSrpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CcmSRP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmSRP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_total_srps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmSRP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CcmSRP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from vdp from carsdotcom ChannelStat")
    public void IClickSortFromvdpCcmChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmVdpsSort).perform();
            CcmVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CcmVDP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmVDP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmVDP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CcmVDP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from srp and vdp from carsdotcom ChannelStat")
    public void IClickSortFromSrpAndVdpCcmChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmSrpVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_srps_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmSrpVdpsSort).perform();
            CcmSrpVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CcmSRPandVDP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmSRPandVDP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CcmSRPandVDP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CcmSRPandVDP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from carfax ChannelStat")
    public void IClickSortFromPriceCfxChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxPriceSort).perform();
            CfxPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CfxPrice = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CfxPrice.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CfxPrice.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CfxPrice);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from deal rating from carfax ChannelStat")
    public void IClickSortFromDealRatingCfxChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxDealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxDealRatingSort).perform();
            CfxDealRatingSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CfxDealRating = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CfxDealRating.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CfxDealRating.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CfxDealRating);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from vdp from carfax ChannelStat")
    public void IClickSortFromvdpCfxChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxVdpsSort).perform();
            CfxVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.CfxVDP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CfxVDP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.CfxVDP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.CfxVDP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from vdp from website ChannelStat")
    public void IClickSortFromvdpGaChannelStat() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement GaVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='ga_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(GaVdpsSort).perform();
            GaVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement ChannelStatTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ga_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            ChannelStatRprt.GaVDP = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.GaVDP.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ga_total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = ChannelStatTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ga_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                ChannelStatRprt.GaVDP.add(cellText);
            }

            System.out.println("CheckData"+ ChannelStatRprt.GaVDP);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("price from autotrader ChannelStat should have data")
    public void PriceFromAutotraderChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoPrice.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from autotrader ChannelStat should have data")
    public void DealRatingFromAutoTraderChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoDealRating.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("srp from autotrader ChannelStat should have data")
    public void srpFromAutoTraderChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoSRP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("vdp from autotrader ChannelStat should have data")
    public void VdpFromVdpChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoVDP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("srp and vdp from autotrader ChannelStat should have data")
    public void SrpAndVdpFromVdpChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoSRPandVDP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("price from cargurus ChannelStat should have data")
    public void PriceFromCargurusChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.CgrPrice.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from cargurus ChannelStat should have data")
    public void DealRatingFromCargurusChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.CgrDealRating.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("vdp from cargurus ChannelStat should have data")
    public void vdpFromCargurusChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.CgrVDP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("price from carsdotcom ChannelStat should have data")
    public void PriceFromcarsdotcomChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoPrice.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from carsdotcom ChannelStat should have data")
    public void DealRatingFromcarsdotcomChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoDealRating.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("srp from carsdotcom ChannelStat should have data")
    public void srpFromcarsdotcomChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoSRP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("vdp from carsdotcom ChannelStat should have data")
    public void VdpFromcarsdotcomChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoVDP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("srp and vdp from carsdotcom ChannelStat should have data")
    public void SrpAndVdpFromcarsdotcomChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.AutoSRPandVDP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("price from carfax ChannelStat should have data")
    public void PriceFromCarfaxChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.CgrPrice.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("deal rating from carfax ChannelStat should have data")
    public void DealRatingFromCarfaxChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.CgrDealRating.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("vdp from carfax ChannelStat should have data")
    public void vdpFromCarfaxChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.CgrVDP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("vdp from website ChannelStat should have data")
    public void vdpFromWebsiteChannelStatShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = ChannelStatRprt.GaVDP.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

}
