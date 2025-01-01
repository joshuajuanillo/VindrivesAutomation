Feature: Data Health Check for VDP Results

  @dealratingByChannel
  Scenario: C321578 Verify that all column is sortable for Last 7 days
    When I navigate to the VDP Result
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data
    And I select all providers available from customize button
    And I click sort from cargurus rank from Vdp Result
    And I click sort from AutoTrader rank from Vdp Result
    And I click sort from CarsDotCom rank from Vdp Result
    And I click sort from Carfax rank from Vdp Result
    And I click sort from Price from Vdp Result
    And I click sort from Last Price Change from Vdp Result
    And I click sort from Default Percent of Market from Vdp Result
    And I click sort from DOL from Vdp Result
    And I click sort from Photos from Vdp Result
    And I click sort from Carfax Pulls from Vdp Result

  Scenario: Verify that cargurus rank from Vdp Result should have data
    Then cargurus rank from Vdp Result should have data

  Scenario: Verify that AutoTrader rank from Vdp Result should have data
    Then AutoTrader rank from Vdp Result should have data

  Scenario: Verify that CarsDotCom rank from Vdp Result should have data
    Then CarsDotCom rank from Vdp Result should have data

  Scenario: Verify that Carfax rank from Vdp Result should have data
    Then Carfax rank from Vdp Result should have data

  Scenario: Verify that Price from Vdp Result should have data
    Then Price from Vdp Result should have data

  Scenario: Verify that Last Price Change from Vdp Result should have data
    Then Last Price Change from Vdp Result should have data

  Scenario: Verify that Default Percent of Market from Vdp Result should have data
    Then Default Percent of Market from Vdp Result should have data

  Scenario: Verify that DOL from Vdp Result should have data
    Then DOL from Vdp Result should have data

  Scenario: Verify that Photos from Vdp Result should have data
    Then Photos from Vdp Result should have data

  Scenario: Verify that Carfax Pulls from Vdp Result should have data
    Then Carfax Pulls from Vdp Result should have data

  Scenario: C321578 Verify that all column is sortable for Last Month
    When I navigate to the VDP Result
    Then I click "Last Month" V2
    And the "VDP Result" should have data
    And I select all providers available from customize button
    And I click sort from cargurus rank from Vdp Result
    And I click sort from AutoTrader rank from Vdp Result
    And I click sort from CarsDotCom rank from Vdp Result
    And I click sort from Carfax rank from Vdp Result
    And I click sort from Price from Vdp Result
    And I click sort from Last Price Change from Vdp Result
    And I click sort from Default Percent of Market from Vdp Result
    And I click sort from DOL from Vdp Result
    And I click sort from Photos from Vdp Result
    And I click sort from Carfax Pulls from Vdp Result

  Scenario: Verify that cargurus rank from Vdp Result should have data
    Then cargurus rank from Vdp Result should have data

  Scenario: Verify that AutoTrader rank from Vdp Result should have data
    Then AutoTrader rank from Vdp Result should have data

  Scenario: Verify that CarsDotCom rank from Vdp Result should have data
    Then CarsDotCom rank from Vdp Result should have data

  Scenario: Verify that Carfax rank from Vdp Result should have data
    Then Carfax rank from Vdp Result should have data

  Scenario: Verify that Price from Vdp Result should have data
    Then Price from Vdp Result should have data

  Scenario: Verify that Last Price Change from Vdp Result should have data
    Then Last Price Change from Vdp Result should have data

  Scenario: Verify that Default Percent of Market from Vdp Result should have data
    Then Default Percent of Market from Vdp Result should have data

  Scenario: Verify that DOL from Vdp Result should have data
    Then DOL from Vdp Result should have data

  Scenario: Verify that Photos from Vdp Result should have data
    Then Photos from Vdp Result should have data

  Scenario: Verify that Carfax Pulls from Vdp Result should have data
    Then Carfax Pulls from Vdp Result should have data








