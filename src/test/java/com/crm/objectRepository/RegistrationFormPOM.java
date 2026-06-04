package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.utilities.Utility;

public class RegistrationFormPOM extends Utility  {
	Utility util = new Utility();
	public RegistrationFormPOM() {
		PageFactory.initElements(driver, this);
	}
//	Login Register Button
	@FindBy(xpath="//a[text()='Register Now']")
	private WebElement LoginRegisterBtn;
	
//	Name field
	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;
	
//	Email Field
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
//	Password Field
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
//	Confirm Password field
	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement confirmPassword;
	
//	Mobile field
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	
//	Register form Register button
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerFormRegisterBtn;
	
//	Login Register button
	@FindBy(xpath = "//h2[text()='Register Now']")
	private WebElement registerNow;
	
//	Login Page 
	@FindBy (xpath = "//h2[text()='CRM System']")
	private WebElement LoginPage;
	
//	Login Error Message
	@FindBy(xpath="//div[text()='Error']")
	private WebElement errorMessage;
	
//	Password Error Message
	@FindBy(xpath="//p[text()='Password cannot be empty']")
	private WebElement passwordErrorMessage;
	
//	Email Error Message
	@FindBy(xpath="//p[text()='Email cannot be empty']")
	private WebElement emailErrorMessage;
	
//	Name Error Message
	@FindBy(xpath = "//p[text()='Name is required']")
	private WebElement emptyNameErrorMessage;
	
//	Confirm Password Error Message
	@FindBy(xpath = "//p[text()='Confirm Password cannot be empty']")
	private WebElement emptyConfirmPasswordErrorMessage;
	
//	Valid Email Address Error Message
	@FindBy(xpath = "//p[text()='Enter a valid Email address']")
	private WebElement validEmailAddressMessage;
	
//	Valid Name Error Message
	@FindBy(xpath = "//p[contains(text(),'Enter a valid Name')]")
	private WebElement invalidNameErrorMessage;
	
//	Empty Mobile Error Message
	@FindBy(xpath = "//div[text()='Something went wrong']")
	private WebElement emptyMobileErrorMessage;
	
//	Password Not Match Error Message
	@FindBy(xpath = "//div[text()='Passwords do not match']")
	private WebElement passwordNotMatchErrorMessage;
	
//	Name Length Error Message
	@FindBy(xpath = "//p[contains(text(),'\"name\" length must be at least 3 characters long')]")
	private WebElement nameLengthErrorMessage;
	
//	Password Length Error Message
	@FindBy(xpath = "//p[text()='Password must be at least 6 characters long']")
	private WebElement passwordLengthErrorMessage;
	
//	Confirm Password Length Error Message
	@FindBy(xpath = "//p[text()='Confirm Password must be at least 6 characters long']")
	private WebElement confirmPasswordLengthErrorMessage;
	
	
	public WebElement getNameLengthErrorMessage() {
		return nameLengthErrorMessage;
	}

	public WebElement getPasswordLengthErrorMessage() {
		return passwordLengthErrorMessage;
	}

	public WebElement getConfirmPasswordLengthErrorMessage() {
		return confirmPasswordLengthErrorMessage;
	}

	public Utility getUtil() {
		return util;
	}

	public WebElement getEmptyNameErrorMessage() {
		return emptyNameErrorMessage;
	}

