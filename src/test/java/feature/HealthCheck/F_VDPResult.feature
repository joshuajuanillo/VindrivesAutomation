Feature: Daily Health Check for VDP Result

  Scenario: C96273 Verify if provider is selected filter should show data
    When I navigate to the VDP Result
    And I click customize Button and select all provider in VDP Result

  Scenario: C96475 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data

  Scenario: C96457 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown

  Scenario: C96458 Verify that AutoTrader Rank is sortable and all data has value
    Then I click twice the sort by function in AutoTrader Rank column and data are not unknown

  Scenario: C96459 Verify that Cars.com Rank is sortable and all data has value
    Then I click twice the sort by function in Cars.com Rank column and data are not unknown

  Scenario: C96468 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C96461 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C96462 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C96468 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C96476 Verify that Last Month date range filter should show data
    Then I click "VDP Result Last Month"
    And the "VDP Result" should have data

  Scenario: C96457 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown

  Scenario: C96458 Verify that AutoTrader Rank is sortable and all data has value
    Then I click twice the sort by function in AutoTrader Rank column and data are not unknown

  Scenario: C96459 Verify that Cars.com Rank is sortable and all data has value
    Then I click twice the sort by function in Cars.com Rank column and data are not unknown

  Scenario: C96468 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C96461 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C96462 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C96468 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C96476 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "VDP Result" should have data

  Scenario: C96457 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown

  Scenario: C96458 Verify that AutoTrader Rank is sortable and all data has value
    Then I click twice the sort by function in AutoTrader Rank column and data are not unknown

  Scenario: C96459 Verify that Cars.com Rank is sortable and all data has value
    Then I click twice the sort by function in Cars.com Rank column and data are not unknown

  Scenario: C96468 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C96461 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C96462 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C96468 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown