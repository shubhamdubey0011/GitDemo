Feature: As a user i want to verify all the web elements present on the web page

  Scenario: Verify ActiTime Login screen
    Given User navigtes to actitime loginscreen
    Then user verify the title,textfield of username,Password ,login button and  keep me logged in
    Then close the browser
