package com.saucelabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty.html", "json:target/cucumber-html-reports/cucumber.json", "junit:target/cucumber-xml-reports/cucumber.xml"},
        //This create auto method name in camelCase
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        //Path to your feature file
        features = {"src/test/resources/features"},
        // Specify tags to be executed
        tags = "@login",
        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"com/saucelabs/stepdefinitions"}

)

public class TestRunner {
}
