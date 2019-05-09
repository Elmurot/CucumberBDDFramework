Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
|username   |password  |
|KemalNasafi|freecrm123|
Then user clicks on Login button 
Then user is on homepage
Then user moves to new deal page
Then user enters deal details
|   title   |amount|probability|comission|
| test deal | 1000 |     50    |   10    |
| test deal | 2000 |     60    |   20    |
| test deal | 3000 |     70    |   30    |
Then user close the browser