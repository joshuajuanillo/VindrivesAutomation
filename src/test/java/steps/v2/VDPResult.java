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
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.CargurusRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.CargurusRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


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

    @When("I click sort from AutoTrader rank from Vdp Result")
    public void IClickSortFromAutotraderRankVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcRankSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcRankSort).perform();
            AtcRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.AutoTraderRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.AutoTraderRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.AutoTraderRank.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.AutoTraderRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from CarsDotCom rank from Vdp Result")
    public void IClickSortFromCcmRankVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmRankSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmRankSort).perform();
            CcmRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.CarsDotComRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.CarsDotComRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.CarsDotComRank.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.CarsDotComRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax rank from Vdp Result")
    public void IClickSortFromCfxRankVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxRankSort).perform();
            CfxRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.CarfaxRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.CarfaxRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.CarfaxRank.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.CarfaxRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from Vdp Result")
    public void IClickSortFromPriceVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PriceSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PriceSort).perform();
            PriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.Price = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.Price.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.Price.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.Price);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Last Price Change from Vdp Result")
    public void IClickSortFromLastPriceVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LastPriceSort =  Utility.driver.findElement(By.xpath("//th[@id='last_price_change']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LastPriceSort).perform();
            LastPriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='last_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.LastPriceChange = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.LastPriceChange.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='last_price_change']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='last_price_change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.LastPriceChange.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.LastPriceChange);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Default Percent of Market from Vdp Result")
    public void IClickSortFromDefaultPercentOfMarketVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DefaultPercentSort =  Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DefaultPercentSort).perform();
            DefaultPercentSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.DefaultPercenOfMarket = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.DefaultPercenOfMarket.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.DefaultPercenOfMarket.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.DefaultPercenOfMarket);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from DOL from Vdp Result")
    public void IClickSortFromDolVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DolSort =  Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DolSort).perform();
            DolSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.Dol = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.Dol.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.Dol.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.Dol);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Photos from Vdp Result")
    public void IClickSortFromPhotosVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PhotosSort =  Utility.driver.findElement(By.xpath("//th[@id='photos_count']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PhotosSort).perform();
            PhotosSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos_count']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.Photos = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.Photos.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='photos_count']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos_count']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.Photos.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.Photos);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax Pulls from Vdp Result")
    public void IClickSortFromCarfaxVdpResult() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxSort =  Utility.driver.findElement(By.xpath("//th[@id='total_carfax_pull']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxSort).perform();
            CfxSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement VDPResultTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_carfax_pull']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            VdpRslt.CarfaxPulls = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                VdpRslt.CarfaxPulls.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_carfax_pull']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = VDPResultTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_carfax_pull']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                VdpRslt.CarfaxPulls.add(cellText);
            }

            System.out.println("CheckData"+ VdpRslt.CarfaxPulls);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("cargurus rank from Vdp Result should have data")
    public void CargurusRankFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = VdpRslt.CargurusRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("AutoTrader rank from Vdp Result should have data")
    public void AutotraderRankFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = VdpRslt.AutoTraderRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("CarsDotCom rank from Vdp Result should have data")
    public void CarsDotComRankFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = VdpRslt.CarsDotComRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax rank from Vdp Result should have data")
    public void CarfaxRankFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = VdpRslt.CarfaxRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price from Vdp Result should have data")
    public void PriceFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = VdpRslt.Price.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Last Price Change from Vdp Result should have data")
    public void LastPriceChangeFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = VdpRslt.LastPriceChange.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Default Percent of Market from Vdp Result should have data")
    public void DefaultPercentofMarketFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean NAData = VdpRslt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("N/A"));
            System.out.println("All N/A List ? " + NAData);
            Assert.assertNotEquals("Values should not be true",true, NAData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("DOL from Vdp Result should have data")
    public void DOLFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = VdpRslt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("0"));
            System.out.println("All N/A List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Photos from Vdp Result should have data")
    public void PhotosFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = VdpRslt.Photos.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax Pulls from Vdp Result should have data")
    public void CarfaxPullsFromVDPResultShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = VdpRslt.CarfaxPulls.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

}
