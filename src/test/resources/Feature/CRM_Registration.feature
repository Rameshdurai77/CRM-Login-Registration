@CRM_Registration
Feature: CRM Registration Form submission
  Background:
    Given Launch the CRM application
    When User clicks on Register Now button
    Then User should land on Register form page
  
Scenario Outline: Register new user using CRM Registration form
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

Examples:
 |Name		|Email					|Password	|Mobile		|
 |Ramesh	|rameshduraim7@gmail.com|Crm@12345!	|9384303386	|

Scenario: User tries to register without entering any data
 When User clicks on Register button
 Then validation messages should be displayed for all mandatory fields with one dim list
  |Name is required|
  |Email cannot be empty|
  |Password cannot be empty|
  |Confirm Password cannot be empty|

Scenario: User enters only spaces in all fields
  When User enters spaces in all fields " "
  And User clicks on Register Now in Registration form
  Then spaces in field validation messages should be displayed for all mandatory fields with one dim list
    |"name" length must be at least 3 characters long|
    |Email cannot be empty|
    |Password must be at least 6 characters long|
    |Confirm Password must be at least 6 characters long|

Scenario: User registers without name
  And User enters email as "1231231@gmail.com"
  And User enters password as "Password123@"
  And User enters confirm password as "Password123@"
  And User enters mobile number as "9876589777"
  And User clicks on Register Now in Registration form
  Then name validation message should be displayed "Name is required"

Scenario: User registers without email
  When User enters name as "name"
  And User enters password as "Password123@"
  And User enters confirm password as "Password123@"
  And User enters mobile number as "9876589777"
  And User clicks on Register Now in Registration form
  Then email validation message should be displayed "Email cannot be empty"

Scenario: User registers without password
  When User enters name as "name"
  And User enters email as "1231231@gmail.com"
  And User enters confirm password as "Password123@"
  And User enters mobile number as "98765"
  And User clicks on Register Now in Registration form
  Then password validation message should be displayed "Password cannot be empty"

Scenario: User registers without confirm password
  When User enters name as "name"
  And User enters email as "1231231@gmail.com"
  And User enters password as "Password123@"
  And User enters mobile number as "98765"
  And User clicks on Register Now in Registration form
  Then confirm password validation message should be displayed "Confirm Password cannot be empty"

Scenario: User enters special characters in name field
  When User enters name as "@#$%^"
  And User enters email as "lokesh@gmail.com"
  And User enters password as "Password123@"
  And User enters confirm password as "Password123@"
  And User enters mobile number as "9876543210"
  And User clicks on Register Now in Registration form
  Then Invalid name validation message should be displayed "Enter a valid Name"
  
Scenario: User enters password and confirm password mismatch
  When User enters name as "Lokesh"
  And User enters email as "lokesh@gmail.com"
  And User enters password as "Password123@"
  And User enters confirm password as "Password321@"
  And User enters mobile number as "9876543210"
  And User clicks on Register Now in Registration form
  Then password mismatch error should be displayed "Passwords do not match"

Scenario: User registers without mobile number
  When User enters name as "name"
  And User enters email as "1231231@gmail.com"
  And User enters password as "Password123@"
  And User enters confirm password as "Password123@"
  And User clicks on Register Now in Registration form
  Then mobile number validation message should be displayed "Something went wrong"
  
Scenario: User enters mobile number less than 10 digits
  When User enters name as "Lokesh"
  And User enters email as "lokesh@gmail.com"
  And User enters password as "Password123@"
  And User enters confirm password as "Password123@"
  And User enters mobile number as "98765"
  And User clicks on Register Now in Registration form
  Then mobile number validation message should be displayed "Something went wrong"