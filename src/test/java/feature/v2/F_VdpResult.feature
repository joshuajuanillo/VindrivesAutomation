Feature: Data Health Check for VDP Results

  @dealratingByChannel
  Scenario: C321578 Verify that all column is sortable
    When I navigate to the VDP Result
    Then I click "Last 7 Days" V2
    And the "VDP Result" should have data
    And I select all providers available from customize button
    And I click sort from cargurus rank from Vdp Result
#    And I click sort from AutoTrader rank from Vdp Result
#    And I click sort from CarsDotCom rank from Vdp Result
#    And I click sort from Carfax rank from Vdp Result
#    And I click sort from Price from Vdp Result
#    And I click sort from Last Price Change from Vdp Result
#    And I click sort from Default Percent of Market from Vdp Result
#    And I click sort from DOL from Vdp Result
#    And I click sort from Photos from Vdp Result
#    And I click sort from Carfax Pulls from Vdp Result







