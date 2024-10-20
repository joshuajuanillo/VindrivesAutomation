Feature: Daily Health Check for Top 10 Website

  Scenario: C96632 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Top 10 Website" from marketing result report
    Then I click "Top 10 Website Last 7 Days"
    And the "Top 10 Website" should have data

  Scenario: C96632 Verify that VDPs should not Zero Data
    Then all vdp column are not zero data

  Scenario: C96632 Verify that SRPs should not Zero Data
    Then all srp column are not zero data

  Scenario: C96633 Verify that Last Month date range filter should show data
    Then I click "Top 10 Website Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C96632 Verify that VDPs should not Zero Data
    Then all vdp column are not zero data

  Scenario: C96632 Verify that SRPs should not Zero Data
    Then all srp column are not zero data

  Scenario: C96634 Verify that Last 90 Days date range filter should show data
    Then I click "Top 10 Website Last 90 Days"
    And the "Top 10 Website" should have data

  Scenario: C96632 Verify that VDPs should not Zero Data
    Then all vdp column are not zero data

  Scenario: C96632 Verify that SRPs should not Zero Data
    Then all srp column are not zero data