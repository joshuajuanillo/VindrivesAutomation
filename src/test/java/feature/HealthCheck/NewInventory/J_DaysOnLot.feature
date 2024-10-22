Feature: Daily Health Check for Most Days On Lot

  Scenario: Verify that Sales Goal has value
    When I navigate to the "Days on Lot" from advance Report
    Then the Sales Goal should have data

  Scenario: C259684 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C259685 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C259686 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C259687 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: C259688 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Days on Lot" should have data

  Scenario: C259692 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259693 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259694 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259695 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Days on Lot" should have data

  Scenario: C259699 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259700 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259701 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C259702 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "Days on Lot" should have data

  Scenario: C259706 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C259707 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C259708 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report