Feature: login functionality
Scenario: login  with valid credentials

Given user navigate to login page
When user enters the following details                  
            |sagar.tatarao@gmail.com|   |Sagar@458|
            |sagar458@gmail.com| |123458|
And clicks on login button
Then user should get login scucess