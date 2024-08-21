package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
//                    "src/test/java/feature/DemoClient.feature",
//                    "src/test/java/feature/BillBrandtFord.feature",
                    "src/test/java/feature/NewInventory/BillBrandtFord.feature",
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" }
//        tags = "@newTestCase"
)
public class TestRunner {}
 