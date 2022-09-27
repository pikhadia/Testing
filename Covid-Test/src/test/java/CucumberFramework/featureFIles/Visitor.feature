Feature: Sign up as a visitor
  User navigates to covid app as a visitor and retrieve th QR code

  Scenario: Navigate to covidstreamline.com app as a visitor

    Given User clicks the visitor button
    And User enters firstname and lastname
    And User enters valid ID number and Email address
    When User press reason for visit button
    And User press submit button
