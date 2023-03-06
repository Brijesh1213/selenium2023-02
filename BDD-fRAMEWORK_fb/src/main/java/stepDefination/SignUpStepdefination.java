/*
 * package stepDefination;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When; import
 * junit.framework.Assert;
 * 
 * public class SignUpStepdefination { WebDriver driver ;
 * 
 * 
 * @Given("^User is on Sign Up Page$") public void user_already_On_loginPage() {
 * System.setProperty("webdriver.gecko.driver",
 * "C:\\Seleniumjars\\geckodriver.exe\\"); driver =new FirefoxDriver();
 * driver.get("https://www.facebook.com/"); }
 * 
 * @Then("^click on create new account$") public void
 * click_on_create_new_account() {
 * driver.findElement(By.xpath("//div[@class=\"_6ltg\"]/a[1]")).click(); }
 * 
 * @Then("^FirstName Added$") public void firstname_Added(DataTable firstname) {
 * 
 * List<List<String>> data = firstname.raw(); WebElement Fname =
 * driver.findElement(By.name("firstname")); Fname.sendKeys(data.get(0).get(0));
 * }
 * 
 * @Then("^SurName Added$") public void surname_Added(DataTable surname){
 * List<List<String>> data = surname.raw(); WebElement Sname =
 * driver.findElement(By.name("lastname")); Sname.sendKeys(data.get(0).get(0));
 * 
 * 
 * }
 * 
 * @Then("^Email Addded$") public void email_Addded(DataTable email) {
 * List<List<String>> data = email.raw(); WebElement Email =
 * driver.findElement(By.id("password_step_input"));
 * Email.sendKeys(data.get(0).get(0));
 * 
 * }
 * 
 * @Then("^close BrowSer$") public void CloseBrowser() { driver.close(); }
 * 
 * }
 */