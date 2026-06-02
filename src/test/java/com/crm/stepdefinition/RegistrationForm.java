package com.crm.stepdefinition;

import com.crm.objectRepository.RegistrationFormPOM;
import com.crm.utilities.Utility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationForm extends Utility {
	Utility util = new Utility();
	RegistrationFormPOM rform = new RegistrationFormPOM();

	@When("User clicks on Register Now button")
	public void user_clicks_on_register_now_button() {
	    rform.clickOnLoginRegisterBtn();
	}

	@Then("User should land on Register form page")
	public void user_should_land_on_register_form_page() {
	    util.verifyCurrentUrl("registerPage");
	}

	@When("User enters the name {string}")
	public void user_enters_the_name(String name) {
	   rform.clickAndSendTextInName(name);
	}

	@When("User enters the confirm password {string}")
	public void user_enters_the_confirm_password(String  confirmPassword) {
	   rform.clickAndSendTextInConfirmPassword(confirmPassword);
	}

	@When("User enters the mobile {string}")
	public void user_enters_the_mobile(String mobile) {
		rform.clickAndSendTextInMobile(mobile);
	}

	@When("User clicks on Register Now in Registration form")
	public void user_clicks_on_register_now_in_registration_form() {
	    rform.clickOnFormRegisterBtn();
	}

}
