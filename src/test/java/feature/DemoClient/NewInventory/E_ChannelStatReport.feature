Feature: Demo Client Data Health Check for Channel Stats Report

  Scenario: C103280 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 7 Days" V2
    And the "Channel Stats report" should have data

  Scenario: Setup provider
    When I click customize Button and select all provider

  Scenario: C103281 Verify that Last Month date range filter should show data
    Then I click "Last Month" V2
    And the "Channel Stats report" should have data

  Scenario: C103282 Verify that Last 30 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 30 Days" V2
    And the "Channel Stats report" should have data

  Scenario: C103283 Verify that Last 60 Days date range filter should show data
    Then I click "Last 60 Days" V2
    And the "Channel Stats report" should have data

  Scenario: C103284 Verify that Last 90 Days date range filter should show data
    Then I click "Last 90 Days" V2
    And the "Channel Stats report" should have data

  ## AutoTrader
  Scenario: C103306 Verify if Price is sortable and all row has data
    Then I click "Last 7 Days" V2
    And I click twice the sort by function in Price column and data are not unknown from Channel stat report

  Scenario: C103308 Verify if SRP is sortable and all row has data
    And I click twice the sort by function in SRP column and data are not unknown from Channel stat report

  Scenario: C103309 Verify if VDP is sortable and all row has data
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report

  Scenario: C103310 Verify if SRP VDP Ratio is sortable and all row has data
    And I click twice the sort by function in SRP VDP Ratio column and data are not unknown from Channel stat report

  #### Cargurus
  Scenario: C103313 Verify if Price is sortable and all row has data
    Then I click "Last 7 Days" V2
    And I click twice the sort by function in Price column and data are not unknown from Channel stat report cargurus

  Scenario: C103315 Verify if VDP is sortable and all row has data
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report cargurus

  #### CarsDotCom
  Scenario: C103316 Verify if Price is sortable and all row has data
    Then I click "Last 7 Days" V2
    And I click twice the sort by function in Price column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C103318 Verify if SRP is sortable and all row has data
    And I click twice the sort by function in SRP column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C103319 Verify if VDP is sortable and all row has data
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C103320 Verify if SRP VDP Ratio is sortable and all row has data
    And I click twice the sort by function in SRP VDP Ratio column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C103323 Verify if VDP is sortable and all data are not 0
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report website