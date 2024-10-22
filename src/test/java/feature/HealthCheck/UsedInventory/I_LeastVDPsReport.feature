Feature: Daily Health Check for Least VDPs Report

  Scenario: Verify that Sales Goal has value
    When I navigate to the "Least VDPs" from advance Report
    Then the Sales Goal should have data

  Scenario: C258494 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C258495 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C258496 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C258497 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: Verify if provider is selected filter should show data
    And I click customize Button and select all provider

  Scenario: C258498 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Least VDPs" should have data

  Scenario: C258499 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C258500 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C258501 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C258502 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C258503 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C258504 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C258505 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Least VDPs" should have data

  Scenario: C258506 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C258507 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C258508 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C258509 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C258510 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C258511 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C258512 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "Least VDPs" should have data

  Scenario: C258513 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C258514 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C258515 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C258516 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C258517 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C258518 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report