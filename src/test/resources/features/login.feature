Feature: Checking login page

Scenario: Login page
Given User is on login page
When user enters username as "dhavlehemant607@gmail.com"
And user enters password as "Automation@123"
And clicks on login button
Then user should be landed on welcome screen