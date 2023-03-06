
package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Selenium_Workspace\\BDD-fRAMEWORK_fb\\src\\main\\java\\feature\\taggedhook.feature"
		,glue= {"stepDefination"} 
		, format = {"pretty", "html:test-output", "json:jason_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
         , dryRun = false
        		 
        		 //,tags= {"~@Smoke", "@RegressionTest","~@SanityTest"}
        		 
         ,monochrome =true
         ,strict = true)

public class Test_runner 
{

}
