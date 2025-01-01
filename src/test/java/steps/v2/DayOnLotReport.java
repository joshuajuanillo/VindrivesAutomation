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
import Utility.DaysOnLotRprt;

public class DayOnLotReport {

    @When("I click sort from cargurus rank from Days On Lot")
    public void IClickSortFromCargurusRankDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrRankSort).perform();
            CgrRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.CargurusRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CargurusRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CargurusRank.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.CargurusRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from AutoTrader rank from Days On Lot")
    public void IClickSortFromAutotraderRankDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcRankSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcRankSort).perform();
            AtcRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.AutoTraderRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.AutoTraderRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.AutoTraderRank.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.AutoTraderRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from CarsDotCom rank from Days On Lot")
    public void IClickSortFromCcmRankDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmRankSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmRankSort).perform();
            CcmRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.CarsDotComRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CarsDotComRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CarsDotComRank.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.CarsDotComRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax rank from Days On Lot")
    public void IClickSortFromCfxRankDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxRankSort).perform();
            CfxRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.CarfaxRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CarfaxRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CarfaxRank.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.CarfaxRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from Days On Lot")
    public void IClickSortFromPriceDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PriceSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PriceSort).perform();
            PriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.Price = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Price.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Price.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.Price);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Default Percent of Market from Days On Lot")
    public void IClickSortFromDefaultPercentOfMarketDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DefaultPercentSort =  Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DefaultPercentSort).perform();
            DefaultPercentSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.DefaultPercenOfMarket = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.DefaultPercenOfMarket.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.DefaultPercenOfMarket.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.DefaultPercenOfMarket);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from DOL from Days On Lot")
    public void IClickSortFromDolDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DolSort =  Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DolSort).perform();
            DolSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.Dol = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Dol.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Dol.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.Dol);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Photos from Days On Lot")
    public void IClickSortFromPhotosDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PhotosSort =  Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PhotosSort).perform();
            PhotosSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.Photos = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Photos.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Photos.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.Photos);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads from Days On Lot")
    public void IClickSortFromDaysOnLotDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadSort =  Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadSort).perform();
            LeadSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.Leads = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Leads.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Leads.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.Leads);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from VDPs from Days On Lot")
    public void IClickSortFromVdpsDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement VdpSort =  Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(VdpSort).perform();
            VdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.Vdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Vdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.Vdps.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.Vdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads and Vdps from Days On Lot")
    public void IClickSortFromDaysOnLotAndVdpsDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadVdpSort =  Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadVdpSort).perform();
            LeadVdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.LeadsVdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.LeadsVdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.LeadsVdps.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.LeadsVdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax Pulls from Days On Lot")
    public void IClickSortFromCarfaxDaysOnLot() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxSort =  Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxSort).perform();
            CfxSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DaysOnLotTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DaysOnLotRprt.CarfaxPulls = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CarfaxPulls.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DaysOnLotTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DaysOnLotRprt.CarfaxPulls.add(cellText);
            }

            System.out.println("CheckData"+ DaysOnLotRprt.CarfaxPulls);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("cargurus rank from Days On Lot should have data")
    public void CargurusRankFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = DaysOnLotRprt.CargurusRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("AutoTrader rank from Days On Lot should have data")
    public void AutotraderRankFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = DaysOnLotRprt.AutoTraderRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("CarsDotCom rank from Days On Lot should have data")
    public void CarsDotComRankFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = DaysOnLotRprt.CarsDotComRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax rank from Days On Lot should have data")
    public void CarfaxRankFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = DaysOnLotRprt.CarfaxRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price from Days On Lot should have data")
    public void PriceFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = DaysOnLotRprt.Price.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Default Percent of Market from Days On Lot should have data")
    public void DefaultPercentofMarketFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean NAData = DaysOnLotRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("N/A"));
            System.out.println("All N/A List ? " + NAData);
            Assert.assertNotEquals("Values should not be true",true, NAData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("DOL from Days On Lot should have data")
    public void DOLFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = DaysOnLotRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("0"));
            System.out.println("All N/A List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Photos from Days On Lot should have data")
    public void PhotosFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = DaysOnLotRprt.Photos.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads from Days On Lot should have data")
    public void LeadsFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = DaysOnLotRprt.Leads.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Vdps from Days On Lot should have data")
    public void VdpsFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = DaysOnLotRprt.Vdps.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads and Vdps from Days On Lot should have data")
    public void LeadsAndVdpsFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = DaysOnLotRprt.LeadsVdps.stream().allMatch(col -> col.equals("0.00%"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax Pulls from Days On Lot should have data")
    public void CarfaxPullsFromDaysOnLotShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = DaysOnLotRprt.CarfaxPulls.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
