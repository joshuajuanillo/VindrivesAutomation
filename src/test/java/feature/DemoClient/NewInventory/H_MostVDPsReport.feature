Feature: Demo Client Data Health Check for Most VDPs Report

  Scenario: C188437 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Most VDPs" should have data

  Scenario: C188438 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Most VDPs" should have data

  Scenario: C188439 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Most VDPs" should have data
