package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Selenium_Workspace\\gmailFree\\src\\main\\java\\feature"
		,glue= {"stepDefination"} 
		, format = {"pretty", "html:test-output", "json:jason_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
         , dryRun = false
        		
         ,monochrome =true )

public class Test_runner 
{

}
