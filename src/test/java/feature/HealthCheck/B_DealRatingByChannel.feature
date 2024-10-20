Feature: Daily Health check for Deal Rating by Channel

  @dealratingByChannel
  Scenario: C96203 Verify that Sales Goal has value
    When I navigate to the "Deal Ratings by channel" from merchandising report
    Then the Sales Goal should have data

  @dealratingByChannel
  Scenario: C96204 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  @dealratingByChannel
  Scenario: C96205 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  @dealratingByChannel
  Scenario: C96206 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  @dealratingByChannel
  Scenario: C96207 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  @dealratingByChannel
  Scenario: C96178 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C231577 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C231578 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C231579 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C96178 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C231577 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C231578 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C231579 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C96178 Verify that Last 30 days date range filter should show data
    Then I click "Last 30 Days DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C231577 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C231578 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C231579 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C96178 Verify that Last 60 days date range filter should show data
    Then I click "Last 60 Days DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C231577 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C231578 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C231579 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C96178 Verify that Last 90 days date range filter should show data
    Then I click "Last 90 Days DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C231577 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C231578 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C231579 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown