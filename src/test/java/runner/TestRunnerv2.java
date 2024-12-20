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
                "src/test/java/feature/v2/D_ChannelStatReport.feature",
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
