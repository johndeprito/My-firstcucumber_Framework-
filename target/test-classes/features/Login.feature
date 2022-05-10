Feature: Validation of login
  functionality for OpenMRS Application
  
   # Scenario: Verification login success (Postive case)
    #Given Open the browser and launch the application
  #  Then Enter Username
  #  And  Enter Password 
   # And Select the isolation ward
   # And Click the login
    #Then Validate login is success 
    
   # Scenario: validate validation message for failure cases (neagative case)
    #Given Open the browser and launch the application
    #Then Enter the Invalid Username
    #And Enter the Invalid Password
    #And select the Isolation ward
    #And click the login 
   # Then verify error message is getting displayed
   
   Scenario Outline:Verification login success (Postive case)
   Given Open the browser and launch the application
   Then Enter "<userName>" in username
   And  Enter "<passcode>" in password
   And Select the "<wardType>" 
   And click the login
   
   Examples:
   |userName|passcode|wardType|
   |Admin|Admin123|Isolation Ward|
   #|admin|admin321|Registration Desk|