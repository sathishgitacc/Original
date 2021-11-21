Feature: Home Page Test

Scenario: E2E

Given browser "chrome" in "https://www.applebees.com/en" 
When user logged in
And Place Order

