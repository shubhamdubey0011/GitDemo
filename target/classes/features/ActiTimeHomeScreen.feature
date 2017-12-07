Feature: HomeScreen web elements  verification

  Background: 
    Given user is on the loginpage
    When user entered  the username as admin
    And user enter password as  manager
    Then clicks on login Button
    Then User should be in Homepage

  Scenario: As a user i want to verify all the web elements present on the homescreen
    Then verify Time-Track tab is present
    Then verify Tasks tab is present
    Then verify Reports tab is present
    Then verify user tab is present
    Then verify Work-Schedule Tab is present
    Then verify these options are available Setting options, add-ons options and Help&support.
