@CRM_Registration_and_Login
Feature: CRM Registration Form submission

@CRM_Registration
Scenario Outline: Register new user using CRM Registration form
Given Launch the CRM application
When User clicks on Register Now button
Then User should land on Register form page
When User enters the name "<Name>"
And User enters the email "<Email>"
And User enters the password "<Password>"
And User enters the confirm password "<Password>"
And User enters the mobile "<Mobile>"
And User clicks on Register Now in Registration form
Then User should navigate to Login Page
When User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks on Log In button

@CRM_Registration
Examples:
|Name	|Email					|Password	|Mobile		|
|Ramesh	|rameshduraim7@gmail.com|Crm@12345!	|9384303386	|


