Feature: Daily Health Check for Most Days On Lot

  Scenario: Verify that Sales Goal has value
    When I navigate to the "Days on Lot" from advance Report
    Then the Sales Goal should have data

  Scenario: C258519 Verify that Sales Pace has value and should match its value from the result summary page
    Then the Sales Pace should have data and should match its value from the result summary page

  Scenario: C258520 Verify that Front Line ready has value and should match its value from the result summary page
    Then the Front Line ready should have data and should match its value from the result summary page

  Scenario: C258521 Verify that Sales/FLR Ratio hase Value and should match its value from result summary page
    Then the Sales FLR Ratio should have data and should match its value from the result summary page

  Scenario: C258522 Verify that FLR to Hit Goal has value
    Then the FLR to Hit Goal

  Scenario: Verify if provider is selected filter should show data
    And I click customize Button and select all provider

  Scenario: C258523 Verify that Last 7 Days date range filter should show data
    Then I click "Last 7 Days"
    And the "Days on Lot" should have data

  Scenario: C258524 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C258525 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C258526 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C258527 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C258528 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C258529 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C258530 Verify that Last Month date range filter should show data
    Then I click "Last Month DealRating"
    And the "Days on Lot" should have data

  Scenario: C258531 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C258532 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C258533 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C258534 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C258535 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C258536 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report

  Scenario: C258537 Verify that All Time date range filter should show data
    Then I click "All Time"
    And the "Days on Lot" should have data

  Scenario: C258538 Verify that Cargurus Rank is sortable and all data has value
    Then I click twice the sort by function in Cargurus Rank column and data are not unknown from Leads report

  Scenario: C258539 Verify that AutoTrader Rank is sortable and all data has value
    And I click twice the sort by function in AutoTrader Rank column and data are not unknown from Leads report

  Scenario: C258540 Verify that CarsDotCom Rank is sortable and all data has value
    And I click twice the sort by function in CarsDotCom Rank column and data are not unknown from Leads report

  Scenario: C258541 Verify that Leads is sortable and all row has data
    And I click twice the sort by function in Leads column and data are not unknown from Leads Report

  Scenario: C258542 Verify that Leads VDP is sortable and all row has data
    And I click twice the sort by function in Leads VDP column and data are not unknown from Leads Report

  Scenario: C258543 Verify that Carfax Pulls is sortable and all row has data
    And I click twice the sort by function in Carfax Pulls column and data are not unknown from Leads Report