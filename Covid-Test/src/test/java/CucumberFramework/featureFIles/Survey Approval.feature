Feature: Survey Approval
  User navigates to survey approval page

  Scenario: User is able to approve the surveys.

    When User clicks the survey approval button
    And User selects region from region dropdown button
    Then User should be able to view surveys
    When User clicks approve survey button
    Then User should see approved status on survey page





    Scenario: User is able to disapprove a survey
      When User clicks the survey approval button
      And User selects region from region dropdown button
      Then User should be able to view surveys
      When User clicks disapprove survey button
      Then User should see disapproved status on survey page