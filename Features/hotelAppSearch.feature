Feature: Search
@SmokeTest @SanityTest
Scenario: Login to the Hotel App
Given I am on Hotel app login
When I enter username "vasuvespag"
And I enter password "vasu1234"
And I click login
Then I login Successfully
 
@E2ETest
Scenario: Search for a Hotel
Given I am on Hotel app login
When I enter username "vasuvespag"
And I enter password "vasu1234"
And I click login
And I enter City "London"
And I enter Hotel name "Hotel Sunshine"
And I enter Room type "Deluxe"
And I enter Number of rooms "2 - Two"
And I click on Search
Then the search is Successful