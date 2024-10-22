Feature: Daily Health Check for Leads Report

  Scenario: Verify that Sales Goal has value
    When I navigate to the "Leads" from advance Report
    Then the Sales Goal should have data

  Scenario: C259609 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C259610 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C259611 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C259612 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: C259728 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: C259617 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259618 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259619 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259620 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Leads" should have data

  Scenario: C259624 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259625 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259626 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259627 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: C259631 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259632 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259633 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report