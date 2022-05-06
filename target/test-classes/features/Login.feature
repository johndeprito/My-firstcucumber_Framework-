Feature: Validation of login
  functionality for OpenMRS Application
  
    Scenario: Verification login success (Postive case)
    Given Open the browser and launch the application
    Then Enter Username
    And  Enter Password
    And Select the isolation ward
    And Click the login
    Then validate login is success 
    
#    Scenario: validate validation message for failure cases (neagative case)
#    Given Open the browser and launch the application
#    Then Enter the Invalid Username
#    And Enter teh Invalid Password
#    And select the Isolation ward
#    And click the login 
#    Then verify error message is getting displayed