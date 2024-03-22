Feature: Hotel App Login

Scenario Outline: Login Successful
Given I am on Hotel App Login Page
When I enter username as <username>
And I enter password as <password>
And I click Login
Then I am Logged in Successfully


	Examples:   
	    |username      | password     | 
      | "vasuvespag" | "vasu1234"   |
      | "jastisrija" | "OY38RV"     |
      | "Varsharaj"  | "Varsharaj"  |
     
    
     
      