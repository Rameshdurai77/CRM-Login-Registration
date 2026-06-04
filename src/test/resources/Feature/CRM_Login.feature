@CRM_Login
Feature: CRM Login Validation

Scenario Outline: Login with Valid Credential
Given Launch the CRM application
Then User should navigate to Login Page
When User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks on Log In button
Then User should navigate the CRM dashboard page

Examples:
|Email					|Password	|
|sneha.kiaq@gmail.com	|Sneha@123	|


Scenario Outline: Login with Invalid email and password
Given Launch the CRM application
Then User should navigate to Login Page
When User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks on Log In button
Then User should see error message when invalid email and password entered "<ErrorMessage>"

Examples:
|Email							|Password		|ErrorMessage	|
|rameshduraim7@gmail.com		|Crm@1231231	|Error			|


Scenario Outline: Login with Valid email and empty password
Given Launch the CRM application
Then User should navigate to Login Page
When User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks on Log In button
Then User should see error message when valid email and empty password entered "<ErrorMessage>"

Examples:
|Email					|Password	|ErrorMessage				|
|sneha.kiaq@gmail.com	|			|Password cannot be empty	|


Scenario Outline: Login with Empty email and Valid password
Given Launch the CRM application
Then User should navigate to Login Page
When User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks on Log In button
Then User should see error message when empty email and Valid password entered "<ErrorMessage>"

Examples:
|Email					|Password	|ErrorMessage				|
|						|Sneha@123	|Email cannot be empty		|

Scenario Outline: Login with Empty email and password
Given Launch the CRM application
Then User should navigate to Login Page
When User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks on Log In button
Then User should see error message when no email and password entered "<ErrorMessage>"

Examples:
|Email					|Password	|ErrorMessage									|
|						|			|Email cannot be empty,Password cannot be empty	|