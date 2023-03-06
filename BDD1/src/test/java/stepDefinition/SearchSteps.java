package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	@Given("I have search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() {
	    System.out.println("Step1: I am on search Page");
	}

	@When("I search for the productName {string} and price {int}")
	public void i_search_for_the_product_name_and_price(String productname, Integer price) {
		System.out.println("step 2: Search the product iwth name :"+ productname +"price"+ price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productname) {
	    System.out.println("Step 3: product "+ productname +"is displayed");
	}


}
