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
	
	@FindBy(xpath="//a[text()='Register Now']")
	private WebElement LoginRegisterBtn;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerFormRegisterBtn;
	
	@FindBy(xpath = "//h2[text()='Register Now']")
	private WebElement registerNow;
	
	@FindBy (xpath = "//h2[text()='CRM System']")
	private WebElement LoginPage;
	
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
	
	public void clickOnLoginRegisterBtn() {
		util.button(this.getLoginRegisterBtn());
	}
	
	public void clickAndSendTextInName(String input) {
		util.button(this.getName());
		util.setText(this.getName(), input);
	}
	
	public void clickAndSendTextInEmail(String input) {
		util.button(this.getEmail());
		util.setText(this.getEmail(), input);
	}
	
	public void clickAndSendTextInPassword(String input) {
		util.button(this.getPassword());
		util.setText(this.getPassword(), input);
	}
	
	public void clickAndSendTextInConfirmPassword(String input) {
//		Utility.button(this.getConfirmPassword());
		util.setText(this.getConfirmPassword(), input);
	}
	
	public void clickAndSendTextInMobile(String input) {
		util.button(this.getMobile());
		util.setText(this.getMobile(), input);
	}
	
	public WebElement getRegisterNow() {
		return registerNow;
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
	
	public void clickOnLoginButton() {
		util.button(this.getLoginBtn());
	}
}
