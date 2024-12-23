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
import Utility.PreShootRprt;

public class PreShootReport {
    @When("I click sort from Price Pre Shoot Report")
    public void IClickSortFromPricePreShootReport() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PriceSort =  Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PriceSort).perform();
            PriceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement PreShootReportTable = Utility.driver.findElement(By.xpath(DemoClient.PreshootReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            PreShootRprt.Price = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                PreShootRprt.Price.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='price']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='atc_price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                PreShootRprt.Price.add(cellText);
            }

            System.out.println("CheckData"+ PreShootRprt.Price);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Dol Pre Shoot Report")
    public void IClickSortFromDolPreShootReport() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement dolSort =  Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(dolSort).perform();
            dolSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement PreShootReportTable = Utility.driver.findElement(By.xpath(DemoClient.PreshootReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            PreShootRprt.Dol = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                PreShootRprt.Dol.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='dol']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='dol']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                PreShootRprt.Dol.add(cellText);
            }

            System.out.println("CheckData"+ PreShootRprt.Dol);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Images Pre Shoot Report")
    public void IClickSortFromImagesPreShootReport() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement PhotosCountSort =  Utility.driver.findElement(By.xpath("//th[@id='photos_count']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(PhotosCountSort).perform();
            PhotosCountSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement PreShootReportTable = Utility.driver.findElement(By.xpath(DemoClient.PreshootReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos_count']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            PreShootRprt.Images = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                PreShootRprt.Images.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='photos_count']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='photos_count']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                PreShootRprt.Images.add(cellText);
            }

            System.out.println("CheckData"+ PreShootRprt.Images);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Total Vdps Pre Shoot Report")
    public void IClickSortFromTotalVdpsPreShootReport() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement TotalVdpsSort =  Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']"));
            actions.moveToElement(TotalVdpsSort).perform();
            TotalVdpsSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement PreShootReportTable = Utility.driver.findElement(By.xpath(DemoClient.PreshootReportTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            PreShootRprt.TotalVdps = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                PreShootRprt.TotalVdps.add(cellText);
            }

            Utility.driver.findElement(By.xpath("//th[@id='total_vdps']//div[@class='css-4g6ai3']//*[name()='svg']")).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = PreShootReportTable.findElements(By.xpath("//table//tr/td[count((//table//th[@id='total_vdps']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                PreShootRprt.TotalVdps.add(cellText);
            }

            System.out.println("CheckData"+ PreShootRprt.TotalVdps);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("price from Pre Shoot Report should have data")
    public void PriceFromPreShootReportShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = PreShootRprt.Price.stream().allMatch(col -> col.equals("$0"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("dol from Pre Shoot Report should have data")
    public void dolFromPreShootReportShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = PreShootRprt.Dol.stream().allMatch(col -> col.equals("$0"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("images from Pre Shoot Report should have data")
    public void imagesFromPreShootReportShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = PreShootRprt.Images.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("total Vdps from Pre Shoot Report should have data")
    public void totalVdpsFromPreShootReportShouldHaveData() throws InterruptedException {
        try {
            boolean allUnknown = PreShootRprt.TotalVdps.stream().allMatch(col -> col.equals("0"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
