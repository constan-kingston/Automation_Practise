@myAutomationPractice
Feature: Title of your feature 
	I want to use this template for my feature file
	
@register
Scenario Outline: Register in the practice website 
	Given I enter the url in the webpage <url> 
	When I click the signin buton 
	Then I enter the <email> id
	And I enter the "<fname>" and "<lname>" and "<password>" 
	And I enter the "<company>" and "<addr1>" and "<addr2>" and "<city>" and "<state>" and "<pcode>" and "<phone>" and "<mobile>"
	Then I verify the signon Name "<fname>" and "<lname>"
	
	
	Examples: 
		| url                                      |email           | fname  |lname  |passoword|company  |addr1|addr2|city  |state  |pcode|phone|mobile|
		| https://automationpractice.com/index.php |test123ghj@abc.com| mfname ||mlname|12345    |mycompany|addr1|addr2|mycity|Arizona|15485|14865|18184 |
		

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
	
	
	
	
	

		