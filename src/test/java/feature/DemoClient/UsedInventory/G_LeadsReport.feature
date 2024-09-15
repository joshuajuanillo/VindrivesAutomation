Feature: Demo Client Data Health Check for Leads Report

  Scenario: C96495 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Leads" from advance Report
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: C96496 Verify that Last Month date range filter should show data
    Then I click "Advance Report Last Month"
    And the "Leads" should have data

  Scenario: C96497 Verify that All time data range filter will show data
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: C96457 Verify that Cargurus Rank is sortable and all data has value
    And I click "Last 7 Days"
    And I select 100 per page in pagination Vtwo
    Then I click twice the sort by function in Price column and data are not unknown from Leads report