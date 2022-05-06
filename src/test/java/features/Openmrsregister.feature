Feature: Feed to data in Register patient 
functionality for OpenMRS Application

  Scenario: Enter the patient detail in Demographics
    Given Register a patient
    And Type the first name
    And Enter the middle name
    And Enter the last name
    And If need unidentified patient can select or leave it
    Then Select the gender
    And Enter the patient Date of Birth date
    And Select month
    Then Enter the year of Date of Birth
    And Click next 
   
   	 And Enter the valid Address1
   	 And Enter the Address2
   	 And Enter the City/Village
   	 And Enter the State/Province
   	 And Enter the Country
   	 And Enter the Postal Code
   	 And Enter the Valid patient phone number
   	 
   	 And Select any one given relationship type in dropdown
   	 Then Enter the person name
   	 And If you need add more relations can click add(+)
   	 
   	 Given Click the Confirm button
   	 
   	 