	public WebElement getEmptyConfirmPasswordErrorMessage() {
		return emptyConfirmPasswordErrorMessage;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	@FindBy(xpath="//button[text()='Log In']")
	private WebElement loginBtn;
	
	public WebElement getLoginPage() {
		return LoginPage;
	}

	public WebElement getLoginRegisterBtn() {
		return LoginRegisterBtn;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getRegisterFormRegisterBtn() {
		return registerFormRegisterBtn;
	}
	
	public WebElement getValidEmailAddressMessage() {
		return validEmailAddressMessage;
	}

	public WebElement getInvalidNameErrorMessage() {
		return invalidNameErrorMessage;
	}

	public WebElement getEmptyMobileErrorMessage() {
		return emptyMobileErrorMessage;
	}

	public WebElement getPasswordNotMatchErrorMessage() {
		return passwordNotMatchErrorMessage;
	}
	
	public WebElement getEmailErrorMessage() {
		return emailErrorMessage;
	}

	public WebElement getPasswordErrorMessage() {
		return passwordErrorMessage;
	}
	
	public WebElement getRegisterNow() {
		return registerNow;
	}
	
	public void clickOnLoginRegisterBtn() {
		util.button(this.getLoginRegisterBtn());
	}
	
	
	
	public void clickAndSendTextInName(String input) {
		if(input==null  || input.isEmpty()) {
			input = "";
		}
		util.setText(this.getName(), input);
	}
	
	public void clickAndSendTextInEmail(String input) {
		if(input==null  || input.isEmpty()) {
			input = "";
		}
		util.setText(this.getEmail(), input);
	}
	
	public void clickAndSendTextInPassword(String input) {
		if(input==null  || input.isEmpty()) {
			input = "";
		}
		util.setText(this.getPassword(), input);
	}
	
	public void clickAndSendTextInConfirmPassword(String input) {
		if(input==null  || input.isEmpty()) {
			input = "";
		}
		util.setText(this.getConfirmPassword(), input);
	}
	
	public void clickAndSendTextInMobile(String input) {
		if(input==null  || input.isEmpty()) {
			input = "";
		}
		util.setText(this.getMobile(), input);
	}
	
	

	public void clickOnFormRegisterBtn() {
		util.button(this.getRegisterFormRegisterBtn());
	}
	
	public void verifyLoginPage() {
		if(util.getText(this.getLoginPage()).equals(Utility.accessProperties("loginPage"))){
			System.out.println("User on Login Page");
		}
		else {
			System.err.println("User not on Login Page");
		}
		
	}
	
	public void verifyErrorMessage(String error) {
		if(util.getText(this.getErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Invalid Login");
		}
		else {
			System.out.println("No Error Message displayed, Logged in Successfully");
		}
	}
	
	public void clickOnLoginButton() {
		util.button(this.getLoginBtn());
	}
	
	public void verifyPasswordErrorMessage(String error) {
		if(util.getText(this.getPasswordErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Password field is empty");
		}
		else {
			System.out.println("No Error Message displayed, Password field is filled or not mandatory");
		}
	}
	
	public void verifyEmailErrorMessage(String error) {
		if(util.getText(this.getEmailErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Email field is empty");
		}
		else {
			System.out.println("No Error Message displayed, Email field is filled or not mandatory");
		}
	}

	public void verifyEmptyNameErrorMessage(String error) {
		if(util.getText(this.getEmptyNameErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Name field is empty");
		}
		else {
			System.out.println("No Error Message displayed, Name field is filled or not mandatory");
		}
	}

	public void verifyConfirmPasswordErrorMessage(String error) {
		if(util.getText(this.getEmptyConfirmPasswordErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Confirm Password field is empty");
		}
		else {
			System.out.println("No Error Message displayed, Confirm Password field is filled or not mandatory");
		}
	}
	
	public void verifyValidEmailErrorMessage(String error) {
		if(util.getText(this.getValidEmailAddressMessage()).equals(error)) {
			System.out.println("Error Message displayed, Enter Valid Email in Email field");
		}
		else {
			System.out.println("No Error Message displayed, Entered Valid Email in Email field");
		}
	}
	
	public void verifyPasswordMismatchErrorMessage(String error) {
		if(util.getText(this.getPasswordNotMatchErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Password and Confirm Password not matching");
		}
		else {
			System.out.println("No Error Message displayed, Password and Confirm Password are same");
		}
	}
	
	public void verifyValidNameErrorMessage(String error) {
		if(util.getText(this.getInvalidNameErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Enter Valid Name in Name field");
		}
		else {
			System.out.println("No Error Message displayed, Entered Valid Name in Name field");
		}
	}
	
	public void verifyMobileNumberErrorMessage(String error) {
		if(util.getText(this.getEmptyMobileErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Enter Mobile Number in Mobile field");
		}
		else {
			System.out.println("No Error Message displayed, Entered Mobile Number in Mobile field");
		}
	}
	
	public void verifyNameLengthErrorMessage(String error) {
		if(util.getText(this.getNameLengthErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Name length is not more than 3 characters");
		}
		else {
			System.out.println("No Error Message displayed, Name length is more than 3 characters");
		}
	}
	
	public void verifyPasswordLengthErrorMessage(String error) {
		if(util.getText(this.getPasswordLengthErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Password length is not more than 6 characters");
		}
		else {
			System.out.println("No Error Message displayed, Password length is more than 6 characters");
		}
	}
	
	public void verifyConfirmPasswordLengthErrorMessage(String error) {
		if(util.getText(this.getConfirmPasswordLengthErrorMessage()).equals(error)) {
			System.out.println("Error Message displayed, Confirm Password length is not more than 6 characters");
		}
		else {
			System.out.println("No Error Message displayed, Confirm Password length is more than 6 characters");
		}
	}
	
}
