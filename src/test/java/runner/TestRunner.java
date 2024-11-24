package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/java/feature/HealthCheck/NewInventory/ApplicationSetup.feature",
                "src/test/java/feature/HealthCheck/NewInventory/D_ChannelStatsReport.feature",
                "src/test/java/feature/HealthCheck/NewInventory/E_PreShootReport.feature",
                "src/test/java/feature/HealthCheck/NewInventory/F_VDPResult.feature",
                "src/test/java/feature/HealthCheck/NewInventory/G_LeadsReport.feature",
                "src/test/java/feature/HealthCheck/NewInventory/H_MostVDPsReport.feature",
                "src/test/java/feature/HealthCheck/NewInventory/I_LeastVDPsReport.feature",
                "src/test/java/feature/HealthCheck/NewInventory/J_DaysOnLot.feature",
                "src/test/java/feature/HealthCheck/NewInventory/K_VDPBoost.feature",
                "src/test/java/feature/HealthCheck/NewInventory/N_Top10Website.feature",
                "src/test/java/feature/HealthCheck/NewInventory/O_VDPRoi.feature",

                "src/test/java/feature/HealthCheck/UsedInventory/ApplicationSetup.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/B_DealRatingByChannel.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/C_TipReport.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/D_ChannelStatsReport.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/E_PreShootReport.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/F_VDPResult.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/G_LeadsReport.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/H_MostVDPsReport.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/I_LeastVDPsReport.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/J_DaysOnLot.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/K_VDPBoost.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/N_Top10Website.feature",
                "src/test/java/feature/HealthCheck/UsedInventory/O_VDPRoi.feature",
                "src/test/java/feature/e2e/UsedInventory/Z_Logout.feature"
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
//        tags = "@newTestCase"
)
public class TestRunner {}
 