Feature: Demo Client Data Health Check for Result Summary

  @resultSummary
  Scenario: C97045 Verify that Total VDPs section should have value
    Then the totalVDPs should have data

  @resultSummary
  Scenario: C97046 Verify if Avg VDPs has value
    Then the Avg VDPs Vehicle should have data

  @resultSummary
  Scenario: C97047 Verify if Front Line Ready has value
    Then the Front Line Ready should have data

  @resultSummary
  Scenario: C97048 Verify if Sales to FLR Ratio has value
    Then the Sales to FLR Ratio should have data

  @resultSummary
  Scenario: C97049 Verify if Sales Pace has value
    Then the Sales Pace should have data

  @resultSummary
  Scenario: C97050 Verify if Average days to sell has value
    Then the Average days to sell have data

  @resultSummary
  Scenario: C97051 Verify if Result Score is not empty
    Then the result score should show data


# Needs Attention
  @resultSummary
  Scenario: C97052 Verify that Needs attention for vehicle with red results score should have value
    Then the "Red" results score has data

  @resultSummary
  Scenario: C97053 Verify that Needs attention for vehicle with yellow results score should have value
    Then the "Yellow" results score has data

# Quick Result Table
  Scenario: C97058 	Verify that Missing Photos column from the quick results table should not show 0 data in all row
    Then the Missing Photos column should have data

  Scenario: C97059 Verify that Less than 50 VDPs column from the quick results table should not show 0 data in all row
    Then the Less than fifty Vdps column should have data

  @resultSummary
  Scenario: C97062 Verify that Zero Leads column from the quick result table show now show all data are 0
    Then the Zero Leads column should have data