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
import Utility.LeadsRprt;

public class LeadsReport {
    @When("I click sort from cargurus rank from Leads")
    public void IClickSortFromCargurusRankLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrRankSort).perform();
            CgrRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.CargurusRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.CargurusRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.CargurusRank.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.CargurusRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from AutoTrader rank from Leads")
    public void IClickSortFromAutotraderRankLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcRankSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcRankSort).perform();
            AtcRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.AutoTraderRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.AutoTraderRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.AutoTraderRank.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.AutoTraderRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from CarsDotCom rank from Leads")
    public void IClickSortFromCcmRankLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmRankSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmRankSort).perform();
            CcmRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.CarsDotComRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.CarsDotComRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.CarsDotComRank.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.CarsDotComRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax rank from Leads")
    public void IClickSortFromCfxRankLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxRankSort).perform();
            CfxRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.CarfaxRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.CarfaxRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.CarfaxRank.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.CarfaxRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from Leads")
    public void IClickSortFromPriceLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PriceSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PriceSort).perform();
            PriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.Price = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.Price.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.Price.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.Price);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Default Percent of Market from Leads")
    public void IClickSortFromDefaultPercentOfMarketLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DefaultPercentSort =  Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DefaultPercentSort).perform();
            DefaultPercentSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.DefaultPercenOfMarket = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.DefaultPercenOfMarket.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.DefaultPercenOfMarket.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.DefaultPercenOfMarket);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from DOL from Leads")
    public void IClickSortFromDolLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DolSort =  Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DolSort).perform();
            DolSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.Dol = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.Dol.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.Dol.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.Dol);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Photos from Leads")
    public void IClickSortFromPhotosLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PhotosSort =  Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PhotosSort).perform();
            PhotosSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.Photos = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.Photos.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.Photos.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.Photos);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads from Leads")
    public void IClickSortFromLeadsLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadSort =  Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadSort).perform();
            LeadSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.Leads = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.Leads.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.Leads.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.Leads);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from VDPs from Leads")
    public void IClickSortFromVdpsLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement VdpSort =  Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(VdpSort).perform();
            VdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.Vdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.Vdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.Vdps.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.Vdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads and Vdps from Leads")
    public void IClickSortFromLeadsAndVdpsLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadVdpSort =  Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadVdpSort).perform();
            LeadVdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.LeadsVdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.LeadsVdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.LeadsVdps.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.LeadsVdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax Pulls from Leads")
    public void IClickSortFromCarfaxLeads() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxSort =  Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxSort).perform();
            CfxSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeadsTable = Utility.driver.findElement(By.xpath(DemoClient.LeadsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeadsRprt.CarfaxPulls = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeadsRprt.CarfaxPulls.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeadsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeadsRprt.CarfaxPulls.add(cellText);
            }

            System.out.println("CheckData"+ LeadsRprt.CarfaxPulls);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("cargurus rank from Leads should have data")
    public void CargurusRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeadsRprt.CargurusRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("AutoTrader rank from Leads should have data")
    public void AutotraderRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeadsRprt.AutoTraderRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("CarsDotCom rank from Leads should have data")
    public void CarsDotComRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeadsRprt.CarsDotComRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax rank from Leads should have data")
    public void CarfaxRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeadsRprt.CarfaxRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price from Leads should have data")
    public void PriceFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeadsRprt.Price.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Default Percent of Market from Leads should have data")
    public void DefaultPercentofMarketFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean NAData = LeadsRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("N/A"));
            System.out.println("All N/A List ? " + NAData);
            Assert.assertNotEquals("Values should not be true",true, NAData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("DOL from Leads should have data")
    public void DOLFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeadsRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("0"));
            System.out.println("All N/A List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Photos from Leads should have data")
    public void PhotosFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeadsRprt.Photos.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads from Leads should have data")
    public void LeadsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeadsRprt.Leads.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Vdps from Leads should have data")
    public void VdpsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeadsRprt.Vdps.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads and Vdps from Leads should have data")
    public void LeadsAndVdpsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeadsRprt.LeadsVdps.stream().allMatch(col -> col.equals("0.00%"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax Pulls from Leads should have data")
    public void CarfaxPullsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeadsRprt.CarfaxPulls.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
