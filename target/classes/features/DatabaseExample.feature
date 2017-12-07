
Feature: As a user
  I want to be able to add new clients in the system
  So that i can add accounting data for that client


	Scenario: Sign-up a new user with datatable example
    Given the user is on landing page
    When she chooses to sign up
    And she provides the her details as follows:
      | firstName | lastName | email             | password |
      | John   | Snow    | validemail2@aq.com | password |
    And she signs-up
    Then she should be logged in to the application