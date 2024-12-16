Feature: Data Health Check for DealRating By Channel

  @dealratingByChannel
  Scenario: C321578 Verify that all column is sortable for Last 7 Days
    When I navigate to the "Tip Report" from merchandising report
    And the "Tip Report" should have data
    And I click sort from price from cargurus
    And I click sort from deal rating from cargurus
    And I click sort from new deal rating from cargurus
    And I click sort from new price from cargurus
    And I click sort from price change from cargurus
    And I click sort from deal rating from autotrader
    And I click sort from Price from autotrader
    And I click sort from New Deal Rating from autotrader
#    And I click sort from New Price from autotrader
#    And I click sort from Price Change from autotrader
#    And I click sort from Great Deal Rating from autotrader
#    And I click sort from Price At Great Deal Rating from autotrader
#    And I click sort from Price Change At Great Deal Rating from autotrader






