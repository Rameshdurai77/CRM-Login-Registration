@CRM_Registration_and_Login
Feature: CRM Login Validation

@CRM_Login
Scenario Outline: Login with Valid Credential
Given Launch the CRM application
Then User should navigate to Login Page
When User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks on Log In button
Then User should navigate the CRM dashboard page

@CRM_Login
Examples:
|Email					|Password	|
|sneha.kiaq@gmail.com	|Sneha@123	|