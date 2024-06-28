Feature: Demo Client Data Health Check
  This feature deal with validating the data for each section if it has data for Demo Client

  Scenario: Verify if totalVDPs has value
    Given a user with a correct credentials
      | email    | jjuanillo@dealercmo.com |
      | password | !Pass1234               |
    When I navigate to the Result Summary Page
    And I select vehicle type "New Inventory"
    And I select "Moses Outlet Corridor G"
    Then the totalVDPs should have data

  Scenario: Verify if Result Score is not empty
    Then the result score should show data

  Scenario: Verify if Avg VDPs has value
    Then the Avg VDPs Vehicle should have data

  Scenario: Verify if Front Line Ready has value
    Then the Front Line Ready should have data

  Scenario: Verify if Sales to FLR Ratio has value
    Then the Sales to FLR Ratio should have data

  Scenario: Verify if Sales Pace has value
    Then the Sales Pace should have data

  Scenario: Verify if Average days to sell has value
    Then the Average days to sell have data

# Needs Attention
  Scenario: Verify that red results score has data
    Then the "Red" results score has data

  Scenario: Verify that yellow results score has data
    Then the "Yellow" results score has data

# Quick Result Table
## Not Yet Implemented

## Merchandising
  Scenario: Verify if Deal Ratings by channel has data for Last 7 days
    When I navigate to the "Deal Ratings by channel" from merchandising report
    Then I click "Last 7 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: Verify if Deal Ratings by channel has data for Last Month
    Then I click "Last Month"
    And the "Deal Ratings by channel" should have data

  Scenario: Verify if Deal Ratings by channel has data for Last 30 Days
    Then I click "Last 30 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: Verify if Deal Ratings by channel has data for Last 60 Days
    Then I click "Last 60 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: Verify if Deal Ratings by channel has data for Last 90 Days
    Then I click "Last 90 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: Verify if Tip Report has data
    When I navigate to the "Tip Report" from merchandising report
    Then the "Tip Report" should have data

  Scenario: Verify if Channel Stats report has data for Last 7 days
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 7 Days"
    And the "Channel Stats report" should have data

  Scenario: Verify if Channel Stats report has data for Last Month
    Then I click "Last Month"
    And the "Channel Stats report" should have data

  Scenario: Verify if Channel Stats report has data for Last 30 Days
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 30 Days"
    And the "Channel Stats report" should have data

  Scenario: Verify if Channel Stats report has data for Last 60 Days
    Then I click "Last 60 Days"
    And the "Channel Stats report" should have data

  Scenario: Verify if Channel Stats report has data for Last 90 Days
    Then I click "Last 90 Days"
    And the "Channel Stats report" should have data

  Scenario: Verify if Pre Shoot report has data
    When I navigate to the "Pre Shoot report" from merchandising report
    Then the "Pre Shoot report" should have data

 ## VDP Result
  Scenario: Verify if VDP Result has data for Last 7 Days
    When I navigate to the VDP Result
    Then I click "Last 7 Days"
    And the "VDP Result" should have data

  Scenario: Verify if VDP Result has data for Last Month
    When I navigate to the VDP Result
    Then I click "VDP Result Last Month"
    And the "VDP Result" should have data

  Scenario: Verify if VDP Result has data for All Time
    When I navigate to the VDP Result
    Then I click "All Time"
    And the "VDP Result" should have data

### Advance Report
  Scenario: Verify if Leads has data for Last 7 days
    When I navigate to the "Leads" from advance Report
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: Verify if Most VDPs has data for Last 7 days
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Most VDPs" should have data

  Scenario: Verify if Least VDPs by channel has data for Last 7 days
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Least VDPs" should have data

  Scenario: Verify if Days on Lot has data for Last 7 days
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Last 7 Days"
    And the "Days on Lot" should have data

  Scenario: Verify if Leads has data for Last Month
    When I navigate to the "Leads" from advance Report
    Then I click "Advance Report Last Month"
    And the "Leads" should have data

  Scenario: Verify if Most VDPs has data for Last Month
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Advance Report Last Month"
    And the "Most VDPs" should have data

  Scenario: Verify if Least VDPs by channel has data for Last Month
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Advance Report Last Month"
    And the "Least VDPs" should have data

  Scenario: Verify if Days on Lot has data for Last Month
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Advance Report Last Month"
    And the "Days on Lot" should have data

  Scenario: Verify if Leads has data for Last Month
    When I navigate to the "Leads" from advance Report
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: Verify if Most VDPs has data for Last Month
    When I navigate to the "Most VDPs" from advance Report
    Then I click "All Time"
    And the "Most VDPs" should have data

  Scenario: Verify if Least VDPs by channel has data for Last Month
    When I navigate to the "Least VDPs" from advance Report
    Then I click "All Time"
    And the "Least VDPs" should have data

  Scenario: Verify if Days on Lot has data for Last Month
    When I navigate to the "Days on Lot" from advance Report
    Then I click "All Time"
    And the "Days on Lot" should have data


### Marketing Result
  Scenario: Verify if Budget ROI has data for Last 7 Days
    When I navigate to the "Budget ROI" from marketing result report
    Then I click "Budget Roi Last 7 Days"
    And the "Budget ROI" should have data

  Scenario: Verify if Budget ROI has data for Last Month
    Then I click "Budget Roi Last Month"
    And the "Budget ROI" should have data

  Scenario: Verify if Budget ROI has data for Last 90 Days
    Then I click "Budget Roi Last 90 Days"
    And the "Budget Roi" should have data

  Scenario: Verify if Vdps by Channel has data for Last 7 Days
    When I navigate to the "Vdps by Channel" from marketing result report
    Then I click "Vdps by Channel Last 7 Days"
    And the "Vdps by Channel" should have data

  Scenario: Verify if Vdps by Channel has data for Last Month
    Then I click "Vdps by Channel Last Month"
    And the "Vdps by Channel" should have data

  Scenario: Verify if Vdps by Channel has data for Last 90 Days
    Then I click "Vdps by Channel Last 90 Days"
    And the "Vdps by Channel" should have data

  Scenario: Verify if Top 10 Website has data for Last 7 Days
    When I navigate to the "Top 10 Website" from marketing result report
    Then I click "Top 10 Website Last 7 Days"
    And the "Top 10 Website" should have data

  Scenario: Verify if Top 10 Website has data for Last Month
    Then I click "Top 10 Website Last Month"
    And the "Vdps by Channel" should have data

  Scenario: Verify if Top 10 Website has data for Last 90 Days
    Then I click "Top 10 Website Last 90 Days"
    And the "Top 10 Website" should have data

  Scenario: Verify if VDP ROI has data for Last 7 Days
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And the "VDP ROI" should have data

  Scenario: Verify if VDP ROI has data for Last Month
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  Scenario: Verify if VDP ROI has data for Last 90 Days
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data
    And Close Browser
