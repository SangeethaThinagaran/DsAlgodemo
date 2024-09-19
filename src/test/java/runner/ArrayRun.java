package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions
	(
			features="./src/test/resources/Features/Array.feature",
			glue={"stepdefinitions","hooks"},
			monochrome=true,
			tags="@Array",
			dryRun=true,
			plugin= {"pretty",
					"html:target/cucumber-reports/cucumber.html",
					"json:target/cucumber-reports/cucumber.json",
					}
			
			)

public class ArrayRun extends AbstractTestNGCucumberTests {
//	@Override 
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//	}

}
//.//FeatureN/ArraysN.feature