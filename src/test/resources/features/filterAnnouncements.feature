@regression @product @smoke
Feature: Searching announcement given by group


  @sati
  Scenario: Verifying search announcement by group name

    Given user on study mate application
    And user enters credentials "email" and "password" and clicks login
    And  user click on the announcement page located on the left side bar
    When user click on the group dropdown menu
    Then user should see a list of all groups on the platform
    And user choose any one group
    Then user should see only the announcements related to that group




