package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
	(
			features=".//FeatureN/SignInN.feature",
			glue="stepdefinitions",
			dryRun=false,
			plugin= {"pretty",
					"html:test-output/login3.html"}
			
			)

public class SignInRun {

}
