Feature: View Active Passport
User navigates to View active Passport page and views passport.

Scenario: User is able to view the Active Passports.

  When User clicks the view active passport page
  And User selects region from region dropdown button
  And User selects location from location dropdown button
  Then User selects date from date picker
  When User Clicks ok button
  Then User should view passports
