Feature: Data Health Check for Channel Stat Report

  @dealratingByChannel
  Scenario: C332301 Verify that all column is sortable for Last 7 days
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

  Scenario: C332302 Verify that Price from autotrader ChannelStat
    Then price from autotrader ChannelStat should have data

  Scenario: C332303 Verify that deal rating from autotrader ChannelStat
    Then deal rating from autotrader ChannelStat should have data

  Scenario: C332304 Verify that srp from autotrader ChannelStat
    Then srp from autotrader ChannelStat should have data

  Scenario: C332305 Verify that vdp from autotrader ChannelStat
    Then vdp from autotrader ChannelStat should have data

  Scenario: C332306 Verify that srp and vdp from autotrader ChannelStat
    Then srp and vdp from autotrader ChannelStat should have data

  Scenario: C332307 Verify that Price from cargurus ChannelStat
    Then price from cargurus ChannelStat should have data

  Scenario: C332308 Verify that deal rating from cargurus ChannelStat
    Then deal rating from cargurus ChannelStat should have data

  Scenario: C332309 Verify that vdp from cargurus ChannelStat
    Then vdp from cargurus ChannelStat should have data

  Scenario: C332310 Verify that Price from carsdotcom ChannelStat
    Then price from carsdotcom ChannelStat should have data

  Scenario: C332311 Verify that deal rating from carsdotcom ChannelStat
    Then deal rating from carsdotcom ChannelStat should have data

  Scenario: C332312 Verify that srp from carsdotcom ChannelStat
    Then srp from carsdotcom ChannelStat should have data

  Scenario: C332313 Verify that vdp from carsdotcom ChannelStat
    Then vdp from carsdotcom ChannelStat should have data

  Scenario: C332314 Verify that srp and vdp from carsdotcom ChannelStat
    Then srp and vdp from carsdotcom ChannelStat should have data

  Scenario: C332315 Verify that Price from carfax ChannelStat
    Then price from carfax ChannelStat should have data

  Scenario: C332316 Verify that deal rating from carfax ChannelStat
    Then deal rating from carfax ChannelStat should have data

  Scenario: C332317 Verify that vdp from carfax ChannelStat
    Then vdp from carfax ChannelStat should have data

  Scenario: C332318 Verify that vdp from Website ChannelStat
    Then vdp from website ChannelStat should have data

  Scenario: C332332 Verify that all column is sortable for Last Month
    When I navigate to the "Channel Stats report" from merchandising report
    And I click "Last Month"
    And the "Channel Stats report" should have data
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

  Scenario: C332333 Verify that Price from autotrader ChannelStat
    Then price from autotrader ChannelStat should have data

  Scenario: C332334 Verify that deal rating from autotrader ChannelStat
    Then deal rating from autotrader ChannelStat should have data

  Scenario: C332335 Verify that srp from autotrader ChannelStat
    Then srp from autotrader ChannelStat should have data

  Scenario: C332336 Verify that vdp from autotrader ChannelStat
    Then vdp from autotrader ChannelStat should have data

  Scenario: C332337 Verify that srp and vdp from autotrader ChannelStat
    Then srp and vdp from autotrader ChannelStat should have data

  Scenario: C332338 Verify that Price from cargurus ChannelStat
    Then price from cargurus ChannelStat should have data

  Scenario: C332339 Verify that deal rating from cargurus ChannelStat
    Then deal rating from cargurus ChannelStat should have data

  Scenario: C332340 Verify that vdp from cargurus ChannelStat
    Then vdp from cargurus ChannelStat should have data

  Scenario: C332341 Verify that Price from carsdotcom ChannelStat
    Then price from carsdotcom ChannelStat should have data

  Scenario: C332342 Verify that deal rating from carsdotcom ChannelStat
    Then deal rating from carsdotcom ChannelStat should have data

  Scenario: C332343 Verify that srp from carsdotcom ChannelStat
    Then srp from carsdotcom ChannelStat should have data

  Scenario: C332344 Verify that vdp from carsdotcom ChannelStat
    Then vdp from carsdotcom ChannelStat should have data

  Scenario: C332345 Verify that srp and vdp from carsdotcom ChannelStat
    Then srp and vdp from carsdotcom ChannelStat should have data

  Scenario: C332346 Verify that Price from carfax ChannelStat
    Then price from carfax ChannelStat should have data

  Scenario: C332347 Verify that deal rating from carfax ChannelStat
    Then deal rating from carfax ChannelStat should have data

  Scenario: C332348 Verify that vdp from carfax ChannelStat
    Then vdp from carfax ChannelStat should have data

  Scenario: C332349 Verify that vdp from Website ChannelStat
    Then vdp from website ChannelStat should have data
