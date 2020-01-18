package com.calculator.test;

import cucumber.api.CucumberOptions;


@CucumberOptions(
        features = { "features" },
        plugin = { "pretty" },
        glue = { "com.calculator.stepDefinitions" },
        tags = { "@ui, @smoke", "@acceptance" }
        )
public class CucumberRunner {
}
