Feature: Demo Client Data Health Check for VDPs By Channel

  Scenario: C96619 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Vdps by Channel" from marketing result report
    Then I click "Vdps by Channel Last 7 Days"
    And the "Vdps by Channel" should have data

  Scenario: C96620 Verify that Last Month date range filter should show data
    Then I click "Vdps by Channel Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C96621 Verify that Last 90 Days date range filter should show data
    Then I click "Vdps by Channel Last 90 Days"
    And the "Vdps by Channel" should have data
