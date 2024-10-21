Feature: Daily Health check for Deal Rating by Channel

  @dealratingByChannel
  Scenario: C258342 Verify that Sales Goal has value
    When I navigate to the "Deal Ratings by channel" from merchandising report
    Then the Sales Goal should have data

  @dealratingByChannel
  Scenario: C258343 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  @dealratingByChannel
  Scenario: C258344 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  @dealratingByChannel
  Scenario: C258345 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  @dealratingByChannel
  Scenario: C258346 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  @dealratingByChannel
  Scenario: C258347 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C258348 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C258349 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C258350 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C258351 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C258352 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C258353 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C258354 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C258355 Verify that Last 30 days date range filter should show data
    Then I click "Last 30 Days DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C258356 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C258357 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C258358 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C258359 Verify that Last 60 days date range filter should show data
    Then I click "Last 60 Days DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C258360 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C258361 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C258362 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @dealratingByChannel
  Scenario: C258363 Verify that Last 90 days date range filter should show data
    Then I click "Last 90 Days DealRating"
    And the "Deal Ratings by channel" should have data

  @dealratingByChannel
  Scenario: C258364 Verify if Deal Ratings by channel column for cargurus is not showing all unknown data
    And I click twice the sort by function in cargurus column and data are not unknown

  @dealratingByChannel
  Scenario: C258365 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @dealratingByChannel
  Scenario: C258366 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown