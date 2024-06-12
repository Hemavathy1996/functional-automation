package com.letshoptests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\main\\resources\\com\\featurescucumber\\loginLetshop.feature"},
glue = {"StepDefinition"})
public class CucumberTestrunner extends AbstractTestNGCucumberTests {
	      
}
