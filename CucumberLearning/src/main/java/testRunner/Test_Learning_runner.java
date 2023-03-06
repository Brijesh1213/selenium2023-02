package testRunner;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features ="C:\\Selenium_Workspace\\CucumberLearning\\src\\main\\java\\bddFeature\\loginlearning.feature"
		,glue= {"StepDefination"} 
		,dryRun = false
	      ,strict = false
		, format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
                 },plugin = "json:target/cucumber-reports/CucumberTestReport.json")
         

public class Test_Learning_runner {

}
