Feature: As a user i want to create new tasks so that i can
         add new user to the particular tasks

  Background: 
    Given user is on the loginpage
    When user entered  the username as admin
    And user enter password as  manager
    Then clicks on login Button
    Then User should be in Homepage

  Scenario: verify Create New tasks functionality
    When user clicks on tasks tab
    Then user should be in Open-task page
    And clicks on create tasks button
    Then verify the text of pop-up
    Then create new task page will open
    Then Select new customer
    Then Enter Customer name & project name
    Then enter task name ,enter text ,set deadline
    And select billable billing type
    Then click on create task
