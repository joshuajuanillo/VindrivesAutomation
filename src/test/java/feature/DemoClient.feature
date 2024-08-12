Feature: Demo Client Data Health Check
  This feature deal with validating the data for each section if it has data for Demo Client

  @newTestCase
  Scenario: C96162 Verify that Total VDPs section should have value
    Given a user with a correct credentials
      | email    | jjuanillo@dealercmo.com |
      | password | !Pass1234               |
    When I navigate to the Result Summary Page
    And I select vehicle type "Used Inventory"
    And I select "Demo Client"
    Then the totalVDPs should have data

  Scenario: C96163 Verify if Avg VDPs has value
    Then the Avg VDPs Vehicle should have data

  Scenario: C96164 Verify if Front Line Ready has value
    Then the Front Line Ready should have data

  Scenario: C96165 Verify if Sales to FLR Ratio has value
    Then the Sales to FLR Ratio should have data

  Scenario: C96166 Verify if Sales Pace has value
    Then the Sales Pace should have data

  Scenario: C96167 Verify if Average days to sell has value
    Then the Average days to sell have data

  Scenario: C96168 Verify if Result Score is not empty
    Then the result score should show data

# Needs Attention
  Scenario: C96169 Verify that Needs attention for vehicle with red results score should have value
    Then the "Red" results score has data

  Scenario: C96170 Verify that Needs attention for vehicle with yellow results score should have value
    Then the "Yellow" results score has data

# Quick Result Table
  Scenario: C96175 Verify that tippable cargurus column from the quick results table should not show 0 data in all row
    Then the Tippable Cargurus column should have data

  Scenario: C96176 Verify that tippable AutoTrader column from the quick results table should not show 0 data in all row
    Then the Tippable Autotrader column should have data

  Scenario: C96177 Verify that tippable Cars.com column from the quick results table should not show 0 data in all row
    Then the Tippable Cars dot com column should have data

  Scenario: C97061 Verify that Zero Leads column from the quick result table show now show all data are 0
    Then the Zero Leads column should have data

## Merchandising
  @newTestCase
  Scenario: C96178 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Deal Ratings by channel" from merchandising report
    Then I click "Last 7 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: C96203 Verify that Sales Goal has value
    Then the Sales Goal should have data

  Scenario: C96204 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C96205 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C96206 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C96207 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: C96179 Verify that Last Month date range filter should show data
    Then I click "Last Month"
    And the "Deal Ratings by channel" should have data

  Scenario: C96180 Verify that Last 30 Days date range filter should show data
    Then I click "Last 30 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: C96181 Verify that Last 60 Days date range filter should show data
    Then I click "Last 60 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: C96182 Verify that Last 90 Days date range filter should show data
    Then I click "Last 90 Days"
    And the "Deal Ratings by channel" should have data

  Scenario: C96186 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    When I navigate to the "Deal Ratings by channel" from merchandising report
    And I click "Last 7 Days"
    Then the "Deal Ratings by channel" should have data
    And I select 100 per page in pagination
    Then the "Deal Ratings by channel" should have data
    And I click twice the sort by function in cargurus column and data are not unknown

  Scenario: C96187 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  Scenario: C96188 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

## Tip Report
  @newTestCase
  Scenario: C168427 Verify if Tip Report has data
    When I navigate to the "Tip Report" from merchandising report
    Then the "Tip Report" should have data

  @newTestCase
  Scenario: C168790 Verify if Tip Report has data for CarGurus
    When I navigate to the "Tip Report" from merchandising report
    And I select "Cargurus" provider
    Then the "Tip Report" should have data

  @newTestCase
  Scenario: C168791 Verify if Tip Report has data for AutoTrader
    When I navigate to the "Tip Report" from merchandising report
    And I select "Autotrader" provider
    Then the "Tip Report" should have data

  @newTestCase
  Scenario: C168792 Verify if Tip Report has data for CarsDotCom
    When I navigate to the "Tip Report" from merchandising report
    And I select "CarsDotCom" provider
    Then the "Tip Report" should have data

