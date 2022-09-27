Feature: Assign Location
  User navigates to assign location page

  Scenario: User is able to assign locations.

    When User clicks assign locations button
    And User enters user from search user field
    And User enters site form the search site field
    When User clicks the assign location button
    Then User should see location assigned

