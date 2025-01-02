Feature: Data Health Check for VDPs By Channel

  Scenario: C331956 Verify that Vdps By Channel Shows Data for Last 7 Days
    When I navigate to the "Vdps by Channel" from marketing result report
    Then I click "Vdps by Channel Last 7 Days"
    And All data are not zero from VDPs By Channel

  Scenario: C331957 Verify that Vdps By Channel Shows Data for Last Month
    When I navigate to the "Vdps by Channel" from marketing result report
    Then I click "Vdps by Channel Last Month"
    And All data are not zero from VDPs By Channel

