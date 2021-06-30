Feature: validate Setting Background color functionality 

Background: 
	Given "Set SkyBlue Background" button exists 
@setBackGroundColor
Scenario: 1 user should be able to set skyBlue BackGround
	When user click on the button
    Then the background color will change to sky blue 
	
