package ui.tests.stepdefinitions.eo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        // Where to find the cucumber feature files with scenarios to test
        features = "src/test/java/ui/tests/features/eo")
public class RunCucumberEoTest {
}