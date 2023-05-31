@all
Feature: open the register page 

Background:
Given open the register account page
@register @manditoryfields @regression
Scenario: Enter with all fields 
 
 When Enter the first name "sagar"into first name field
 And Enter the last name "chokkakula" into last name field
 And Enter the email "sagartatarao458@gmail.com"into email field
 And Enter the telepone "9494770458"into telephone field
 And Enter the password "Sagar@458" into password field
 And Enter the password "Sagar@458" into conform the password field
 And select the privacy field
 Then  click on the continue button
 
 
 
