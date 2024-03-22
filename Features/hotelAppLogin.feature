Feature: Hotel App Login

Scenario: Login Successful
Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
And I enter password as "vasu1234"
And I click Login
Then I am Logged in Successfully
