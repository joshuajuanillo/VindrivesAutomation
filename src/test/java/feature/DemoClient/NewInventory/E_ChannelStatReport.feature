Feature: Demo Client Data Health Check for Channel Stats Report

  Scenario: C103280 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Channel Stats report" from merchandising report
    Then I click "Last 7 Days" V2
    And the "Channel Stats report" should have data

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