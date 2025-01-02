Feature: Data Health Check for DealRating By Channel

  @dealratingByChannel
  Scenario: C321578 Verify that all column is sortable for Last 7 Days
    When I navigate to the "Deal Ratings by channel" from merchandising report
    And I click "Last 7 Days"
    And the "Deal Ratings by channel" should have data
    And I select all providers available from customize button
    And I click sort from cargurus
    And I click sort from AutoTrader
    And I click sort from Carscom
    And I click sort from Carfax
    And I click sort from Price
    And I click sort from DOL
    And I click sort from No of Photos

  Scenario: C321579 Verify that CarGurus are not showing Unknown Data
    Then CarGurus are not showing Unknown Data

  Scenario: C321580 Verify that AutoTrader are not showing Unknown Data
    Then AutoTrader are not showing Unknown Data

  Scenario: C321581 Verify that Carscom are not showing Unknown Data
    Then Carscom are not showing Unknown Data

  Scenario: C321582 Verify that Carfax are not showing Unknown Data
    Then Carfax are not showing Unknown Data

  Scenario: C321583 Verify that Price are not showing Empty Data
    Then Price are not showing Empty Data

  Scenario: C321584 Verify that DOL are not showing 0 Data
    Then DOL are not showing Empty Data

  Scenario: C321585 Verify that No of Photos are not showing 0 Data
    Then No of Photos are not showing Empty Data

  Scenario: C321586 Verify that all column is sortable for Last Month
    And I click "Last Month DealRating"
    And the "Deal Ratings by channel" should have data
    And I click sort from cargurus
    And I click sort from AutoTrader
    And I click sort from Carscom
    And I click sort from Carfax
    And I click sort from Price
    And I click sort from DOL
    And I click sort from No of Photos

  Scenario: C321587 Verify that CarGurus are not showing Unknown Data
    Then CarGurus are not showing Unknown Data

  Scenario: C321588 Verify that AutoTrader are not showing Unknown Data
    Then AutoTrader are not showing Unknown Data

  Scenario: C321589 Verify that Carscom are not showing Unknown Data
    Then Carscom are not showing Unknown Data

  Scenario: C321590 Verify that Carfax are not showing Unknown Data
    Then Carfax are not showing Unknown Data

  Scenario: C321591 Verify that Price are not showing Empty Data
    Then Price are not showing Empty Data

  Scenario: C321592 Verify that DOL are not showing 0 Data
    Then DOL are not showing Empty Data

  Scenario: C321593 Verify that No of Photos are not showing 0 Data
    Then No of Photos are not showing Empty Data


