Feature: Booking Approvals
  User navigates to booking approvals page

  Scenario: User is able to approve a booking.

    When User clicks the booking approvals button
    And User Selects site location from site location dropdown button
    Then User should see a list of bookings
    When User clicks the approve booking button
    Then User should see a booking approved status



    Scenario: User is able to disapprove a booking
      When User clicks the booking approvals page
      And User selects site location from site location dropdown button
      Then User should see a list of bookings
      When User clicks the disapprove booking button
      Then User should see a booking disapproved status