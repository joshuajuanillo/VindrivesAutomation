Feature: Data Health Check for Budget ROI

  Scenario: C332571 Verify that Budget ROI Shows Data for Last 7 Days
    When I navigate to the "Budget ROI" from marketing result report
    Then I click "Budget Roi Last 7 Days"
    And All data are not zero

  Scenario: C332572 Verify that Budget ROI Shows Data for Last Month
    When I navigate to the "Budget ROI" from marketing result report
    Then I click "Budget Roi Last Month"
    And All data are not zero
