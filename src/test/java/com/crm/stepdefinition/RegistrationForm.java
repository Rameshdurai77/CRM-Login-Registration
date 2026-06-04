package com.crm.stepdefinition;

import java.util.List;

import com.crm.objectRepository.RegistrationFormPOM;
import com.crm.utilities.Utility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;

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
	
	
	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		rform.clickOnFormRegisterBtn();
	}
	
	@When("User enters name as {string}")
	public void user_enters_name_as(String name) {
		 rform.clickAndSendTextInName(name);
	}
	@When("User enters email as {string}")
	public void user_enters_email_as(String email) {
		rform.clickAndSendTextInEmail(email);
	}
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		rform.clickAndSendTextInPassword(password);
	}
	@When("User enters confirm password as {string}")
	public void user_enters_confirm_password_as(String confirmPassword) {
		   rform.clickAndSendTextInConfirmPassword(confirmPassword);
	}
	@When("User enters mobile number as {string}")
	public void user_enters_mobile_number_as(String mobile) {
		rform.clickAndSendTextInMobile(mobile);
	}
	@When("User clicks Register button")
	public void user_clicks_register_button() {
		rform.clickOnFormRegisterBtn();
	}
	@Then("email validation message should be displayed {string}")
	public void email_validation_message_should_be_displayed(String string) {
	    rform.verifyEmailErrorMessage(string);
	}
	
	@Then("validation messages should be displayed for all mandatory fields with one dim list")
	public void validation_messages_should_be_displayed_for_all_mandatory_fields(DataTable datatable) {
		List<String> errorMessages = datatable.asList();
		int size = errorMessages.size();
		System.out.println();
		rform.verifyEmptyNameErrorMessage(errorMessages.get(0));
		rform.verifyEmailErrorMessage(errorMessages.get(1));
		rform.verifyPasswordErrorMessage(errorMessages.get(size-2));
		rform.verifyConfirmPasswordErrorMessage(errorMessages.get(size-1));
	}
	
	@Then("spaces in field validation messages should be displayed for all mandatory fields with one dim list")
	public void spaces_in_field_validation_messages_should_be_displayed_for_all_mandatory_fields(DataTable datatable) {
		List<String> errorMessages = datatable.asList();
		int size = errorMessages.size();
		System.out.println();
		rform.verifyNameLengthErrorMessage(errorMessages.get(0));
		rform.verifyEmailErrorMessage(errorMessages.get(1));
		rform.verifyPasswordLengthErrorMessage(errorMessages.get(size-2));
		rform.verifyConfirmPasswordLengthErrorMessage(errorMessages.get(size-1));
	}
	
	@Then("password mismatch error should be displayed {string}")
	public void password_mismatch_error_should_be_displayed(String string) {
	    rform.verifyPasswordMismatchErrorMessage(string);
	}
	
	@Then("mobile number validation message should be displayed {string}")
	public void mobile_number_validation_message_should_be_displayed(String string) {
		 rform.verifyMobileNumberErrorMessage(string);
	}

	@Then("mobile number length validation message should be displayed {string}")
	public void mobile_number_length_validation_message_should_be_displayed(String string) {
	   
	}

	@Then("Invalid name validation message should be displayed {string}")
	public void invalid_name_validation_message_should_be_displayed(String string) {
	    rform.verifyValidNameErrorMessage(string);
	}
	
	@Then("name validation message should be displayed {string}")
	public void name_validation_message_should_be_displayed(String string) {
	    rform.verifyEmptyNameErrorMessage(string);
	}
	
	@Then("password validation message should be displayed {string}")
	public void password_validation_message_should_be_displayed(String string) {
	    rform.verifyPasswordErrorMessage(string);
	}
	
	@Then("confirm password validation message should be displayed {string}")
	public void confirm_password_validation_message_should_be_displayed(String string) {
	    rform.verifyConfirmPasswordErrorMessage(string);
	}

	@When("User enters spaces in all fields {string}")
	public void user_enters_spaces_in_all_fields(String string) {
	    rform.clickAndSendTextInName(string);
	    rform.clickAndSendTextInEmail(string);
	    rform.clickAndSendTextInPassword(string);
	    rform.clickAndSendTextInConfirmPassword(string);
	    rform.clickAndSendTextInMobile(string);
	}
	
}
