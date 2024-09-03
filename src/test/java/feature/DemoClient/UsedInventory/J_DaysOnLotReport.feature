Feature: Demo Client Data Health Check for Days on Lot Report

  Scenario: C96558 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Last 7 Days"
    And the "Days on Lot" should have data

  Scenario: C96559 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Days on Lot" should have data

  Scenario: C96560 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Days on Lot" should have data
