package Stepdefination;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;

import base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.FormPage;

public class FormPageSteps extends TestBase{
	
	FormPage formPage;
	public FormPageSteps() throws IOException {
		super(driver, wait);
		
	}

	@Given("^user is on form page$")
	public void user_is_on_form_page() throws Throwable {
		initialisation();
		formPage = new FormPage();
	}
	@Then("^enter first name \"([^\"]*)\"$")
	public void enter_first_name(String Fname) throws Throwable {
	    formPage.enterFirstName(Fname);
	}
	
	@Then("^enter lastName\"([^\"]*)\" and Select Sex$")
	public void enter_lastName_and_Select_Sex(String Lname) throws Throwable {
	    formPage.enterLastName(Lname);
	    formPage.SelectSex();
	}
	
	
	@Then("^enter years of experience, date and profession$")
	public void enter_years_of_experience_date_and_profession() throws Throwable {
		formPage.SelectExpDateProfession();;
	}

	@Then("^Select Flavoours of selenium, continents and commands$")
	public void select_Flavoours_of_selenium_continents_and_commands() throws Throwable {
	   formPage.SelectFlavours();
	   formPage.SelectContinent();
	   formPage.SelectSeleniumCommand();
	   Thread.sleep(4000);
	}
	@Then ("^Close All$")
	public void Closs_All() {
		//tearDown();
	}



}
