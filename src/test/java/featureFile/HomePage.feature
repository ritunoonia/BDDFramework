Feature: Verify home Page
As a user
	shold be able to navigate through homepage
	so that i can see whats on offer
	
	Background:
	Given I am on Amazon home page
	
	
	Scenario: Verify homepage title
	Then I should see "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more" Title
	
	
	Scenario: Verify homepage url
	Then the page URL should be "https://www.amazon.co.uk/"
	
	
	Scenario: Verify links in the header
	Then the page URL should be "https://www.amazon.co.uk/"
	
	
	@skip
	Scenario: Verify links in the header
	When I click on  "Today's Deals" link
	Then I should see "Amazon UK Deals - Discover Our Daily Deals" title
	
	@skip
	Scenario Outline: Verify links on header
	When I click on "<linkText>" link
	Then I should see "<pageTitle>" title
	Examples:
	|linkText | pageTitle|
	|Today's Deals | Amazon UK Deals - Discover Our Daily Deals|