Feature: Login Functionality

Background: 
Given User navigates to Login Page

Scenario Outline: Login functionality with Valid Credentials
When Enter Valid Username <Username>
And Enter Valid Password <Password>
And clcik on Login button
Then User should login Scuccessfully 

Examples:
|Username								 |Password |
|sagar.tatarao@gmail.com |Sagar@458  |
|saga.tatarao@gmail.com |sagar111|