Feature: Demo Client Data Health Check for Most VDPs Report

  Scenario: C96518 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Most VDPs" should have data

  Scenario: C96519 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Most VDPs" should have data

  Scenario: C96520 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Most VDPs" should have data
