Feature: Application Login Setup

  @setup
  Scenario: Verify if user can successfully login
    When I navigate to the Result Summary Page
    And I select "Bill Brandt Ford"
    And I select vehicle type "Used Inventory"
