Feature: Demo Client Data Health Check for Pre Shoot Report

  Scenario: C168428 Verify if Pre Shoot report has data
    When I navigate to the "Pre Shoot report" from merchandising report
    Then the "Pre Shoot report" should have data

  @preShootReport
  Scenario: C96445 Verify that Price is sortable and all data has value
    Then the "Pre Shoot report" should have data
    And I click twice the sort by function in Price column and data are not unknown from Pre Shoot Report

  @preShootReport
  Scenario: C96187 Verify if Deal Ratings by channel column for AutoTrader is not showing all unknown data
    And I click twice the sort by function in Autotrader column and data are not unknown

  @preShootReport
  Scenario: C96188 Verify if Deal Ratings by channel column for CarsDotCom is not showing all unknown data
    And I click twice the sort by function in Cars column and data are not unknown

  @preShootReport
  Scenario: C96190 Verify if DOL is sortable and should not show 0 data in all row
    And I click twice the sort by function in DOL column and data are not unknown