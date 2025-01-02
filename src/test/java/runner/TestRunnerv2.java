package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/java/feature/v2_NewInventory/ApplicationSetup.feature",
                "src/test/java/feature/v2_NewInventory/D_ChannelStatReport.feature",
                "src/test/java/feature/v2_NewInventory/E_PreShootReport.feature",
                "src/test/java/feature/v2_NewInventory/F_VDPResult.feature",
                "src/test/java/feature/v2_NewInventory/G_LeadsReport.feature",
                "src/test/java/feature/v2_NewInventory/H_MostVDPsReport.feature",
                "src/test/java/feature/v2_NewInventory/I_LeastVDPsReport.feature",
                "src/test/java/feature/v2_NewInventory/J_DaysOnLot.feature",
                "src/test/java/feature/v2_NewInventory/K_VDPBoost.feature",
                "src/test/java/feature/v2_NewInventory/L_BudgetROI.feature",
                "src/test/java/feature/v2_NewInventory/M_VDPsByChannelReport.feature",
                "src/test/java/feature/v2_NewInventory/N_Top10Website.feature",
                "src/test/java/feature/v2_NewInventory/O_VDPRoi.feature",

                "src/test/java/feature/v2_UsedInventory/ApplicationSetup.feature",
                "src/test/java/feature/v2_UsedInventory/B_DealRatingByChannel.feature",
                "src/test/java/feature/v2_UsedInventory/C_TipReport.feature",
                "src/test/java/feature/v2_UsedInventory/D_ChannelStatReport.feature",
                "src/test/java/feature/v2_UsedInventory/E_PreShootReport.feature",
                "src/test/java/feature/v2_UsedInventory/F_VDPResult.feature",
                "src/test/java/feature/v2_UsedInventory/G_LeadsReport.feature",
                "src/test/java/feature/v2_UsedInventory/H_MostVDPsReport.feature",
                "src/test/java/feature/v2_UsedInventory/I_LeastVDPsReport.feature",
                "src/test/java/feature/v2_UsedInventory/J_DaysOnLot.feature",
                "src/test/java/feature/v2_UsedInventory/K_VDPBoost.feature",
                "src/test/java/feature/v2_UsedInventory/L_BudgetROI.feature",
                "src/test/java/feature/v2_UsedInventory/M_VDPsByChannelReport.feature",
                "src/test/java/feature/v2_UsedInventory/N_Top10Website.feature",
                "src/test/java/feature/v2_UsedInventory/O_VDPRoi.feature",
                "src/test/java/feature/v2_UsedInventory/Z_Logout.feature"
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
//        tags = "@newTestCase"
)
public class TestRunnerv2 {
}
