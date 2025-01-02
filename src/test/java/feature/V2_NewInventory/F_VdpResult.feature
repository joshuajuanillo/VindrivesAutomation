Feature: Data Health Check for VDP Results

  @dealratingByChannel
  Scenario: C332370 Verify that all column is sortable for Last 7 days
    When I navigate to the VDP Result
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data
    And I click sort from Price from Vdp Result
    And I click sort from Last Price Change from Vdp Result
    And I click sort from Default Percent of Market from Vdp Result
    And I click sort from DOL from Vdp Result
    And I click sort from Photos from Vdp Result

  Scenario: C332375 Verify that Price from Vdp Result should have data
    Then Price from Vdp Result should have data

  Scenario: C332376 Verify that Last Price Change from Vdp Result should have data
    Then Last Price Change from Vdp Result should have data

  Scenario: C332377 Verify that Default Percent of Market from Vdp Result should have data
    Then Default Percent of Market from Vdp Result should have data

  Scenario: C332378 Verify that DOL from Vdp Result should have data
    Then DOL from Vdp Result should have data

  Scenario: C332379 Verify that Photos from Vdp Result should have data
    Then Photos from Vdp Result should have data

  Scenario: C332385 Verify that all column is sortable for Last Month
    When I navigate to the VDP Result
    Then I click "Last Month" V2
    And the "VDP Result" should have data
    And I click sort from Price from Vdp Result
    And I click sort from Last Price Change from Vdp Result
    And I click sort from Default Percent of Market from Vdp Result
    And I click sort from DOL from Vdp Result
    And I click sort from Photos from Vdp Result

  Scenario: C332390 Verify that Price from Vdp Result should have data
    Then Price from Vdp Result should have data

  Scenario: C332391 Verify that Last Price Change from Vdp Result should have data
    Then Last Price Change from Vdp Result should have data

  Scenario: C332392 Verify that Default Percent of Market from Vdp Result should have data
    Then Default Percent of Market from Vdp Result should have data

  Scenario: C332393 Verify that DOL from Vdp Result should have data
    Then DOL from Vdp Result should have data

  Scenario: C332394 Verify that Photos from Vdp Result should have data
    Then Photos from Vdp Result should have data








