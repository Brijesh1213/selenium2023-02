Feature: Free Gmail Login feature
Scenario: Free Gmail test scenario

Given User is already on Login Page
When title of login page is Gmail
Then User Enter "bbtvision@gmail.com" and User click on Next
Then User Enter "Lalo@123456" User click on Next
Then User is on Home page
Then close the browser

#Examples:
#|username|password|
#|bbtvision@gmail.com|Lalo@123456|

#Feature: Free Gmail Login feature

#without example keyword
#Scenario: Free Gmail test scenario

#Given User is already on Login Page
#When title of login page is Gmail
#Then User Enter "bbtvision@gmail.com" and User click on Next
#Then User Enter "Lalo@123456" User click on Next
#Then User is on Home page

#with Examples