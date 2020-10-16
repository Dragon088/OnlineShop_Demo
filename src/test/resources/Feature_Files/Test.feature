@Demo 
Feature: Purchase of online products through product categories: Phones, Laptops and Monitors 

Scenario: Purchase functionality of online products 
	Given I am on landing page of online shop demoblaze 
	When navigate to Laptop and select Sony vaio i5 product 
	And click on add to cart 
	And accept pop up confirmation 
	And click on home page icon 
	And navigate to Laptop and select Dell i7 8gb product 
	And click on add to cart
	And accept pop up confirmation 
	And click on cart  
	And click on Delete Dell i7 8gb from cart 
	And click on Place order 
	And fill in all web form fields 
			| name | country | city | creditcard | month | year |
		    | Arun | india   | noida| 5625625655 | 4     | 2020 |
	And click on Purchase 
	And capture and log purchase Id and Amount 
	Then verify that purchase amount equals expected 
	And click on ok 
	
	
	
