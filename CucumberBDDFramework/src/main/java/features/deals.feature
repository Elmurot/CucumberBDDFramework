Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
|KemalNasafi|freecrm123|
Then user clicks on Login button 
Then user is on homepage
Then user moves to new deal page
Then user enters deal details
| teast deal | 1000 | 50| 10 |
Then user close the browser
