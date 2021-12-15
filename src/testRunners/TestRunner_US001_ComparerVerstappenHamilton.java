package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"classpath:features"},
        glue = {"helpers", "stepDefinitions"},
        monochrome = true
)

public class TestRunner_US001_ComparerVerstappenHamilton {
}