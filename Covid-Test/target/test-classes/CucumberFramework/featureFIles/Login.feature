Feature: Sign up as a visitor
	User navigates to covid app and fill in required infor to get qr code
	
Scenario: Navigate to covidstreamline.com app
	Given User navigates to covid app 
	And User clicks on the accept button on homepage
	When User clicks the visitor button
	Then User enters fullname  
	And User enters a valid ID number 
	And User enters a valid contact number or email    
	Then User selects reason for visit by clicking the dropdown arrow 
	And User selects location by clicking the dropdown arrow
	Then User enters temperature measured
	And User enters a valid residential location 
	Then User clicks do you have a mask label   
	And User clicks do you have hand sanitizer label  
#	And User clicks i am not label
	When User clicks the save button 
#	Then User should be taken to the QR code page
