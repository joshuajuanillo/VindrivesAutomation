Feature: Daily Health Check for Least VDPs Report

  Scenario: Verify that Sales Goal has value
    When I navigate to the "Least VDPs" from advance Report
    Then the Sales Goal should have data

  Scenario: C259659 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C259660 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C259661 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C259662 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: C259663 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Least VDPs" should have data

  Scenario: C259667 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259668 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259669 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259670 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Least VDPs" should have data

  Scenario: C259674 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259675 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259676 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259677 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "Least VDPs" should have data

  Scenario: C259681 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259682 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259683 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report