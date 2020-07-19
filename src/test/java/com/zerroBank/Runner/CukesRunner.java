package com.zerroBank.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "htmn l:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        glue = "com/zerroBank/StepDef",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@wip"

)

public class CukesRunner {

}
