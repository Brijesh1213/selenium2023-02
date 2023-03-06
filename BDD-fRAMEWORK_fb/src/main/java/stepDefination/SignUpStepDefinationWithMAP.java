/*
 * package stepDefination;
 * 
 * import java.util.List; import java.util.Map;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then;
 * 
 * public class SignUpStepDefinationWithMAP { WebDriver driver ;
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
 * @Then("^FirstName Added$") public void firstname_Added(DataTable Firstname) {
 * 
 * for(Map<String, String> data : Firstname.asMaps(String.class, String.class))
 * { WebElement Fname = driver.findElement(By.name("firstname"));
 * Fname.sendKeys(data.get("username"));
 * 
 * }
 * 
 * 
 * }
 * 
 * @Then("^SurName Added$") public void surname_Added(DataTable surname){
 * for(Map<String, String> data : surname.asMaps(String.class, String.class)) {
 * WebElement Sname = driver.findElement(By.name("lastname"));
 * Sname.sendKeys(data.get("lastname"));
 * 
 * }
 * 
 * }
 * 
 * @Then("^Email Addded$") public void email_Addded(DataTable email) {
 * for(Map<String, String> data : email.asMaps(String.class, String.class)) {
 * WebElement Email = driver.findElement(By.id("password_step_input"));
 * Email.sendKeys(data.get("TitleEmail"));
 * 
 * } }
 * 
 * // @Then("^close BrowSer$") public void CloseBrowser() { driver.close(); }
 * 
 * }
 */