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
import Utility.MostVDPsRprt;

public class MostVDPsReport {

    @When("I click sort from cargurus rank from Most VDPs")
    public void IClickSortFromCargurusRankMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CgrRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CgrRankSort).perform();
            CgrRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.CargurusRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CargurusRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CargurusRank.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.CargurusRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from AutoTrader rank from Most VDPs")
    public void IClickSortFromAutotraderRankMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement AtcRankSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(AtcRankSort).perform();
            AtcRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.AutoTraderRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.AutoTraderRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.AutoTraderRank.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.AutoTraderRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from CarsDotCom rank from Most VDPs")
    public void IClickSortFromCcmRankMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CcmRankSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CcmRankSort).perform();
            CcmRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.CarsDotComRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CarsDotComRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CarsDotComRank.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.CarsDotComRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax rank from Most VDPs")
    public void IClickSortFromCfxRankMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxRankSort =  Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxRankSort).perform();
            CfxRankSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.CarfaxRank = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CarfaxRank.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='cfx_deal_rating']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cfx_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CarfaxRank.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.CarfaxRank);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price from Most VDPs")
    public void IClickSortFromPriceMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PriceSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PriceSort).perform();
            PriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.Price = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Price.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Price.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.Price);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Default Percent of Market from Most VDPs")
    public void IClickSortFromDefaultPercentOfMarketMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DefaultPercentSort =  Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DefaultPercentSort).perform();
            DefaultPercentSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.DefaultPercenOfMarket = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.DefaultPercenOfMarket.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='default_percentage_to_market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.DefaultPercenOfMarket.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.DefaultPercenOfMarket);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from DOL from Most VDPs")
    public void IClickSortFromDolMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement DolSort =  Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(DolSort).perform();
            DolSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.Dol = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Dol.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Dol.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.Dol);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Photos from Most VDPs")
    public void IClickSortFromPhotosMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PhotosSort =  Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PhotosSort).perform();
            PhotosSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.Photos = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Photos.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='photos']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Photos.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.Photos);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads from Most VDPs")
    public void IClickSortFromLeadsMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadSort =  Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadSort).perform();
            LeadSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.Leads = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Leads.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_leads']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Leads.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.Leads);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from VDPs from Most VDPs")
    public void IClickSortFromVdpsMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement VdpSort =  Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(VdpSort).perform();
            VdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.Vdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Vdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.Vdps.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.Vdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Leads and Vdps from Most VDPs")
    public void IClickSortFromLeadsAndVdpsMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement LeadVdpSort =  Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(LeadVdpSort).perform();
            LeadVdpSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.LeadsVdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.LeadsVdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='leads_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.LeadsVdps.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.LeadsVdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax Pulls from Most VDPs")
    public void IClickSortFromCarfaxMostVDPs() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement CfxSort =  Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(CfxSort).perform();
            CfxSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement MostVDPsTable = Utility.driver.findElement(By.xpath(DemoClient.MostVdpsTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            MostVDPsRprt.CarfaxPulls = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CarfaxPulls.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='carfax_pulls']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = MostVDPsTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='carfax_pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                MostVDPsRprt.CarfaxPulls.add(cellText);
            }

            System.out.println("CheckData"+ MostVDPsRprt.CarfaxPulls);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("cargurus rank from Most VDPs should have data")
    public void CargurusRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = MostVDPsRprt.CargurusRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("AutoTrader rank from Most VDPs should have data")
    public void AutotraderRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = MostVDPsRprt.AutoTraderRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("CarsDotCom rank from Most VDPs should have data")
    public void CarsDotComRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = MostVDPsRprt.CarsDotComRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax rank from Most VDPs should have data")
    public void CarfaxRankFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean UnknownData = MostVDPsRprt.CarfaxRank.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + UnknownData);
            Assert.assertNotEquals("Values should not be true",true, UnknownData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price from Most VDPs should have data")
    public void PriceFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = MostVDPsRprt.Price.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Default Percent of Market from Most VDPs should have data")
    public void DefaultPercentofMarketFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean NAData = MostVDPsRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("N/A"));
            System.out.println("All N/A List ? " + NAData);
            Assert.assertNotEquals("Values should not be true",true, NAData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("DOL from Most VDPs should have data")
    public void DOLFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = MostVDPsRprt.DefaultPercenOfMarket.stream().allMatch(col -> col.equals("0"));
            System.out.println("All N/A List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Photos from Most VDPs should have data")
    public void PhotosFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = MostVDPsRprt.Photos.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads from Most VDPs should have data")
    public void LeadsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = MostVDPsRprt.Leads.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Vdps from Most VDPs should have data")
    public void VdpsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = MostVDPsRprt.Vdps.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Leads and Vdps from Most VDPs should have data")
    public void LeadsAndVdpsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = MostVDPsRprt.LeadsVdps.stream().allMatch(col -> col.equals("0.00%"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax Pulls from Most VDPs should have data")
    public void CarfaxPullsFromLeadsShouldHaveData() throws InterruptedException {
        try {
            boolean ZeroData = MostVDPsRprt.CarfaxPulls.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Zero List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
