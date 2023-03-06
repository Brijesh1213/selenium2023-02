package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StepDefination extends TestBase {

	

	@Given("We are opening Facebook")
	public void we_are_opening_facebook() throws InterruptedException {
		initialisation("Chrome");
		driver.get("https://www.facebook.com/");
	
	}

	@Then("Facebook titleF")
	public void getting_titleF() {
	    System.out.println(driver.getTitle());
		tearDown();
	}

	@Given("We are opening Amazon")
	public void we_are_opening_amazon() throws InterruptedException {
		initialisation("Chrome");
		driver.get("https://www.amazon.ca/");
	    
	}
	@Then("Amazon titleA")
	public void getting_titleA() {
	    System.out.println(driver.getTitle());
		tearDown();
	}

	@Given("We are opening Google")
	public void we_are_opening_google() throws InterruptedException {
		initialisation("Chrome");
		driver.get("https://www.google.com/");
	    
	}
	@Then("Google titleG")
	public void getting_titleG() {
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("jbvdbob"));
		tearDown();
	}

}
