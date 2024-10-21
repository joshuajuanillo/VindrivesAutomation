Feature: Daily Health Check for Leads Report

  Scenario: C258468 Verify that Sales Goal has value
    When I navigate to the "Leads" from advance Report
    Then the Sales Goal should have data

  Scenario: C258441 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C258442 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C258443 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C258444 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: Verify if provider is selected filter should show data
    And I click customize Button and select all provider

  Scenario: C96495 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Leads" should have data

  Scenario: C96483 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C96490 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C96492 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C96493 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C96495 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Leads" should have data

  Scenario: C96483 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C96490 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C96492 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C96493 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C96495 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "Leads" should have data

  Scenario: C96483 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C96484 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C96490 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C96492 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C96493 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report