@regression @product @smoke
Feature: Searching announcement given by all group


  @sati1
  Scenario: Verifying search announcement by all group name

    Given user on study mate application
    And user enters credentials "email" and "password" and clicks login
    And  user click on the announcement page located on the left side bar
    When user click on the group dropdown menu
    And user choose all group name
    Then user should see only the announcements related all group
