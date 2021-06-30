Feature: validate Setting Background color functionality 

Background: 
	Given "Set White Background" button exists 
@setBackGroundColor
Scenario: 1 user should be able to set white BackGround
	When user click on the white button
    Then the background color will change to white 
	
