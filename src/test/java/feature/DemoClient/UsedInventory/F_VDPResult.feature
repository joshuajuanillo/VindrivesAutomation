Feature: Demo Client Data Health Check for VDP Result

  Scenario: C96475 Verify that Last 7 Days date range filter should show data
    When I navigate to the VDP Result
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data

  Scenario: C96476 Verify that Last Month date range filter should show data
    Then I click "VDP Result Last Month" V2
    And the "VDP Result" should have data

  Scenario: C96479 Verify that All time data range filter will show data
    Then I click "All Time" V2
    And the "VDP Result" should have data