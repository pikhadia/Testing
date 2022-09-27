Feature: Home
  User navigates to home page

  Scenario: User is able to answer a survey.

    When User clicks the Open Survey button
    Then User should see an open Survey

    Scenario: User is able to view Survey
      When User clicks the view survey button
      Then User should see a list of surveys

      Scenario: User is able to make a booking
        When User clicks the make a booking button
        Then User should see an open booking page

        Scenario: User is able to manage a team
          When User clicks the manage team button
          Then User should be see an open team management page