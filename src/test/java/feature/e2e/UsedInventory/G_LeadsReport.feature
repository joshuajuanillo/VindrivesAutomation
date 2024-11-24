Feature: Demo Client Data Health Check for Leads Report

  Scenario: C96570 Verify that Sales Goal has value
    When I navigate to the "Leads" from advance Report
    Then the Sales Goal should have data

  Scenario: C96571 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C96572 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C96573 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C96574 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: C96495 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: Setup provider
    When I click customize Button and select all provider

  Scenario: C96496 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Leads" should have data

  Scenario: C96497 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: C96483 Verify that Cargurus Rank is sortable and all data has value
    And I click "Last 7 Days"
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C96486 Verify that Price is sortable and all data has value
    And I click twice the sort by function in Price column and data are not unknown from Leads report

  Scenario: C96487 Verify if Default percent of market is sortable and all row has data
    And I click twice the sort by function in Default percent of market column and data are not unknown from Leads Report

  Scenario: C96488 Verify that DOL is sortable and all row has data
    And I click twice the sort by function in DOL column and data are not unknown from Leads Report

  Scenario: C96489 Verify that Photos is sortable and all row has data
    And I click twice the sort by function in Photos column and data are not unknown from Leads Report

  Scenario: C96490 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C96491 Verify that VDPs is sortable and all row has data
    And I click twice the sort by function in VDPs column and data are not unknown from Leads Report

  Scenario: C96492 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C96493 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report