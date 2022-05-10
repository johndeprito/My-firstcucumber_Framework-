Feature: Feed to data in Register patient 
functionality for OpenMRS Application

Background:
	Given Open the browser and launch the application
	Then Enter "Admin" in username
	And  Enter "Admin123" in password
   	And Select the "isolation ward"
   	And Click the login
   
  Scenario: Enter the patient detail in Demographics
    Given Click the "Register a patient"
    And Enter the firstName
    And Enter the mid name
    And Enter the familyname
    And Click the next
    Then Select the gender
    And Click the next button 
    And Enter the patient Date of Birth date
    And Select month
    Then Enter the year of Date of Birth
    And Click the next button1 
   
   	 And Enter the valid Address1
   	 And Enter the Address2
   	 And Enter the city name
   	 And Enter the state
   	 And Enter the Country
   	 And Enter the Postal Code
   	 And Click to the next
   	 And Enter the Valid patient phone number
   	 And CLick next
   	 
   	 And Select any one given relationship type in dropdown
   	 Then Enter the person name
   	 And CLick next for submit
   	
   	 
   	 And Click the Confirm button
   	 And Validate the patient Name
   	 
   	  #And If you need add more relations can click add(+)
   	 
   	 
   	 #Scenario Outline: Enter the patient detail in Demographics
   	 #Given Click the "<Register a patient>"
   	 
   	 #And If need unidentified patient can select or leave it
   	 #Examples:
   	# |||