Feature: Demo Client Data Health Check for Least VDPs Report

  Scenario: C96538 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Last 7 Days"
    And the "Least VDPs" should have data

  Scenario: C96539 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Least VDPs" should have data

  Scenario: C96540 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Least VDPs" should have data

  Scenario: C238770 Verify that Cargurus Rank is sortable and all data has value
    And I click "Last 7 Days"
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C238771 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C238772 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C96529 Verify that Price is sortable and all data has value
    And I click twice the sort by function in Price column and data are not unknown from Leads report

  Scenario: C96530 Verify if Default percent of market is sortable and all row has data
    And I click twice the sort by function in Default percent of market column and data are not unknown from Leads Report

  Scenario: C96531 Verify that DOL is sortable and all row has data
    And I click twice the sort by function in DOL column and data are not unknown from Leads Report

  Scenario: C96532 Verify that Photos is sortable and all row has data
    And I click twice the sort by function in Photos column and data are not unknown from Leads Report

  Scenario: C96533 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C96534 Verify that VDPs is sortable and all row has data
    And I click twice the sort by function in VDPs column and data are not unknown from Leads Report

  Scenario: C96535 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C96536 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report
