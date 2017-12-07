Feature: As a user
  I want to login to actiTime with valid credentials

  Scenario Outline: ActiTime Application user login verification
    Given user is on the loginpage
    When user entered  the username as <username>
    And user enter password as  <password>
    Then clicks on login Button
    Then User should be in Homepage
    Then verify help option

    Examples: 
      | username | password |
      | admin    | manager  |
