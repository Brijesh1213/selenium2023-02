package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taggedhookStepDefination {
	
	@Before
	public void setUp() {
		System.out.println("in Before global hook");
	}
	
	@After
	public void TearDow() {
		System.out.println("in After global hook");
	}
	@Before("@First")
	public void setUp0() {
		System.out.println("in Before tagged hook");
	}
	
	@After("@First")
	public void TearDow0() {
		System.out.println("in After Tagged hook");
	}
	
	@Given("^given1 method$")
	public void given_method () {
		System.out.println("given1 method");
	   
	}

	@When("^when1 method$")
	public void when_method  (){
		System.out.println("when1 method");
	}

	@Then("^then1 method$")
	public void then_method() {
	    System.out.println("then1 method");
	}
	
	@Given("^given2 method$")
	public void given_method2 () {
		System.out.println("given2 method");
	   
	}

	@When("^when2 method$")
	public void when_method2  (){
		System.out.println("when2 method");
	}

	@Then("^then2 method$")
	public void then_method2() {
	    System.out.println("then2 method");
	}
	
	@Given("^given3 method$")
	public void given_method3 () {
		System.out.println("given3 method");
	   
	}

	@When("^when3 method$")
	public void when_method3 (){
		System.out.println("when3 method");
	}

	@Then("^then3 method$")
	public void then_method3() {
	    System.out.println("then3 method");
	}


}
