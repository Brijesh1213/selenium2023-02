Feature: login feature


#Scenario: Free Gmail test scenario

#Given User is already on Login Page
#Then User Enter "bbtvision@gmail.com" and User click on Next
#Then User Enter "Lalo@123456" User click on Next


Scenario Outline: Free Gmail test scenario

Given User is already on Login Page
Then User Enter <username> and User click on Next
Then User Enter "<password>" User click on Next
Then close the browser
Examples:
|username|password|
|12|Lalo@123456|
