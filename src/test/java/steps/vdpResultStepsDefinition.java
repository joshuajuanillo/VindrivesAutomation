package steps;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utility.GlobalUtility;

import java.util.ArrayList;
import java.util.List;

public class vdpResultStepsDefinition {
    @When("I navigate to the VDP Result")
    public void i_navigate_to_vdp_result() throws InterruptedException {
        Utility.driver.findElement(By.xpath(DemoClient.VdpResults)).click();
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Cargurus Rank column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInCargurusRankColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus Rank']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus Rank']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in AutoTrader Rank column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInAutoTraderRankColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='AutoTrader Rank']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='AutoTrader Rank']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Cars.com Rank column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInCarsComRankColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com Rank']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com Rank']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in VDPs column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInVDPsColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='vdps']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='VDPs']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='VDPs']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Leads column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInLeadsColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='leads']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Leads']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);

    }

    @Then("I click twice the sort by function in Price column and data are not unknown in VDP Result")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknownInVDPResult() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Last Price column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInLastPriceColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='last_price_change']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Last Price Change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Last Price Change']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNAData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
        
    }

    @Then("I click twice the sort by function in Default % of Market column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInDefaultOfMarketColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='default_percentage_to_market']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Default % of Market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Default % of Market']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNAData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
        
    }

    @Then("I click twice the sort by function in DOL column and data are not unknown in VDP Result")
    public void iClickTwiceTheSortByFunctionInDOLColumnAndDataAreNotUnknownInVDPResult() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='DOL']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='DOL']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
        
    }

    @Then("I click twice the sort by function in Photos Rank column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInPhotosRankColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='photos_count']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Carfax Pulls column and data are not unknown")
    public void iClickTwiceTheSortByFunctionInCarfaxPullsColumnAndDataAreNotUnknown() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='total_carfax_pull']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarFax Pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarFax Pulls']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @Then("I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result")
    public void iClickTwiceTheSortByFunctionInLeadsVDPsColumnAndDataAreNotUnknownInVDPResult() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='leads_vdps']//div[@class='css-4g6ai3']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(5000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.VdpResultTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Leads/VDP']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }


        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();
        Thread.sleep(5000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Leads/VDP']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfALlZeroPercent(DemoClientCargurusDealsByRating);
        Thread.sleep(5000);
    }

    @And("I click customize Button and select all provider in VDP Result")
    public void iClickCustomizeButtonAndSelectAllProviderInVDPResult() throws InterruptedException {
        List<WebElement> AutoTrader = Utility.driver.findElements(By.xpath("//th[@id='atc_deal_rating']"));
        List<WebElement> Cargurus = Utility.driver.findElements(By.xpath("//th[@id='cgr_deal_rating']"));
        List<WebElement> CarsDotCom = Utility.driver.findElements(By.xpath("//th[@id='ccm_deal_rating']"));

        Thread.sleep(10000);
        Actions actions = new Actions(Utility.driver);

        WebElement customizeButton =  Utility.driver.findElement(By.xpath("//button[text()='Customize']"));
        actions.moveToElement(customizeButton).perform();
        customizeButton.click();

        if(AutoTrader.isEmpty()){
            List<WebElement> checkAutorader = Utility.driver.findElements(By.xpath("//body//div[@id='root']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[1]//div[2]//button[1]//*[name()='svg']"));
            Thread.sleep(5000);
            if(!checkAutorader.isEmpty()){
                Utility.driver.findElement(By.xpath("//body//div[@id='root']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[1]//div[2]//button[1]//*[name()='svg']")).click();
            }
        }
        if(Cargurus.isEmpty()){
            List<WebElement> CheckCargurus = Utility.driver.findElements(By.xpath("//div[@id='popover-body-:r1q:']//div[2]//div[2]//button[1]//*[name()='svg']"));
            Thread.sleep(5000);
            if(!CheckCargurus.isEmpty()){
                Utility.driver.findElement(By.xpath("//div[@id='popover-body-:r1q:']//div[2]//div[2]//button[1]//*[name()='svg']")).click();
            }
        }
        if(CarsDotCom.isEmpty()){
            List<WebElement> CheckCarsDotcom = Utility.driver.findElements(By.xpath("//div[@class='css-1qm3vnl']//div[3]//div[2]//button[1]//*[name()='svg']"));
            Thread.sleep(5000);
            if(!CheckCarsDotcom.isEmpty()){
                Utility.driver.findElement(By.xpath("//div[@class='css-1qm3vnl']//div[3]//div[2]//button[1]//*[name()='svg']")).click();
            }
        }
        List<WebElement> Providers = Utility.driver.findElements(By.xpath("//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']"));

        // Initialize a flag to track if the text is found
        boolean CarfFaxFound = false;

        // Iterate through the list of WebElements
        for (WebElement element : Providers) {
            // Check if the element's text contains the specific text
            if (element.getText().contains("CarFax")) {
                CarfFaxFound = true;
                break; // Exit the loop if found
            }
        }

        if(CarfFaxFound){
            List<WebElement> Checkcarfax = Utility.driver.findElements(By.xpath("//div[4]//div[2]//button[1]//*[name()='svg']"));
            Thread.sleep(5000);
            if(!Checkcarfax.isEmpty()){
                Utility.driver.findElement(By.xpath("//div[4]//div[2]//button[1]//*[name()='svg']")).click();
            }
        }

        Utility.driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
        Thread.sleep(5000);
    }
}
