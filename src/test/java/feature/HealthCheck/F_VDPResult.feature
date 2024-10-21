Feature: Daily Health Check for VDP Result

  Scenario:  Verify if provider is selected filter should show data
    When I navigate to the VDP Result
    And I click customize Button and select all provider in VDP Result

  Scenario: C258417 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data

  Scenario: C258418 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown

  Scenario: C258419 Verify that AutoTrader Rank is sortable and all data has value
    Then I click twice the sort by function in AutoTrader Rank column and data are not unknown

  Scenario: C258420 Verify that Cars.com Rank is sortable and all data has value
    Then I click twice the sort by function in Cars.com Rank column and data are not unknown

  Scenario: C258421 Verify that Carfax Pulls rank is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C258422 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C258423 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C258424 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C258425 Verify that Last Month date range filter should show data
    Then I click "VDP Result Last Month"
    And the "VDP Result" should have data

  Scenario: C258426 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown

  Scenario: C258427 Verify that AutoTrader Rank is sortable and all data has value
    Then I click twice the sort by function in AutoTrader Rank column and data are not unknown

  Scenario: C258428 Verify that Cars.com Rank is sortable and all data has value
    Then I click twice the sort by function in Cars.com Rank column and data are not unknown

  Scenario: C258429 Verify that Carfax Pulls rank is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C258430 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C258431 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C258432 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C258433 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "VDP Result" should have data

  Scenario: C258434 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown

  Scenario: C258435 Verify that AutoTrader Rank is sortable and all data has value
    Then I click twice the sort by function in AutoTrader Rank column and data are not unknown

  Scenario: C258436 Verify that Cars.com Rank is sortable and all data has value
    Then I click twice the sort by function in Cars.com Rank column and data are not unknown

  Scenario: C258437 Verify that Carfax Pulls rank is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C258438 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C258439 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C258440 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown