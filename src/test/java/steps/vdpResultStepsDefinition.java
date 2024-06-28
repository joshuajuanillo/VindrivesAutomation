package steps;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class vdpResultStepsDefinition {
    @When("I navigate to the VDP Result")
    public void i_navigate_to_vdp_result() throws InterruptedException {
        Utility.driver.findElement(By.xpath(DemoClient.VdpResults)).click();
        Thread.sleep(10000);
    }
}
