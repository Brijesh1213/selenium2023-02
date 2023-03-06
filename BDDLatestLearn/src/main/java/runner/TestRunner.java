package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Selenium_Workspace\\BDDLatestLearn\\src\\main\\java\\runner\\browsers.feature"
		,glue= {"steps"} 
		, plugin = {"html:test-output", "json:jason_output/cucumber.json", "junit:junit_xml/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
         , dryRun = false
        		 
        		 //,tags= {"~@Smoke", "@RegressionTest","~@SanityTest"}
        		 
         ,monochrome =true )


public class TestRunner {

}
