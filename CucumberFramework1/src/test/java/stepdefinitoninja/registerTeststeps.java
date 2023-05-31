package stepdefinitoninja;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerTeststeps {
	
	
	@Before
	public void Open () {
		System.out.println("open browser");
	}
	
	
	@After
	public void close() {
	System.out.println("close the browser");
	}
	
	
	@BeforeStep
	public void data() {
		System.out.println("open the data");
	}
	
	
	@AfterStep
	public void step() {
		System.out.println("open the steps");
	}
	
	
	
	
	
	
	

	@Given("open the register account page")
	public void open_the_register_account_page() {
	
	}


	@When("Enter the first name {string}into first name field")
	public void enter_the_first_name_sagar_into_first_name_field(String Fname) {
	    System.out.println("Enter the first name into first name field"+Fname);
	}

	@When("Enter the last name {string} into last name field")
	public void enter_the_last_name_into_last_name_field(String lname) {
		System.out.println("Enter the last name {string} into last name field"+lname);
	  
	}

	@When("Enter the email {string}into email field")
	public void enter_the_email_sagartatarao458_gmail_com_into_email_field(String email) {
	   System.out.println("Enter the email into email field"+email);
	}

	@When("Enter the telepone {string}into telephone field")
	public void enter_the_telepone_into_telephone_field(String int1) {
	    System.out.println("Enter the telepone into telephone field"+int1);
	}

	@When("Enter the password {string} into password field")
	public void enter_the_password_into_password_field(String pwd) {
	   System.out.println("Enter the password {string} into password field"+pwd);
	}

	@When("Enter the password {string} into conform the password field")
	public void enter_the_password_into_conform_the_password_field(String cpwd) {
	   System.out.println("Enter the password {string} into conform the password field"+cpwd);
	}

	@When("select the privacy field")
	public void select_the_privacy_field() {
	System.out.println("select the privacy field");
	}

	@When("click on the continue button")
	public void click_on_the_continue_button() {
	   System.out.println("click on the continue button");
	}

	@Then("accoun should created succesfully")
	public void accoun_should_created_succesfully() {
	    System.out.println("accoun should created succesfully");
	}

	
	
	
	
	
	
	
	
	
	

}
