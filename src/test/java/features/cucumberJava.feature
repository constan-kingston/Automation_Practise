@myAutomationPractice
Feature: Test My AutomationPractice website 
	I want to test login purchase features
	

@RegisterUser
Scenario Outline:
	Given I enter the url in the automationpractise "<url>"
	When I click the signin buton
	Then I enter the email "<email>" id
	And I enter the firstname "<fname>" and lastname "<lname>" and passoword "<password>"
	And I enter the company "<company>" addr1 "<addr1>" addr2 "<addr2>" city "<city>" st "<state>" zip "<pcode>" phone "<phone>" mobile "<mobile>"
	Then I verify the signon Name "<fname>" and "<lname>"
	
	Examples:
	|url|email|fname|lname|password|company|addr1|addr2|city|state|pcode|phone|mobile|
	|https://automationpractice.com/index.php|test3fgv545work@abc.com|myfname|mylame|12345|mycompany|myaddr1|myaddr2|mycity|Arizona|12345|98452|32147|


@Signin_signout
Scenario Outline: Signing in and Signing out
	Given I enter the url in the webpage"<url>"
	When I enter email id "<email>" and password "<password>"
	And I verify the signon name "<fname>" and "<lname>"
	
	Examples:
		|url|email|password|fname|lname|
		|https://automationpractice.com/index.php|test123const@test.com|12345|TestUser|UserLast|
		

	
	
@PurchaseItem
Scenario Outline: Purchase An Item from List
	Given I enter the website url in the webpage"<url>"
	When I enter the website email id "<email>" and password "<password>"
	And I add item to the cart
	And I navigate to purchase page
	Then I verify the added product
	
	Examples:
	|url|email|password|
	|https://automationpractice.com/index.php|test123const@test.com|12345|
	
	
	
	
	

		