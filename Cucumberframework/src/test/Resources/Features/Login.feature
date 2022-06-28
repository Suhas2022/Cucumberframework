Feature: Login to the application

Scenario: Validate login to the application is successful with valid credentials
	
	Given user launch browser
	When user opens application page "http://automationpractice.com/index.php"
	And user clicks on Sign In
	Then user enters email as "testingframework123@gmail.com" and password as "Automation"
	And click on Sign In

