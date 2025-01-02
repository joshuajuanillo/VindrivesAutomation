package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/java/feature/v2/ApplicationSetup.feature",
//                "src/test/java/feature/v2/B_DealRatingByChannel.feature",
//                "src/test/java/feature/v2/C_TipReport.feature",
//                "src/test/java/feature/v2/D_ChannelStatReport.feature",
//                "src/test/java/feature/v2/E_PreShootReport.feature",
//                "src/test/java/feature/v2/F_VDPResult.feature",
//                "src/test/java/feature/v2/G_LeadsReport.feature",
//                "src/test/java/feature/v2/H_MostVDPsReport.feature",
//                "src/test/java/feature/v2/I_LeastVDPsReport.feature",
//                "src/test/java/feature/v2/J_DaysOnLot.feature",
//                "src/test/java/feature/v2/K_VDPBoost.feature",
                "src/test/java/feature/v2/L_BudgetROI.feature",
                "src/test/java/feature/v2/Z_Logout.feature"
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
