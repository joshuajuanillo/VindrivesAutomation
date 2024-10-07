package steps;

import Resources.ChannelStatReport;
import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
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

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderPriceSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderPriceSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderDealRatingSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderDealRatingSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in SRP column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInSRPColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComSrpSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComSrpSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_srps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in VDP column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInVDPColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderVdpSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderVdpSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in SRP VDP Ratio column and data are not unknown from Channel stat report")
    public void iClickTwiceTheSortByFunctionInSRPVDPRatioColumnAndDataAreNotUnknownFromChannelStatReport() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderSRPVDPsSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.autotraderSRPVDPsSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfALlZeroPercent(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in Price column and data are not unknown from Channel stat report cargurus")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknownFromChannelStatReportCargurus() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carGurusPriceSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(ChannelStatReport.carGurusPriceSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report cargurus")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknownFromChannelStatReportCargurus() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carGurusDealRatingSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.carGurusDealRatingSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in VDP column and data are not unknown from Channel stat report cargurus")
    public void iClickTwiceTheSortByFunctionInVDPColumnAndDataAreNotUnknownFromChannelStatReportCargurus() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carGurusVdpSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.carGurusVdpSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='cgr_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in Price column and data are not unknown from Channel stat report CarsDotCom")
    public void iClickTwiceTheSortByFunctionInPriceColumnAndDataAreNotUnknownFromChannelStatReportCarsDotCom() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComPriceSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

        Thread.sleep(10000);
        // Locate the table
        WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.ChannelStatReportTable)); // Change to the actual table ID or selector

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
        ArrayList<String> DemoClientCargurusDealsByRating = new ArrayList<>();

        for (WebElement cell : columnCells) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComPriceSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllNullData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report CarsDotCom")
    public void iClickTwiceTheSortByFunctionInDealRatingColumnAndDataAreNotUnknownFromChannelStatReportCarsDotCom() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComDealRatingSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComDealRatingSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_deal_rating']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkAllUnkownData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
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

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComVdpSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComVdpSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfAllZeroData(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @And("I click twice the sort by function in VDP column and data are not unknown from Channel stat report website")
    public void iClickTwiceTheSortByFunctionInVDPColumnAndDataAreNotUnknownFromChannelStatReportWebsite() throws InterruptedException {
        // Scroll to the element using Actions
        Actions actions = new Actions(Utility.driver);

        WebElement cargurusSort =  Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComSRPVDPsSort));
        actions.moveToElement(cargurusSort).perform();
        cargurusSort.click();

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

        Utility.driver.findElement(By.xpath(ChannelStatReport.carsDotComSRPVDPsSort)).click();
        Thread.sleep(10000);

        // Locate the specific column (e.g., the second column)
        List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='ccm_srps_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


        for (WebElement cell : columnCells2) {
            String cellText = cell.getText().trim();
            DemoClientCargurusDealsByRating.add(cellText);
        }

        GlobalUtility.checkIfALlZeroPercent(DemoClientCargurusDealsByRating);

        Thread.sleep(10000);
    }

    @When("I click customize Button and select all provider")
    public void iClickCustomizeButtonAndSelectAllProvider() throws InterruptedException {
        List<WebElement> AutoTrader = Utility.driver.findElements(By.xpath("//th[@id='1_Autotrader_atc_price']"));
        List<WebElement> Cargurus = Utility.driver.findElements(By.xpath("//th[@id='1_CarGurus_cgr_price']"));
        List<WebElement> CarsDotCom = Utility.driver.findElements(By.xpath("//th[@id='1_Cars.com_ccm_price']"));

        Thread.sleep(10000);
        Utility.driver.findElement(By.xpath("//button[@id='popover-trigger-:r1q:']")).click();

        if(AutoTrader.isEmpty()){
            List<WebElement> checkAutrader = Utility.driver.findElements(By.xpath("//body//div[@id='root']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[1]//div[2]//button[1]//*[name()='svg']"));
            Thread.sleep(10000);
            if(!checkAutrader.isEmpty()){
                Utility.driver.findElement(By.xpath("//body//div[@id='root']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[1]//div[2]//button[1]//*[name()='svg']")).click();
            }
        }
        if(Cargurus.isEmpty()){
            Utility.driver.findElement(By.xpath("//div[@id='popover-body-:r1q:']//div[2]//div[2]//button[1]//*[name()='svg']")).click();
        }
        if(CarsDotCom.isEmpty()){
            Utility.driver.findElement(By.xpath("//div[@class='css-1qm3vnl']//div[3]//div[2]//button[1]//*[name()='svg']")).click();
        }
        Thread.sleep(10000);
        Utility.driver.findElement(By.xpath("//button[@id='popover-trigger-:r1p:']")).click();
        Thread.sleep(10000);

    }
}
