Feature: GmailLogin feature

@SmokeTests
Scenario: Test one	
	Given I am at Login page
	When I enter valid uid and pwd
	Then I am at Compose page
	And I will Logout

@SmokeTests
Scenario: Test the password error	
	Given I am at Login page
	When I enter invalid uid and pwd
	Then Validate a error message

	

	
	