package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
//                //// New Inventory
//
//                "src/test/java/feature/NewInventory/ApplicationSetup.feature",
//                "src/test/java/feature/NewInventory/B_ResultSummary.feature",
//                "src/test/java/feature/NewInventory/E_ChannelStatReport.feature",
//                "src/test/java/feature/NewInventory/F_PreShootReport.feature",
//                "src/test/java/feature/NewInventory/F_VDPResult.feature",
//                "src/test/java/feature/NewInventory/G_LeadsReport.feature",
//                "src/test/java/feature/NewInventory/H_MostVDPsReport.feature",
//                "src/test/java/feature/NewInventory/I_LeastVDPsReport.feature",
//                "src/test/java/feature/NewInventory/J_DaysOnLotReport.feature",
//                "src/test/java/feature/NewInventory/K_BudgetRoi.feature",
//                "src/test/java/feature/NewInventory/L_VDPsByChannel.feature",
//                "src/test/java/feature/NewInventory/M_Top10Website.feature",
//                "src/test/java/feature/NewInventory/N_VDPRoi.feature",
//
//                //// Used Inventory
//
//                "src/test/java/feature/UsedInventory/ApplicationSetup.feature",
//                "src/test/java/feature/UsedInventory/B_ResultSummary.feature",
//                "src/test/java/feature/UsedInventory/C_DealRatingByChannel.feature",
//                "src/test/java/feature/UsedInventory/D_TipReport.feature",
//                "src/test/java/feature/UsedInventory/E_ChannelStatReport.feature",
//                "src/test/java/feature/UsedInventory/F_PreShootReport.feature",
//                "src/test/java/feature/UsedInventory/F_VDPResult.feature",
//                "src/test/java/feature/UsedInventory/G_LeadsReport.feature",
//                "src/test/java/feature/UsedInventory/H_MostVDPsReport.feature",
//                "src/test/java/feature/UsedInventory/I_LeastVDPsReport.feature",
//                "src/test/java/feature/UsedInventory/J_DaysOnLotReport.feature",
//                "src/test/java/feature/UsedInventory/K_BudgetRoi.feature",
//                "src/test/java/feature/UsedInventory/L_VDPsByChannel.feature",
//                "src/test/java/feature/UsedInventory/M_Top10Website.feature",
//                "src/test/java/feature/UsedInventory/N_VDPRoi.feature",
//
//                "src/test/java/feature/UsedInventory/Z_Logout.feature"

                "feature/HealthCheck/UsedInventory/ApplicationSetup.feature",
                "feature/HealthCheck/UsedInventory/B_DealRatingByChannel.feature",
                "feature/HealthCheck/UsedInventory/C_TipReport.feature",
                "feature/HealthCheck/UsedInventory/D_ChannelStatsReport.feature",
                "feature/HealthCheck/UsedInventory/E_PreShootReport.feature",
                "feature/HealthCheck/UsedInventory/F_VDPResult.feature",
                "feature/HealthCheck/UsedInventory/G_LeadsReport.feature",
                "feature/HealthCheck/UsedInventory/H_MostVDPsReport.feature",
                "feature/HealthCheck/UsedInventory/I_LeastVDPsReport.feature",
                "feature/HealthCheck/UsedInventory/J_DaysOnLot.feature",
                "feature/HealthCheck/UsedInventory/K_VDPBoost.feature",
                "feature/HealthCheck/UsedInventory/N_Top10Website.feature",
                "feature/HealthCheck/UsedInventory/O_VDPRoi.feature",
                "src/test/java/feature/UsedInventory/Z_Logout.feature"
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
//        tags = "@newTestCase"
)
public class TestRunner {}
 