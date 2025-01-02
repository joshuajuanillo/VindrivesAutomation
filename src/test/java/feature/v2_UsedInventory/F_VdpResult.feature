Feature: Data Health Check for VDP Results

  @dealratingByChannel
  Scenario: C331825 Verify that all column is sortable for Last 7 days
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

  Scenario: C331826 Verify that cargurus rank from Vdp Result should have data
    Then cargurus rank from Vdp Result should have data

  Scenario: C331827 Verify that AutoTrader rank from Vdp Result should have data
    Then AutoTrader rank from Vdp Result should have data

  Scenario: C331828 Verify that CarsDotCom rank from Vdp Result should have data
    Then CarsDotCom rank from Vdp Result should have data

  Scenario: C331829 Verify that Carfax rank from Vdp Result should have data
    Then Carfax rank from Vdp Result should have data

  Scenario: C331830 Verify that Price from Vdp Result should have data
    Then Price from Vdp Result should have data

  Scenario: C331831 Verify that Last Price Change from Vdp Result should have data
    Then Last Price Change from Vdp Result should have data

  Scenario: C331832 Verify that Default Percent of Market from Vdp Result should have data
    Then Default Percent of Market from Vdp Result should have data

  Scenario: C331833 Verify that DOL from Vdp Result should have data
    Then DOL from Vdp Result should have data

  Scenario: C331834 Verify that Photos from Vdp Result should have data
    Then Photos from Vdp Result should have data

  Scenario: C331835 Verify that Carfax Pulls from Vdp Result should have data
    Then Carfax Pulls from Vdp Result should have data

  Scenario: C331836 Verify that all column is sortable for Last Month
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

  Scenario: C331837 Verify that cargurus rank from Vdp Result should have data
    Then cargurus rank from Vdp Result should have data

  Scenario: C331838 Verify that AutoTrader rank from Vdp Result should have data
    Then AutoTrader rank from Vdp Result should have data

  Scenario: C331839 Verify that CarsDotCom rank from Vdp Result should have data
    Then CarsDotCom rank from Vdp Result should have data

  Scenario: C331840 Verify that Carfax rank from Vdp Result should have data
    Then Carfax rank from Vdp Result should have data

  Scenario: C331841 Verify that Price from Vdp Result should have data
    Then Price from Vdp Result should have data

  Scenario: C331842 Verify that Last Price Change from Vdp Result should have data
    Then Last Price Change from Vdp Result should have data

  Scenario: C331843 Verify that Default Percent of Market from Vdp Result should have data
    Then Default Percent of Market from Vdp Result should have data

  Scenario: C331844 Verify that DOL from Vdp Result should have data
    Then DOL from Vdp Result should have data

  Scenario: C331845 Verify that Photos from Vdp Result should have data
    Then Photos from Vdp Result should have data

  Scenario: C331846 Verify that Carfax Pulls from Vdp Result should have data
    Then Carfax Pulls from Vdp Result should have data








