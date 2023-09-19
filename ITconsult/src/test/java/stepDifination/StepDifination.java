package stepDifination;

import base.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.


public class StepDifination extends Base{
	
	
	@Given("^User is on Hotel page$")
	public void User_is_on_Hotel_page(){
		Base.initialize();
	}
	@When("^User click on Login$")
	public void UserClickOnLogin () {
		System.out.println("Abdullah MotherFuker this work");
	}
	@Then("^User should see Login page$")
	public void UserShouldSeeLoginPage () {
		System.out.println("Congragulation Abdullah Halimiiiiiiii");
	}
	
	

}
