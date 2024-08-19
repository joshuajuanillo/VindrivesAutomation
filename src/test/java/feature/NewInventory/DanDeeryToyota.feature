Feature: Dan Deery Toyota Data Health Check
  This feature deal with validating the data for each section if it has data for Demo Client

  @vdpRoi
  Scenario: C97045 Verify that Total VDPs section should have value
    Given a user with a correct credentials
      | email    | jjuanillo@dealercmo.com |
      | password | !Pass1234               |
    When I navigate to the Result Summary Page
    And I select vehicle type "New Inventory"
    And I select "Dan Deery Toyota"
    Then the totalVDPs should have data

  Scenario: C97046 Verify if Avg VDPs has value
    Then the Avg VDPs Vehicle should have data

  Scenario: C97047 Verify if Front Line Ready has value
    Then the Front Line Ready should have data

  Scenario: C97048 Verify if Sales to FLR Ratio has value
    Then the Sales to FLR Ratio should have data

  Scenario: C97049 Verify if Sales Pace has value
    Then the Sales Pace should have data

  Scenario: C97050 Verify if Average days to sell has value
    Then the Average days to sell have data

  Scenario: C97051 Verify if Result Score is not empty
    Then the result score should show data

# Needs Attention
  Scenario: C97052 Verify that Needs attention for vehicle with red results score should have value
    Then the "Red" results score has data

  Scenario: C97053 Verify that Needs attention for vehicle with yellow results score should have value
    Then the "Yellow" results score has data

# Quick Result Table
  Scenario: Verify that Zero Leads column from the quick result table show now show all data are 0
    Then the Zero Leads column should have data

## Merchandising

  Scenario: C103280 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 7 Days"
    And the "Channel Stats report" should have data

  Scenario: C103281 Verify that Last Month date range filter should show data
    Then I click "Last Month"
    And the "Channel Stats report" should have data

  Scenario: C103282 Verify that Last 30 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 30 Days"
    And the "Channel Stats report" should have data

  Scenario: C103283 Verify that Last 60 Days date range filter should show data
    Then I click "Last 60 Days"
    And the "Channel Stats report" should have data

  Scenario: C103284 Verify that Last 90 Days date range filter should show data
    Then I click "Last 90 Days"
    And the "Channel Stats report" should have data

  Scenario: C168429 Verify if Pre Shoot report has data
    When I navigate to the "Pre Shoot report" from merchandising report
    Then the "Pre Shoot report" should have data

 ## VDP Result
  Scenario: C103370 Verify that Last 7 Days date range filter should show data
    When I navigate to the VDP Result
    Then I click "Last 7 Days"
    And the "VDP Result" should have data

  Scenario: C103371 Verify that Last Month date range filter should show data
    When I navigate to the VDP Result
    Then I click "VDP Result Last Month"
    And the "VDP Result" should have data

  Scenario: C103374 Verify that All time data range filter will show data
    When I navigate to the VDP Result
    Then I click "All Time"
    And the "VDP Result" should have data

### Advance Report
  Scenario: C103419 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Leads" from advance Report
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: C103450 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Most VDPs" should have data

  Scenario: C103481 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Least VDPs" should have data

  Scenario: C103512 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Last 7 Days"
    And the "Days on Lot" should have data

  Scenario: C103420 Verify that Last Month date range filter should show data
    When I navigate to the "Leads" from advance Report
    Then I click "Advance Report Last Month"
    And the "Leads" should have data

  Scenario: C103451 Verify that Last Month date range filter should show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Advance Report Last Month"
    And the "Most VDPs" should have data

  Scenario: C103482 Verify that Last Month date range filter should show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Advance Report Last Month"
    And the "Least VDPs" should have data

  Scenario: C103513 Verify that Last Month date range filter should show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Advance Report Last Month"
    And the "Days on Lot" should have data

  Scenario: C103421 Verify that All time data range filter will show data
    When I navigate to the "Leads" from advance Report
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: C103452 Verify that All time data range filter will show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "All Time"
    And the "Most VDPs" should have data

  Scenario: C103483 Verify that All time data range filter will show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "All Time"
    And the "Least VDPs" should have data

  Scenario: C103514 Verify that All time data range filter will show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "All Time"
    And the "Days on Lot" should have data

### Marketing Result
  Scenario: C103542 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Budget ROI" from marketing result report
    Then I click "Budget Roi Last 7 Days"
    And the "Budget ROI" should have data

  Scenario: C103543 Verify that Last Month date range filter should show data
    Then I click "Budget Roi Last Month"
    And the "Budget ROI" should have data

  Scenario: C103550 Verify that Last 90 Days date range filter should show data
    Then I click "Budget Roi Last 90 Days"
    And the "Budget Roi" should have data

  Scenario: C103568 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Vdps by Channel" from marketing result report
    Then I click "Vdps by Channel Last 7 Days"
    And the "Vdps by Channel" should have data

  Scenario: C103569 Verify that Last Month date range filter should show data
    Then I click "Vdps by Channel Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C103570 Verify that Last 90 Days date range filter should show data
    Then I click "Vdps by Channel Last 90 Days"
    And the "Vdps by Channel" should have data

  Scenario: C103582 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Top 10 Website" from marketing result report
    Then I click "Top 10 Website Last 7 Days"
    And the "Top 10 Website" should have data

  Scenario: C103583 Verify that Last Month date range filter should show data
    Then I click "Top 10 Website Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C103584 Verify that Last 90 Days date range filter should show data
    Then I click "Top 10 Website Last 90 Days"
    And the "Top 10 Website" should have data

## Website
  Scenario: C103598 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And the "VDP ROI" should have data

  Scenario: C103599 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  Scenario: C103600 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data


### Third Parties
  @vdpRoi
  Scenario: C103613 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Third Parties"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C103614 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C103615 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data

 ### Combine
  @vdpRoi
  Scenario: C103628 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Combined"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C103629 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C103630 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data
    And Close Browser

