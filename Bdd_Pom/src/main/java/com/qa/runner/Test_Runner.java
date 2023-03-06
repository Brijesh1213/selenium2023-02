package com.qa.runner;

import org.junit.runner.RunWith;




import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Selenium_Workspace\\Bdd_Pom\\src\\main\\java\\feature\\FB.feature"
		,glue= {"Stepdefination"} 
		, plugin = {"html:test-output", "json:jason_output/cucumber.json", "junit:junit_xml/cucumber.xml", }
         , dryRun = false
         	 
        		 //,tags= {"~@Smoke", "@RegressionTest","~@SanityTest"}
        		 
         ,monochrome =true )


public class Test_Runner {

}

