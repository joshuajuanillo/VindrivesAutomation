package steps;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class advanceReportStepsDifinition {
    @When("I navigate to the {string} from advance Report")
    public void i_navigate_to_the_from_merchandising_report(String reportName) throws InterruptedException {
        switch (reportName) {
            case "Leads":
                Utility.driver.findElement(By.xpath(DemoClient.LeadsTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.Leads)).click();
                break;
            case "Most VDPs":
                Utility.driver.findElement(By.xpath(DemoClient.LeadsTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.MostVdps)).click();
                break;
            case "Least VDPs":
                Utility.driver.findElement(By.xpath(DemoClient.LeadsTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.LeastVdps)).click();
                break;
            case "Days on Lot":
                Utility.driver.findElement(By.xpath(DemoClient.LeadsTab)).click();
                Utility.driver.findElement(By.xpath(DemoClient.DaysOnLot)).click();
                break;
        }

    }
}
