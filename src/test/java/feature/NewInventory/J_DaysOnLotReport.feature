Feature: Demo Client Data Health Check for Days on Lot Report

  Scenario: C188499 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Last 7 Days"
    And the "Days on Lot" should have data

  Scenario: C188500 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Days on Lot" should have data

  Scenario: C188501 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Days on Lot" should have data

  Scenario: C188490 Verify that Price is sortable and all data has value
    And I click "Last 7 Days"
    And I click twice the sort by function in Price column and data are not unknown from Leads report

  Scenario: C188491 Verify if Default percent of market is sortable and all row has data
    And I click twice the sort by function in Default percent of market column and data are not unknown from Leads Report

  Scenario: C188492 Verify that DOL is sortable and all row has data
    And I click twice the sort by function in DOL column and data are not unknown from Leads Report

  Scenario: C188493 Verify that Photos is sortable and all row has data
    And I click twice the sort by function in Photos column and data are not unknown from Leads Report

  Scenario: C188494 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C188495 Verify that VDPs is sortable and all row has data
    And I click twice the sort by function in VDPs column and data are not unknown from Leads Report

  Scenario: C188496 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C188497 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

