Feature: Daily Health Check for VDP ROI

  ## Website
  Scenario: C259719 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And the "VDP ROI" should have data

  Scenario: C259720 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  Scenario: C259721 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data

  ### Third Party
  @vdpRoi
  Scenario: C259722 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Third Parties"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C259723 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C259724 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data

 ### Combine
  @vdpRoi
  Scenario: C259725 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Combined"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C259726 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C259727 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data