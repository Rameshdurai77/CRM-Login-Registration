package com.crm.stepdefinition;

import com.crm.objectRepository.RegistrationFormPOM;
import com.crm.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	Utility util = new Utility();
	RegistrationFormPOM rform = new RegistrationFormPOM();
	
	@Given("Launch the CRM application")
	public void launch_the_crm_application() {
	    util.launchApplication();
	}

	@When("User enters the email {string}")
	public void user_enters_the_email(String email) {
	   rform.clickAndSendTextInEmail(email);
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String password) {
	    rform.clickAndSendTextInPassword(password);
	}

	@Then("User should navigate to Login Page")
	public void user_should_navigate_back_to_login_page() {
	   rform.verifyLoginPage();
	}

	@When("User clicks on Log In button")
	public void user_clicks_on_log_in_button() {
	    rform.clickOnLoginButton();
	}

	@Then("User should navigate the CRM dashboard page")
	public void user_should_navigate_the_crm_dashboard_page() {
		util.verifyCurrentUrl("dashboardPage");
	}

}
