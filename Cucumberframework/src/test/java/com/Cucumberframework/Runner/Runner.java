package com.Cucumberframework.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/Resources/Features",
				glue="com.Cucumberframework.StepDef",						
				plugin = {"pretty","html:target/Htmlreports/reports.html"}
				)


public class Runner {

}
