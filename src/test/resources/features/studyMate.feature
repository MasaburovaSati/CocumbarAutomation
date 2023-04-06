@regression @product @smoke
Feature: Study Mate Login


  @login
  Scenario:  Verifying the login functionality
    Given user on study mate application
    And user enters credentials "email" and "password" and clicks login
    Then user should be successfully login to application

