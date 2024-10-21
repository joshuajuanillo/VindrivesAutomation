Feature: Daily Health Check for Tip Report

  @tipReport
  Scenario: C259535 Verify if Tip Report has data
    When I navigate to the "Tip Report" from merchandising report
    Then the "Tip Report" should have data

  @tipReport
  Scenario: C259536 Verify if Tip Report has data for CarGurus
    When I navigate to the "Tip Report" from merchandising report
    And I select "Cargurus" provider
    Then the "Tip Report" should have data

  @tipReport
  Scenario: C259537 Verify if Tip Report has data for Autotrader
    When I navigate to the "Tip Report" from merchandising report
    And I select "Autotrader" provider
    Then the "Tip Report" should have data

  @tipReport
  Scenario: C259538 Verify if Tip Report has data for CarsDotCom
    When I navigate to the "Tip Report" from merchandising report
    And I select "CarsDotCom" provider
    Then the "Tip Report" should have data