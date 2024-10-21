Feature: Daily Health Check for VDP ROI

  ## Website
  Scenario: C258554 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And the "VDP ROI" should have data

  Scenario: C258555 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  Scenario: C258556 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data

  ### Third Party
  @vdpRoi
  Scenario: C258557 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Third Parties"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C258558 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C258559 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data

 ### Combine
  @vdpRoi
  Scenario: C258560 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Combined"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C258561 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C258562 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data