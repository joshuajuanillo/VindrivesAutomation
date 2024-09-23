Feature: Demo Client Data Health Check for Channel Stats Report

  Scenario: C96273 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 7 Days" V2
    And the "Channel Stats report" should have data

#  Scenario: Setup provider
#    When I click customize Button and select all provider

  Scenario: C96274 Verify that Last Month date range filter should show data
    Then I click "Last Month" V2
    And the "Channel Stats report" should have data

  Scenario: C96275 Verify that Last 30 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 30 Days" V2
    And the "Channel Stats report" should have data

  Scenario: C96276 Verify that Last 60 Days date range filter should show data
    Then I click "Last 60 Days" V2
    And the "Channel Stats report" should have data

  Scenario: C96277 Verify that Last 90 Days date range filter should show data
    Then I click "Last 90 Days" V2
    And the "Channel Stats report" should have data

  ## AutoTrader
  Scenario: C96259 Verify if Price is sortable and all row has data
    Then I click "Last 7 Days" V2
    And I click twice the sort by function in Price column and data are not unknown from Channel stat report

  Scenario: C96260 Verify if Deal Rating is sortable and all row has data
    And I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report

  Scenario: C96261 Verify if SRP is sortable and all row has data
    And I click twice the sort by function in SRP column and data are not unknown from Channel stat report

  Scenario: C96262 Verify if VDP is sortable and all row has data
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report

  Scenario: C96263 Verify if SRP VDP Ratio is sortable and all row has data
    And I click twice the sort by function in SRP VDP Ratio column and data are not unknown from Channel stat report

  #### Cargurus
  Scenario: C96264 Verify if Price is sortable and all row has data
    Then I click "Last 7 Days" V2
    And I click twice the sort by function in Price column and data are not unknown from Channel stat report cargurus

  Scenario: C96265 Verify if Deal Rating is sortable and all row has data
    And I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report cargurus

  Scenario: C96266 Verify if VDP is sortable and all row has data
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report cargurus

  #### CarsDotCom
  Scenario: C96267 Verify if Price is sortable and all row has data
    Then I click "Last 7 Days" V2
    And I click twice the sort by function in Price column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C96268 Verify if Deal Rating is sortable and all row has data
    And I click twice the sort by function in Deal Rating column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C96269 Verify if SRP is sortable and all row has data
    And I click twice the sort by function in SRP column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C96270 Verify if VDP is sortable and all row has data
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C96271 Verify if SRP VDP Ratio is sortable and all row has data
    And I click twice the sort by function in SRP VDP Ratio column and data are not unknown from Channel stat report CarsDotCom

  Scenario: C96272 Verify if VDP is sortable and all data are not 0
    And I click twice the sort by function in VDP column and data are not unknown from Channel stat report website