package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/java/feature/DemoClient/UsedInventory/ApplicationSetup.feature",
                "src/test/java/feature/DemoClient/UsedInventory/F_PreShootReport}.feature",
                "src/test/java/feature/DemoClient/UsedInventory/Z_logout.feature",
//                "src/test/java/feature/DemoClient/NewInventory/",
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
//        tags = "@newTestCase"
)
public class TestRunner {}
 