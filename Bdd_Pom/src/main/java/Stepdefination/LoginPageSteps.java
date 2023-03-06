package Stepdefination;

import java.io.IOException;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginPageSteps extends TestBase{
	
	LoginPage loginPage;
	public LoginPageSteps() throws IOException {
		super();
		
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws IOException  {
		initialisation();
		loginPage = new LoginPage();
	    
	}

	@Then("^enter UserID & Password, verify page title$")
	public void enter_UserID_Password()  {
		String Title=loginPage.title();
		   Assert.assertEquals("Facebook - Log In or Sign Up", Title);
	   loginPage.enterEmailAndPassword();
	   
	}

	@Then("^Click Loging Button$")
	public void click_Loging_Button() throws IOException {
	  loginPage.ClickLogin();
	  
	  
	}
	
	@Then ("^Close All$")
	public void Closs_All() {
		tearDown();
	}



}
