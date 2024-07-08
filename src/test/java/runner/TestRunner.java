package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                    "src/test/java/feature/DemoClient.feature",
//                    "src/test/java/feature/MosesOutletCorridorG.feature",
//                    "src/test/java/feature/BillBrandtFord.feature",
//                    "src/test/java/feature/DanDeeryMotors.feature",
//                    "src/test/java/feature/MosesChevrolet.feature",
//                    "src/test/java/feature/CowBoyToyota.feature",
//                "src/test/java/feature/MosesOutletCorridorG.feature",
                    },
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json" }
)
public class TestRunner {}
 