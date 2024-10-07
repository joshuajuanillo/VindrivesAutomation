package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                //// New Inventory

                "src/test/java/feature/DemoClient/NewInventory/ApplicationSetup.feature",
//                "src/test/java/feature/DemoClient/NewInventory/B_ResultSummary.feature",
                "src/test/java/feature/DemoClient/NewInventory/E_ChannelStatReport.feature",
//                "src/test/java/feature/DemoClient/NewInventory/F_PreShootReport.feature",
//                "src/test/java/feature/DemoClient/NewInventory/F_VDPResult.feature",
//                "src/test/java/feature/DemoClient/NewInventory/G_LeadsReport.feature",
//                "src/test/java/feature/DemoClient/NewInventory/H_MostVDPsReport.feature",
//                "src/test/java/feature/DemoClient/NewInventory/I_LeastVDPsReport.feature",
//                "src/test/java/feature/DemoClient/NewInventory/J_DaysOnLotReport.feature",
//                "src/test/java/feature/DemoClient/NewInventory/K_BudgetRoi.feature",
//                "src/test/java/feature/DemoClient/NewInventory/L_VDPsByChannel.feature",
//                "src/test/java/feature/DemoClient/NewInventory/M_Top10Website.feature",
//                "src/test/java/feature/DemoClient/NewInventory/N_VDPRoi.feature",

                //// Used Inventory

//                "src/test/java/feature/DemoClient/UsedInventory/ApplicationSetup.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/B_ResultSummary.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/C_DealRatingByChannel.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/D_TipReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/E_ChannelStatReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/F_PreShootReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/F_VDPResult.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/G_LeadsReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/H_MostVDPsReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/I_LeastVDPsReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/J_DaysOnLotReport.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/K_BudgetRoi.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/L_VDPsByChannel.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/M_Top10Website.feature",
//                "src/test/java/feature/DemoClient/UsedInventory/N_VDPRoi.feature",

                "src/test/java/feature/DemoClient/UsedInventory/Z_Logout.feature"
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
//        tags = "@newTestCase"
)
public class TestRunner {}
 