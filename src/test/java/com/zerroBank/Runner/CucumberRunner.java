package com.zerroBank.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/zerroBank/stepDef",
        features = "src/test/resources",
        dryRun = false,
        strict = false,
        tags = "",
        plugin ={
                "html:target/default-html-report",
                 "json:target/cucumber7.json",
                 "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {
}
