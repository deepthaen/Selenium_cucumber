Feature: Login functionality

@Functional
Scenario Outline: Valid Login Credentials
Given user Launches Browser
When user enters Url
Then maximise browser
And wait for page load
Then user clicks on login
And wait for page load
Then user enters username "<username>"
And close browser

Examples: 
				| username |
				| 9035777119 |
				| 9035777119 |
				
Scenario Outline: Valid Login Credentials
Given user Launches Browser
When user enters Url
Then maximise browser
And wait for page load
Then user clicks on login
And wait for page load
Then user enters username "<username>"
And close browser

Examples: 
				| username | password |
				| 345678 | qwertyu |
				
