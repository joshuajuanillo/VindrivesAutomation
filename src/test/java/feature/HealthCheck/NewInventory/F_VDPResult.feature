Feature: Daily Health Check for VDP Result

  Scenario:  Verify if provider is selected filter should show data
    When I navigate to the VDP Result
    And I click customize Button and select all provider in VDP Result

  Scenario: C259585 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data

  Scenario: C259590 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C259591 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C259592 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C259593 Verify that Last Month date range filter should show data
    Then I click "VDP Result Last Month"
    And the "VDP Result" should have data

  Scenario: C259598 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C259599 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C259600 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown

  Scenario: C259601 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "VDP Result" should have data

  Scenario: C259606 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C259607 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C259608 Verify that Carfax Pulls is sortable and all data has value
    Then I click twice the sort by function in Carfax Pulls column and data are not unknown