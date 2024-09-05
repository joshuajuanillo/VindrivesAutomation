Feature: Demo Client Data Health Check for VDP Result

  Scenario: C103370 Verify that Last 7 Days date range filter should show data
    When I navigate to the VDP Result
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data

  Scenario: C103371 Verify that Last Month date range filter should show data
    Then I click "VDP Result Last Month" V2
    And the "VDP Result" should have data

  Scenario: C103374 Verify that All time data range filter will show data
    Then I click "All Time" V2
    And the "VDP Result" should have data

  Scenario: C103355 Verify that VDPs is sortable and all data has value
    And I click "Last 7 Days" V2
    And I select 100 per page in pagination Vtwo
    Then I click twice the sort by function in VDPs column and data are not unknown

  Scenario: C103356 Verify that Leads is sortable and all data has value
    Then I click twice the sort by function in Leads column and data are not unknown

  Scenario: C103357 Verify that Leads/VDPs is sortable and all data has value
    Then I click twice the sort by function in Leads VDPs column and data are not unknown in VDP Result

  Scenario: C103358 Verify that Price is sortable and all data has value
    Then I click twice the sort by function in Price column and data are not unknown in VDP Result

  Scenario: C103359 Verify that Last Price Change is sortable and all data has value
    Then I click twice the sort by function in Last Price column and data are not unknown

#  Scenario: C103360 Verify that Default % of Market is sortable and all data has value
#    Then I click twice the sort by function in Default % of Market column and data are not unknown

  Scenario: C103361 Verify that DOL is sortable and all data has value
    Then I click twice the sort by function in DOL column and data are not unknown in VDP Result

  Scenario: C103362 Verify that Photos is sortable and all data has value
    Then I click twice the sort by function in Photos Rank column and data are not unknown