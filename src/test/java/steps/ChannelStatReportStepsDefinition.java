package steps;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import Utility.GlobalUtility;

public class ChannelStatReportStepsDefinition {
    @And("I click twice the sort by function in Price column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_price']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector
        actions.moveToElement(DemoClientTable).perform();
        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='atc_price']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='atc_deal_rating']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in SRP column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInSRPColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_total_srps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='atc_total_srps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in VDP column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInVDPColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_total_vdps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='atc_total_vdps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in SRP VDP Ratio column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInSRPVDPRatioColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='atc_srps_vdps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='atc_srps_vdps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in Price column and data are not unknown from Channel stat report cargurus")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknownFromChannelStatReportCargurus() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_price']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector
        actions.moveToElement(DemoClientTable).perform();
        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='cgr_price']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report cargurus")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknownFromChannelStatReportCargurus() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='cgr_deal_rating']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in VDP column and data are not unknown from Channel stat report cargurus")
    public void iClickTwiceTheSortByFunctionInVDPColumnAndDataAreNotUnknownFromChannelStatReportCargurus() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='cgr_total_vdps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='cgr_total_vdps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in Price column and data are not unknown from Channel stat report CarsDotCom")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknownFromChannelStatReportCarsDotCom() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_price']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector
        actions.moveToElement(DemoClientTable).perform();
        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='ccm_price']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report CarsDotCom")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknownFromChannelStatReportCarsDotCom() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='ccm_deal_rating']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in SRP column and data are not unknown from Channel stat report CarsDotCom")
    public void iClickTwiceTheSortByFunctionInSRPColumnAndDataAreNotUnknownFromChannelStatReportCarsDotCom() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_total_srps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='ccm_total_srps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in VDP column and data are not unknown from Channel stat report CarsDotCom")
    public void iClickTwiceTheSortByFunctionInVDPColumnAndDataAreNotUnknownFromChannelStatReportCarsDotCom() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_total_vdps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='ccm_total_vdps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in SRP VDP Ratio column and data are not unknown from Channel stat report CarsDotCom")
    public void iClickTwiceTheSortByFunctionInSRPVDPRatioColumnAndDataAreNotUnknownFromChannelStatReportCarsDotCom() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ccm_srps_vdps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='ccm_srps_vdps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }

    @And("I click twice the sort by function in VDP column and data are not unknown from Channel stat report website")
    public void iClickTwiceTheSortByFunctionInVDPColumnAndDataAreNotUnknownFromChannelStatReportWebsite() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement dealRatingSort =  Utility.driver.findElement(By.xpath("//th[@id='ga_total_vdps']//*[name()='svg']"));
        actions.moveToElement(dealRatingSort).perform();
        dealRatingSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ga_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        System.out.println("New Price result: " + DemoClientCargurusDealsByRating);

        Utility.driver.findElement(By.xpath("//th[@id='ga_total_vdps']//*[name()='svg']")).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ga_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary

        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);
        Thread.sleep(20000);
    }
}
