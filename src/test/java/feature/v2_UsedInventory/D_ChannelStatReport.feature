Feature: Data Health Check for Channel Stat Report

  @dealratingByChannel
  Scenario: C331784 Verify that all column is sortable for Last 7 days
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

  Scenario: C331785 Verify that Price from autotrader ChannelStat
    Then price from autotrader ChannelStat should have data

  Scenario: C331786 Verify that deal rating from autotrader ChannelStat
    Then deal rating from autotrader ChannelStat should have data

  Scenario: C331787 Verify that srp from autotrader ChannelStat
    Then srp from autotrader ChannelStat should have data

  Scenario: C331788 Verify that vdp from autotrader ChannelStat
    Then vdp from autotrader ChannelStat should have data

  Scenario: C331789 Verify that srp and vdp from autotrader ChannelStat
    Then srp and vdp from autotrader ChannelStat should have data

  Scenario: C331790 Verify that Price from cargurus ChannelStat
    Then price from cargurus ChannelStat should have data

  Scenario: C331791 Verify that deal rating from cargurus ChannelStat
    Then deal rating from cargurus ChannelStat should have data

  Scenario: C331792 Verify that vdp from cargurus ChannelStat
    Then vdp from cargurus ChannelStat should have data

  Scenario: C331793 Verify that Price from carsdotcom ChannelStat
    Then price from carsdotcom ChannelStat should have data

  Scenario: C331794 Verify that deal rating from carsdotcom ChannelStat
    Then deal rating from carsdotcom ChannelStat should have data

  Scenario: C331795 Verify that srp from carsdotcom ChannelStat
    Then srp from carsdotcom ChannelStat should have data

  Scenario: C331796 Verify that vdp from carsdotcom ChannelStat
    Then vdp from carsdotcom ChannelStat should have data

  Scenario: C331797 Verify that srp and vdp from carsdotcom ChannelStat
    Then srp and vdp from carsdotcom ChannelStat should have data

  Scenario: C331798 Verify that Price from carfax ChannelStat
    Then price from carfax ChannelStat should have data

  Scenario: C331799 Verify that deal rating from carfax ChannelStat
    Then deal rating from carfax ChannelStat should have data

  Scenario: C331800 Verify that vdp from carfax ChannelStat
    Then vdp from carfax ChannelStat should have data

  Scenario: C331801 Verify that vdp from Website ChannelStat
    Then vdp from website ChannelStat should have data

  Scenario: C331802 Verify that all column is sortable for Last Month
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

  Scenario: C331803 Verify that Price from autotrader ChannelStat
    Then price from autotrader ChannelStat should have data

  Scenario: C331804 Verify that deal rating from autotrader ChannelStat
    Then deal rating from autotrader ChannelStat should have data

  Scenario: C331805 Verify that srp from autotrader ChannelStat
    Then srp from autotrader ChannelStat should have data

  Scenario: C331806 Verify that vdp from autotrader ChannelStat
    Then vdp from autotrader ChannelStat should have data

  Scenario: C331807 Verify that srp and vdp from autotrader ChannelStat
    Then srp and vdp from autotrader ChannelStat should have data

  Scenario: C331808 Verify that Price from cargurus ChannelStat
    Then price from cargurus ChannelStat should have data

  Scenario: C331809 Verify that deal rating from cargurus ChannelStat
    Then deal rating from cargurus ChannelStat should have data

  Scenario: C331810 Verify that vdp from cargurus ChannelStat
    Then vdp from cargurus ChannelStat should have data

  Scenario: C331811 Verify that Price from carsdotcom ChannelStat
    Then price from carsdotcom ChannelStat should have data

  Scenario: C331812 Verify that deal rating from carsdotcom ChannelStat
    Then deal rating from carsdotcom ChannelStat should have data

  Scenario: C331813 Verify that srp from carsdotcom ChannelStat
    Then srp from carsdotcom ChannelStat should have data

  Scenario: C331814 Verify that vdp from carsdotcom ChannelStat
    Then vdp from carsdotcom ChannelStat should have data

  Scenario: C331815 Verify that srp and vdp from carsdotcom ChannelStat
    Then srp and vdp from carsdotcom ChannelStat should have data

  Scenario: C331816 Verify that Price from carfax ChannelStat
    Then price from carfax ChannelStat should have data

  Scenario: C331817 Verify that deal rating from carfax ChannelStat
    Then deal rating from carfax ChannelStat should have data

  Scenario: C331818 Verify that vdp from carfax ChannelStat
    Then vdp from carfax ChannelStat should have data

  Scenario: C331819 Verify that vdp from Website ChannelStat
    Then vdp from website ChannelStat should have data
