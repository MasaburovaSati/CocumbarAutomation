@regression @product @smoke
Feature: Verify +Add announcement button on announcement page

  @201
  Scenario: Clicking on +Add announcement button and verify
    Given user on study mate application
    And user enters credentials "email" and "password" and clicks login
    Then user should be successfully login to application
    And  user click on the announcement page located on the left side bar
    When user click on +Add announcement button
    Then user should see pup ups option

@202
    Scenario: Creating an announcement
      Given user on study mate application
      And user enters credentials "email" and "password" and clicks login
      Then user should be successfully login to application
      And  user click on the announcement page located on the left side bar
      When user click on +Add announcement button
      And user enter text and filling out all option
      Then user should click Add button and verify in announcement page
@203
      Scenario: Creation an announcement without group name
        Given user on study mate application
        And user enters credentials "email" and "password" and clicks login
        Then user should be successfully login to application
        And  user click on the announcement page located on the left side bar
        When user click on +Add announcement button
        And user enter text an announcement
        Then user should click Add button and verify this announcement in main page

@205
        Scenario: Verifying editing button for an announcement
          Given user on study mate application
          And user enters credentials "email" and "password" and clicks login
          Then user should be successfully login to application
          And  user click on the announcement page located on the left side bar
          Then user clicks three dots button on any announcement card
          And user clicks edit option
          And user updates text of announcement
          Then user verifies text of announcement is updated






