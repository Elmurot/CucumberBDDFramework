Feature: Free CRM Login Feature

# without Examples keyword
#Scenario: Free CRM Login Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "KemalNasafi" and "freecrm123"
#Then user clicks on Login button 
#Then user is on homepage

# with Examples keyword

Scenario Outline: Free CRM Login Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button 
Then user is on homepage
Then user close the browser

Examples:

		|username   |password  |
		|KemalNasafi|freecrm123|
		|Tom        |test456   |