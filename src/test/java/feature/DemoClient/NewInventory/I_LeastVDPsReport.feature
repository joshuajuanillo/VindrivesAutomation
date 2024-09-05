Feature: Demo Client Data Health Check for Least VDPs Report

  Scenario: C188468 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Least VDPs" should have data

  Scenario: C188469 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Least VDPs" should have data

  Scenario: C188470 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Least VDPs" should have data
