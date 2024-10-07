Feature: Demo Client Data Health Check for Most VDPs Report

  Scenario: C96518 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Most VDPs" should have data

  Scenario: C96519 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Most VDPs" should have data

  Scenario: C96520 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Most VDPs" should have data

  Scenario: C96506 Verify that Cargurus Rank is sortable and all data has value
    And I click "Last 7 Days"
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C96507 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C96508 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C96509 Verify that Price is sortable and all data has value
    And I click twice the sort by function in Price column and data are not unknown from Leads report

  Scenario: C96510 Verify if Default percent of market is sortable and all row has data
    And I click twice the sort by function in Default percent of market column and data are not unknown from Leads Report

  Scenario: C96511 Verify that DOL is sortable and all row has data
    And I click twice the sort by function in DOL column and data are not unknown from Leads Report

  Scenario: C96512 Verify that Photos is sortable and all row has data
    And I click twice the sort by function in Photos column and data are not unknown from Leads Report

  Scenario: C96513 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C96514 Verify that VDPs is sortable and all row has data
    And I click twice the sort by function in VDPs column and data are not unknown from Leads Report

  Scenario: C96515 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C96516 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report
