package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		 features = {"./src/test/resources/features"},
    glue = {"stepdefinitions","hooks"},
    monochrome = true,
    tags= "@Array",
    plugin = { "pretty",                      
               "html:target/cucumber-reports/cucumber.html",							//HTML report
               "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	//extent
               "json:target/cucumber-reports/cucumber.json"							 	//json
		 } )
            

public class ArrayRun extends AbstractTestNGCucumberTests{
	@Override
    @DataProvider(parallel = true)//true means execute parallely false mean not execute parallely
	
    public Object[][] scenarios() {
				
		return super.scenarios();
}
	
}




////import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
//
//import io.cucumber.junit.Cucumber;
////import io.cucumber.junit.CucumberOptions;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
////@RunWith(Cucumber.class)
//@CucumberOptions
//	(
//			features="./src/test/resources/Features/Array.feature",
//			glue={"stepdefinitions","hooks"},
//			dryRun=true,
//			monochrome=true,
//			tags="@Array",
//			
//			plugin= {"pretty",
//					"html:target/cucumber-reports/cucumber.html",
//					"json:target/cucumber-reports/cucumber.json",
//					}
//			
//			)
//
//public class ArrayRun extends AbstractTestNGCucumberTests {
////	@Override 
////	@DataProvider(parallel=true)
////	public Object[][] scenarios(){
////		return super.scenarios();
////	}
//
//}
////.//FeatureN/ArraysN.feature