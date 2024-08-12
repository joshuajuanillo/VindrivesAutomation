package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                    "src/test/java/feature/NewInventory/DemoClient.feature",
                    "src/test/java/feature/DemoClient.feature",
        },
        glue = "steps",
        plugin = {
                "pretty",
                "junit:target/vindrivesTestRun.xml",
                "json:target/Regression.json" },
        tags = "@merchandising"
)
public class TestRunner {}
 