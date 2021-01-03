package com.carbonite.test.suites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "features/HomePageFeature", glue = { "com.carbonite.step.definitions",
		"com.carbonite.hooks" }, monochrome = true, dryRun = false,publish = false)

public class HomePageTest extends AbstractTestNGCucumberTests {

}
