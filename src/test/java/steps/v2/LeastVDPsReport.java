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
import Utility.LeastVDPsRprt;

public class LeastVDPsReport {
    @When("I click sort from cargurus rank from Least VDPs")
    public void IClickSortFromCargurusRankLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrRankSort).perform();
            CgrRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.CargurusRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CargurusRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CargurusRank.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.CargurusRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from AutoTrader rank from Least VDPs")
    public void IClickSortFromAutotraderRankLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcRankSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcRankSort).perform();
            AtcRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.AutoTraderRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.AutoTraderRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.AutoTraderRank.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.AutoTraderRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from CarsDotCom rank from Least VDPs")
    public void IClickSortFromCcmRankLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmRankSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmRankSort).perform();
            CcmRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.CarsDotComRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CarsDotComRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CarsDotComRank.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.CarsDotComRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax rank from Least VDPs")
    public void IClickSortFromCfxRankLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxRankSort).perform();
            CfxRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.CarfaxRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CarfaxRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CarfaxRank.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.CarfaxRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from Least VDPs")
    public void IClickSortFromPriceLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PriceSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PriceSort).perform();
            PriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.Price = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Price.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Price.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.Price);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Default Percent of Market from Least VDPs")
    public void IClickSortFromDefaultPercentOfMarketLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DefaultPercentSort =  Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DefaultPercentSort).perform();
            DefaultPercentSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.DefaultPercenOfMarket = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.DefaultPercenOfMarket.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.DefaultPercenOfMarket.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.DefaultPercenOfMarket);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from DOL from Least VDPs")
    public void IClickSortFromDolLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DolSort =  Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DolSort).perform();
            DolSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.Dol = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Dol.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Dol.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.Dol);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Photos from Least VDPs")
    public void IClickSortFromPhotosLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PhotosSort =  Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PhotosSort).perform();
            PhotosSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.Photos = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Photos.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Photos.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.Photos);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads from Least VDPs")
    public void IClickSortFromLeadsLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadSort =  Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadSort).perform();
            LeadSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.Leads = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Leads.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Leads.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.Leads);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from VDPs from Least VDPs")
    public void IClickSortFromVdpsLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement VdpSort =  Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(VdpSort).perform();
            VdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.Vdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Vdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.Vdps.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.Vdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads and Vdps from Least VDPs")
    public void IClickSortFromLeadsAndVdpsLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadVdpSort =  Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadVdpSort).perform();
            LeadVdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.LeadsVdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.LeadsVdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.LeadsVdps.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.LeadsVdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax Pulls from Least VDPs")
    public void IClickSortFromCarfaxLeastVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxSort =  Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxSort).perform();
            CfxSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement LeastVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            LeastVDPsRprt.CarfaxPulls = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CarfaxPulls.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = LeastVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                LeastVDPsRprt.CarfaxPulls.add(cellText);
            }

            System.out.println("CheckData"+ LeastVDPsRprt.CarfaxPulls);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("cargurus rank from Least VDPs should have data")
    public void CargurusRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeastVDPsRprt.CargurusRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("AutoTrader rank from Least VDPs should have data")
    public void AutotraderRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeastVDPsRprt.AutoTraderRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("CarsDotCom rank from Least VDPs should have data")
    public void CarsDotComRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeastVDPsRprt.CarsDotComRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax rank from Least VDPs should have data")
    public void CarfaxRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = LeastVDPsRprt.CarfaxRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price from Least VDPs should have data")
    public void PriceFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeastVDPsRprt.Price.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Default Percent of Market from Least VDPs should have data")
    public void DefaultPercentofMarketFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean NAData = LeastVDPsRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("N/A"));
            System.out.println("All N/A List ? " + NAData);
            Assert.assertNotEquals("Values should not be true",true, NAData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("DOL from Least VDPs should have data")
    public void DOLFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeastVDPsRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("0"));
            System.out.println("All N/A List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Photos from Least VDPs should have data")
    public void PhotosFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeastVDPsRprt.Photos.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads from Least VDPs should have data")
    public void LeadsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeastVDPsRprt.Leads.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Vdps from Least VDPs should have data")
    public void VdpsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeastVDPsRprt.Vdps.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads and Vdps from Least VDPs should have data")
    public void LeadsAndVdpsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeastVDPsRprt.LeadsVdps.stream().allMatch(col -> col.equals("0.00%"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax Pulls from Least VDPs should have data")
    public void CarfaxPullsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = LeastVDPsRprt.CarfaxPulls.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
