package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamplesSteps {
	
	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		System.out.println("Step 1 - " + string);
	}

	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) {
		System.out.println("Step 2 - " + string);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	   System.out.println("Step 3 - " + string);
	}
	
//	@When("I check for the {int} in step")
//	public void i_check_for_the_in_step(Integer int1) {
//		System.out.println("Step 2 - " + int1);
//	}
	
	@When("I check for the {double} in step")
	public void i_check_for_the_in_step(Double double1) {
		System.out.println("Step 2 - " + double1);
	}
	
}
