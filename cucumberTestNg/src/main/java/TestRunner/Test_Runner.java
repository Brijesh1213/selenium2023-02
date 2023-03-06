package TestRunner;



import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

/*@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/main/java/bddfeature/bddTestNg.feature/"
		,glue= {"StepDefination"} 
		, format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
                 },plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                 ,dryRun=false
         ,strict = true)*/

public class Test_Runner extends AbstractTestNGCucumberTests{
	
	//private TestNGCucumberRunner testNgCucumberRunner;
	public TestNGCucumberRunner testNGCucumberRunner;
	 
 
    @BeforeClass//(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
   @Test(dataProvider = "scenarios") //(groups = "cucumber Scenarios", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature ) throws Throwable  {
       testNGCucumberRunner.runScenario(pickle.getPickle());
    }
   // @Test (groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "Scenarios")
 
    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass(){
        testNGCucumberRunner.finish();
    }
	
}
	

