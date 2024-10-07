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

  Scenario: C96546 Verify that Cargurus Rank is sortable and all data has value
    And I click "Last 7 Days"
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C96547 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C96548 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C96549 Verify that Price is sortable and all data has value
    And I click twice the sort by function in Price column and data are not unknown from Leads report

  Scenario: C96550 Verify if Default percent of market is sortable and all row has data
    And I click twice the sort by function in Default percent of market column and data are not unknown from Leads Report

  Scenario: C96551 Verify that DOL is sortable and all row has data
    And I click twice the sort by function in DOL column and data are not unknown from Leads Report

  Scenario: C96552 Verify that Photos is sortable and all row has data
    And I click twice the sort by function in Photos column and data are not unknown from Leads Report

  Scenario: C96553 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C96554 Verify that VDPs is sortable and all row has data
    And I click twice the sort by function in VDPs column and data are not unknown from Leads Report

  Scenario: C96555 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C96556 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report
