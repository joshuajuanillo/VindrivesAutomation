Feature: Demo Client Data Health Check for Tip Report

  @tipReport
  Scenario: C168427 Verify if Tip Report has data
    When I navigate to the "Tip Report" from merchandising report
    Then the "Tip Report" should have data

#### Provider : AutoTrader
  @tipReport
  Scenario: C168790 Verify if Tip Report has data for CarGurus
    When I navigate to the "Tip Report" from merchandising report
    And I select "Cargurus" provider
    And I select 100 per page in pagination Vtwo
    Then the "Tip Report" should have data

  @tipReport
  Scenario: C96242 Verify that Deal Rating is sortable and it will not show unknown data
    Then I click twice the sort by function in Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96243 Verify that Price is sortable and all data should have value
    Then I click twice the sort by function in Price column and data are not unknown

  @tipReport
  Scenario: C96244 Verify that New Deal Rating is sortable and it will not show unknown data
    Then I click twice the sort by function in New Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96245 Verify that New Price is sortable and all data should have value
    Then I click twice the sort by function in New Price column and data are not unknown

  @tipReport
  Scenario: C96246 Verify that Price change is sortable and all data should have value
    Then I click twice the sort by function in Price Change column and data are not unknown

  @tipReport
  Scenario: C96247 Verify that Age is sortable and all data should have value
    Then I click twice the sort by function in Age column and data are not unknown

##### Provider : AutoTrader
  @tipReport
  Scenario: C168791 Verify if Tip Report has data for Autotrader
    When I navigate to the "Tip Report" from merchandising report
    And I select "Autotrader" provider
    And I select 100 per page in pagination Vtwo
    Then the "Tip Report" should have data

  @tipReport
  Scenario: C96220 Verify that Deal Rating is sortable and it will not show unknown data
    Then I click twice the sort by function in Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96221 Verify that Price is sortable and all data should have value
    Then I click twice the sort by function in Price column and data are not unknown

  @tipReport
  Scenario: C96222 Verify that New Deal Rating is sortable and it will not show unknown data
    Then I click twice the sort by function in New Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96223 Verify that New Price is sortable and all data should have value
    Then I click twice the sort by function in New Price column and data are not unknown

  @tipReport
  Scenario: C96224 Verify that Price change is sortable and all data should have value
    Then I click twice the sort by function in Price Change column and data are not unknown

  @tipReport
  Scenario: C96227 Verify that Price at Great Deal Rating is sortable and all data should have value
    Then I click twice the sort by function in Price at Great Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96227 Verify that Great Deal Rating is sortable and all data should have value
    Then I click twice the sort by function in Great Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96228 Verify that Price change at Great Deal Rating is sortable and all data should have value
    Then I click twice the sort by function in Price Change at Great Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96225 Verify that Age is sortable and it will not show unknown data
    Then I click twice the sort by function in Age column and data are not unknown

##### Provider : CarsDotCom
  @tipReport
  Scenario: C168792 Verify if Tip Report has data for CarsDotCom
    When I navigate to the "Tip Report" from merchandising report
    And I select "CarsDotCom" provider
    And I select 100 per page in pagination Vtwo
    Then the "Tip Report" should have data

  @tipReport
  Scenario: C96211 Verify that Deal Rating is sortable and it will not show unknown data
    Then I click twice the sort by function in Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96212 Verify that Price is sortable and all data should have value
    Then I click twice the sort by function in Price column and data are not unknown

  @tipReport
  Scenario: C96213 Verify that New Deal Rating is sortable and it will not show unknown data
    Then I click twice the sort by function in New Deal Rating column and data are not unknown

  @tipReport
  Scenario: C96214 Verify that New Price is sortable and all data should have value
    Then I click twice the sort by function in New Price column and data are not unknown

  @tipReport
  Scenario: C96215 Verify that Price change is sortable and all data should have value
    Then I click twice the sort by function in Price Change column and data are not unknown

  @tipReport
  Scenario: C96216 Verify that Age is sortable and it will not show unknown data
    Then I click twice the sort by function in Age column and data are not unknown