package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // внешний вид логов
        plugin = "pretty",
        monochrome = true,
        tags = "@smoke",
        // path to your step definitions
        glue = "src/test/java/cucumber/",
        features = "src/test/resources/cucumber.features"
)
public class CucumberTestRunner {
}
