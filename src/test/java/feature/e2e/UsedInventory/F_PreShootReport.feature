Feature: Demo Client Data Health Check for Pre Shoot Report

  Scenario: C168428 Verify if Pre Shoot report has data
    When I navigate to the "Pre Shoot report" from merchandising report
    Then the "Pre Shoot report" should have data

  @preShootReport
  Scenario: C96445 Verify that Price is sortable and all data has value
    Then the "Pre Shoot report" should have data
    And I click twice the sort by function in Price column and data are not unknown from Pre Shoot Report

  Scenario: C96446 Verify that DOL is sortable and all data has value
    Then the "Pre Shoot report" should have data
    And I click twice the sort by function in DOL column and data are not unknown from Pre Shoot Report

  Scenario: C96447 Verify that Images is sortable and all data has value
    Then the "Pre Shoot report" should have data
    And I click twice the sort by function in Images column and data are not unknown from Pre Shoot Report

  Scenario: C96448 Verify that Total VDPs is sortable and all data has value
    Then the "Pre Shoot report" should have data
    And I click twice the sort by function in Total VDPs column and data are not unknown from Pre Shoot Report
