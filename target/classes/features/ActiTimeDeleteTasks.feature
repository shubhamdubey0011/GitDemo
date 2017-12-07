#Sample Feature Definition Template
@tag
Feature: Verifying Delete Taks functionality 
 As a user i should be able to delete any tasks 
 
 
 Background: 
    Given user is on the loginpage
    When user entered  the username as admin
    And user enter password as  manager
    Then clicks on login Button
    Then User should be in Homepage

  @tag1
  Scenario: Deletion of Tasks
    Given user should be on the tasks OpenTasks page
    And verify there should be atleast one task created 
    When user selects the task to be deleted 
    And clicks on Delete Selected task button 
    Then verify an alert pop-up should show 
    And from pop-up click on  Delete task button 
    Then task should be deleted  

