package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("inside user login");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside username and passwrod");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside user login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside user homepage");
	}

}
