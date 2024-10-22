Feature: Daily Health Check for Most Most VDPs Report

  Scenario: Verify that Sales Goal has value
    When I navigate to the "Most VDPs" from advance Report
    Then the Sales Goal should have data

  Scenario: C259634 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C259635 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C259636 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C259637 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: C259638 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Most VDPs" should have data

  Scenario: C259642 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259643 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259644 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259645 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Most VDPs" should have data

  Scenario: C259649 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259650 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259651 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259652 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "Most VDPs" should have data

  Scenario: C259656 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259657 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259658 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report