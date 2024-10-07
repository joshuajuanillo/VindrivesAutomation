Feature: Demo Client Data Health Check for Leads Report

  Scenario: C188406 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Leads" from advance Report
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: C188407 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Leads" should have data

  Scenario: C188408 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: C188397 Verify that Price is sortable and all data has value
    And I click "Last 7 Days"
    And I click twice the sort by function in Price column and data are not unknown from Leads report

  Scenario: C188398 Verify if Default percent of market is sortable and all row has data
    And I click twice the sort by function in Default percent of market column and data are not unknown from Leads Report

  Scenario: C188399 Verify that DOL is sortable and all row has data
    And I click twice the sort by function in DOL column and data are not unknown from Leads Report

  Scenario: C188400 Verify that Photos is sortable and all row has data
    And I click twice the sort by function in Photos column and data are not unknown from Leads Report

  Scenario: C188401 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C188402 Verify that VDPs is sortable and all row has data
    And I click twice the sort by function in VDPs column and data are not unknown from Leads Report

  Scenario: C188403 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C188404 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

