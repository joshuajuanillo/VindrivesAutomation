package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
//                    "src/test/java/feature/DemoClient.feature",
//                    "src/test/java/feature/BillBrandtFord.feature",
//                    "src/test/java/feature/NewInventory/BillBrandtFord.feature",
                "src/test/java/feature/DemoClient/UsedInventory/ApplicationSetup.feature",
                "src/test/java/feature/DemoClient/UsedInventory/F_PreShootReport.feature",
                "src/test/java/feature/DemoClient/UsedInventory/F_VDPResult.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/G_LeadsReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/H_MostVDPsReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/I_LeastVDPsReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/J_DaysOnLotReport.feature",
                "src/test/java/feature/DemoClient/UsedInventory/Z_Logout.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/",

        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
//        tags = "@newTestCase"
)
public class TestRunner {}
 