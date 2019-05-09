Feature: Free CRM Create Contacts Feature

Scenario Outline: Free CRM Create a new contacts Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button 
Then user is on homepage
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then user close the browser


Examples:

		|username   |password  |firstname|lastname |position |
		|KemalNasafi|freecrm123|Elmurot	 |Yangiboev|QA lead  |
		|KemalNasafi|freecrm123|Tom      |Jackson  |QA tester|