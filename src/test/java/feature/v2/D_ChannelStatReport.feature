Feature: Data Health Check for Channel Stat Report

  @dealratingByChannel
  Scenario: C321578 Verify that all column is sortable
    When I navigate to the "Channel Stats report" from merchandising report
    And I click "Last 7 Days"
    And the "Channel Stats report" should have data
    And I select all providers available from customize button
    And I click sort from Price from autotrader ChannelStat
    And I click sort from deal rating from autotrader ChannelStat
    And I click sort from srp from autotrader ChannelStat
    And I click sort from vdp from autotrader ChannelStat
    And I click sort from srp and vdp from autotrader ChannelStat
    And I click sort from Price from cargurus ChannelStat
    And I click sort from deal rating from cargurus ChannelStat
    And I click sort from vdp from cargurus ChannelStat
    And I click sort from Price from carsdotcom ChannelStat
    And I click sort from deal rating from carsdotcom ChannelStat
    And I click sort from srp from carsdotcom ChannelStat
    And I click sort from vdp from carsdotcom ChannelStat
    And I click sort from srp and vdp from carsdotcom ChannelStat
    And I click sort from Price from carfax ChannelStat
    And I click sort from deal rating from carfax ChannelStat
    And I click sort from vdp from carfax ChannelStat
    And I click sort from vdp from website ChannelStat

  Scenario: Verify that Price from autotrader ChannelStat
    Then price from autotrader ChannelStat should have data

  Scenario: Verify that deal rating from autotrader ChannelStat
    Then deal rating from autotrader ChannelStat should have data

  Scenario: Verify that srp from autotrader ChannelStat
    Then srp from autotrader ChannelStat should have data

  Scenario: Verify that vdp from autotrader ChannelStat
    Then vdp from autotrader ChannelStat should have data

  Scenario: Verify that srp and vdp from autotrader ChannelStat
    Then srp and vdp from autotrader ChannelStat should have data

  Scenario: Verify that Price from cargurus ChannelStat
    Then price from cargurus ChannelStat should have data

  Scenario: Verify that deal rating from cargurus ChannelStat
    Then deal rating from cargurus ChannelStat should have data

  Scenario: Verify that vdp from cargurus ChannelStat
    Then vdp from cargurus ChannelStat should have data

  Scenario: Verify that Price from carsdotcom ChannelStat
    Then price from carsdotcom ChannelStat should have data

  Scenario: Verify that deal rating from carsdotcom ChannelStat
    Then deal rating from carsdotcom ChannelStat should have data

  Scenario: Verify that srp from carsdotcom ChannelStat
    Then srp from carsdotcom ChannelStat should have data

  Scenario: Verify that vdp from carsdotcom ChannelStat
    Then vdp from carsdotcom ChannelStat should have data

  Scenario: Verify that srp and vdp from carsdotcom ChannelStat
    Then srp and vdp from carsdotcom ChannelStat should have data

  Scenario: Verify that Price from carfax ChannelStat
    Then price from carfax ChannelStat should have data

  Scenario: Verify that deal rating from carfax ChannelStat
    Then deal rating from carfax ChannelStat should have data

  Scenario: Verify that vdp from carfax ChannelStat
    Then vdp from carfax ChannelStat should have data

  Scenario: Verify that vdp from Website ChannelStat
    Then vdp from website ChannelStat should have data
