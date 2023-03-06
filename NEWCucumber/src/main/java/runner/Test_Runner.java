package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\main\\java\\Form_Fill.feature"
		,glue= {"Stepdefination"} 
		, plugin = {"html:test-output", "json:jason_output/cucumber.json", "junit:junit_xml/cucumber.xml", }
         , dryRun = false
        		 
        		 //,tags= {"~@Smoke", "@RegressionTest","~@SanityTest"}
        		 
         ,monochrome =true )

public class Test_Runner {
	

}

