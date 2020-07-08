package com.zerroBank.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/zerroBank/StepDef",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@login",
        plugin ={
                "json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"
}
)
public class CucumberRunner {
}
