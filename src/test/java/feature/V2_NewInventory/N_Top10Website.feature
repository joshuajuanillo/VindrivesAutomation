Feature: Daily Health Check for Top 10 Website

  Scenario: C332553 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Top 10 Website" from marketing result report
    Then I click "Top 10 Website Last 7 Days"
    And the "Top 10 Website" should have data

  Scenario: C332554 Verify that VDPs should not Zero Data
    Then all vdp column are not zero data

  Scenario: C332555 Verify that SRPs should not Zero Data
    Then all srp column are not zero data

  Scenario: C332556 Verify that Last Month date range filter should show data
    Then I click "Top 10 Website Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C332557 Verify that VDPs should not Zero Data
    Then all vdp column are not zero data

  Scenario: C332558 Verify that SRPs should not Zero Data
    Then all srp column are not zero data

  Scenario: C332559 Verify that Last 90 Days date range filter should show data
    Then I click "Top 10 Website Last 90 Days"
    And the "Top 10 Website" should have data

  Scenario: C332560 Verify that VDPs should not Zero Data
    Then all vdp column are not zero data

  Scenario: C332561 Verify that SRPs should not Zero Data
    Then all srp column are not zero data