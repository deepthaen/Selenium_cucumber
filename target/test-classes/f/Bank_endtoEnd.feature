Feature:  Banking savings account

Sceanrio Outline : Check Balance and do transaction

Given user launches Hdfc Home page
Then user clicks on Login link
Then user enters "<username>" and "<password>"
And  user clicks login button
Then user verifies page landed to Home page
And User verifies account balance
Then user clciks on add beinfiry
Then user selects bank type
When user enter all required deatisl <acct> and <name> and nickname> 
Then click on add benificiary
Then veridy user benificary added to benifircary list
And navigate to fund transfer
And validate benifirary is listed in benificiary list
Then Select benificary from list
Then Validate same name is selected
Then Eneter amount to transfer
Then select type of transaction <IMPS>
And user clicks on continue
Then click onconfirm
Then cverify transaction number
When  verify tranasction message
Then navigate back to home
Then Validate Actual balancea nd- detucetd balnce
Then Singout applciation

Examples: 
		| username | password | acct | name |
