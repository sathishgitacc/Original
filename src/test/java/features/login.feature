Feature: Application Login

Scenario: Positive scenario

Given Start browser
When user click "Hi" in "Hi1"
Then user is logged 
And Report Steps

Scenario: Negative scenario
Given Start browser
When user click "Hi1" in "Hi111"
Then user is logged 
And Report Steps