## Channel Stats Report
  Scenario: C96273 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 7 Days"
    And the "Channel Stats report" should have data

  Scenario: C96274 Verify that Last Month date range filter should show data
    Then I click "Last Month"
    And the "Channel Stats report" should have data

  Scenario: C96275 Verify that Last 30 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 30 Days"
    And the "Channel Stats report" should have data

  Scenario: C96276 Verify that Last 60 Days date range filter should show data
    Then I click "Last 60 Days"
    And the "Channel Stats report" should have data

  Scenario: C96277 Verify that Last 90 Days date range filter should show data
    Then I click "Last 90 Days"
    And the "Channel Stats report" should have data

  Scenario: C168428 Verify if Pre Shoot report has data
    When I navigate to the "Pre Shoot report" from merchandising report
    Then the "Pre Shoot report" should have data

 ## VDP Result
  Scenario: C96475 Verify that Last 7 Days date range filter should show data
    When I navigate to the VDP Result
    Then I click "Last 7 Days"
    And the "VDP Result" should have data

  Scenario: C96476 Verify that Last Month date range filter should show data
    When I navigate to the VDP Result
    Then I click "VDP Result Last Month"
    And the "VDP Result" should have data

  Scenario: C96479 Verify that All time data range filter will show data
    When I navigate to the VDP Result
    Then I click "All Time"
    And the "VDP Result" should have data

### Advance Report
  Scenario: C96495 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Leads" from advance Report
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: C96518 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Most VDPs" should have data

  Scenario: C96538 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Least VDPs" should have data

  Scenario: C96558 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Last 7 Days"
    And the "Days on Lot" should have data

  Scenario: C96496 Verify that Last Month date range filter should show data
    When I navigate to the "Leads" from advance Report
    Then I click "Advance Report Last Month"
    And the "Leads" should have data

  Scenario: C96519 Verify that Last Month date range filter should show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Advance Report Last Month"
    And the "Most VDPs" should have data

  Scenario: C96539 Verify that Last Month date range filter should show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Advance Report Last Month"
    And the "Least VDPs" should have data

  Scenario: C96559 Verify that Last Month date range filter should show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Advance Report Last Month"
    And the "Days on Lot" should have data

  Scenario: C96497 Verify that All time data range filter will show data
    When I navigate to the "Leads" from advance Report
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: C96520 Verify that All time data range filter will show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "All Time"
    And the "Most VDPs" should have data

  Scenario: C96540 Verify that All time data range filter will show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "All Time"
    And the "Least VDPs" should have data

  Scenario: C96560 Verify that All time data range filter will show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "All Time"
    And the "Days on Lot" should have data

### Marketing Result
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

  Scenario: C96619 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Vdps by Channel" from marketing result report
    Then I click "Vdps by Channel Last 7 Days"
    And the "Vdps by Channel" should have data

  Scenario: C96620 Verify that Last Month date range filter should show data
    Then I click "Vdps by Channel Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C96621 Verify that Last 90 Days date range filter should show data
    Then I click "Vdps by Channel Last 90 Days"
    And the "Vdps by Channel" should have data

  Scenario: C96632 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Top 10 Website" from marketing result report
    Then I click "Top 10 Website Last 7 Days"
    And the "Top 10 Website" should have data

  Scenario: C96633 Verify that Last Month date range filter should show data
    Then I click "Top 10 Website Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C96634 Verify that Last 90 Days date range filter should show data
    Then I click "Top 10 Website Last 90 Days"
    And the "Top 10 Website" should have data

## Website
  Scenario: C96646 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And the "VDP ROI" should have data

  Scenario: C96647 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  Scenario: C96648 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data


### Third Parties
  @vdpRoi
  Scenario: C96660 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Third Parties"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96661 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96662 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data

 ### Combine
  @vdpRoi
  Scenario: C96674 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Combined"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96675 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96676 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data
    And Close Browser

