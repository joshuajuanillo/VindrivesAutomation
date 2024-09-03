Feature: Demo Client Data Health Check for Result Summary

  @vdpRoi
  Scenario: C96660 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Third Parties"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96661 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96662 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data

 ### Combine
  @vdpRoi
  Scenario: C96674 Verify that Last 7 Days date range filter should show data
    When I navigate to the "VDP ROI" from marketing result report
    Then I click "VDP ROI Last 7 Days"
    And I click VDP ROI "Combined"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96675 Verify that Last Month date range filter should show data
    Then I click "VDP ROI Last Month"
    And the "VDP ROI" should have data

  @vdpRoi
  Scenario: C96676 Verify that Last 90 Days date range filter should show data
    Then I click "VDP ROI Last 90 Days"
    And the "VDP ROI" should have data