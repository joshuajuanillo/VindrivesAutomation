package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                //// New Inventory

                "src/test/java/feature/e2e/NewInventory/ApplicationSetup.feature",
                "src/test/java/feature/e2e/NewInventory/B_ResultSummary.feature",
                "src/test/java/feature/e2e/NewInventory/E_ChannelStatReport.feature",
                "src/test/java/feature/e2e/NewInventory/F_PreShootReport.feature",
                "src/test/java/feature/e2e/NewInventory/F_VDPResult.feature",
                "src/test/java/feature/e2e/NewInventory/G_LeadsReport.feature",
                "src/test/java/feature/e2e/NewInventory/H_MostVDPsReport.feature",
                "src/test/java/feature/e2e/NewInventory/I_LeastVDPsReport.feature",
                "src/test/java/feature/e2e/NewInventory/J_DaysOnLotReport.feature",
                "src/test/java/feature/e2e/NewInventory/K_BudgetRoi.feature",
                "src/test/java/feature/e2e/NewInventory/L_VDPsByChannel.feature",
                "src/test/java/feature/e2e/NewInventory/M_Top10Website.feature",
                "src/test/java/feature/e2e/NewInventory/N_VDPRoi.feature",

                //// Used Inventory

                "src/test/java/feature/e2e/UsedInventory/ApplicationSetup.feature",
                "src/test/java/feature/e2e/UsedInventory/B_ResultSummary.feature",
                "src/test/java/feature/e2e/UsedInventory/B_DealRatingByChannel.feature",
                "src/test/java/feature/e2e/UsedInventory/D_TipReport.feature",
                "src/test/java/feature/e2e/UsedInventory/E_ChannelStatReport.feature",
                "src/test/java/feature/e2e/UsedInventory/F_PreShootReport.feature",
                "src/test/java/feature/e2e/UsedInventory/F_VDPResult.feature",
                "src/test/java/feature/e2e/UsedInventory/G_LeadsReport.feature",
                "src/test/java/feature/e2e/UsedInventory/H_MostVDPsReport.feature",
                "src/test/java/feature/e2e/UsedInventory/I_LeastVDPsReport.feature",
                "src/test/java/feature/e2e/UsedInventory/J_DaysOnLotReport.feature",
                "src/test/java/feature/e2e/UsedInventory/K_BudgetRoi.feature",
                "src/test/java/feature/e2e/UsedInventory/L_VDPsByChannel.feature",
                "src/test/java/feature/e2e/UsedInventory/M_Top10Website.feature",
                "src/test/java/feature/e2e/UsedInventory/N_VDPRoi.feature",

                "src/test/java/feature/e2e/UsedInventory/Z_Logout.feature"
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
)
public class TestRunnerE2E {
}
