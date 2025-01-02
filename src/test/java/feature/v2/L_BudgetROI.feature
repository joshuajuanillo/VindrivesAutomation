Feature: Data Health Check for Budget ROI

  Scenario: C321578 Verify that Budget ROI Shows Data
    When I navigate to the "Budget ROI" from marketing result report
    And All data are not zero

  Scenario: C321578 Verify Budget from AutoTrader are not Zero
    Then Budget from Autotrader is not zero
