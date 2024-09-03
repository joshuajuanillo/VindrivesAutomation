Feature: Demo Client Data Health Check for Budget ROI Report

  Scenario: C96585 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Budget ROI" from marketing result report
    Then I click "Budget Roi Last 7 Days"
    And the "Budget ROI" should have data

  Scenario: C96586 Verify that Last Month date range filter should show data
    Then I click "Budget Roi Last Month"
    And the "Budget ROI" should have data

  Scenario: C96613 Verify that Last 90 Days date range filter should show data
    Then I click "Budget Roi Last 90 Days"
    And the "Budget Roi" should have data
