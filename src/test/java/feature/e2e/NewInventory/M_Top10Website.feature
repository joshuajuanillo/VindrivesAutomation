Feature: Demo Client Data Health Check for Top 10 Website

  Scenario: C103582 Verify that Last 7 Days date range filter should show data
    When I navigate to the "Top 10 Website" from marketing result report
    Then I click "Top 10 Website Last 7 Days"
    And the "Top 10 Website" should have data

  Scenario: C103583 Verify that Last Month date range filter should show data
    Then I click "Top 10 Website Last Month"
    And the "Vdps by Channel" should have data

  Scenario: C103584 Verify that Last 90 Days date range filter should show data
    Then I click "Top 10 Website Last 90 Days"
    And the "Top 10 Website" should have data
