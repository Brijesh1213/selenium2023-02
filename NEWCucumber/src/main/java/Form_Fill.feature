Feature: Form Filling Test

Scenario Outline: Fill Selenium Test Form
Given user is on form page
Then enter first name "<FirstName>" 
Then enter lastName"<LastName>" and Select Sex
Then enter years of experience, date and profession
Then Select Flavoours of selenium, continents and commands

Then Close All

Examples:
|FirstName|LastName|
|Brijesh|Trivedi|

