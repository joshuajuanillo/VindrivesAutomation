Feature: Daily Health Check for VDP Boost

  @tipReport
  Scenario: C258544 Verify if VDP Boost has data
    When I navigate to the "VDP Boost" from advance Report
    Then the "VDP Boost" should have data