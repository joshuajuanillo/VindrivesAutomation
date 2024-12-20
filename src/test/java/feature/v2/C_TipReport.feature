Feature: Data Health Check for Tip Report

  @dealratingByChannel
  Scenario: C321578 Verify that all column is sortable
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
    And I click sort from New Price from autotrader
    And I click sort from Price Change from autotrader
    And I click sort from Great Deal Rating from autotrader
    And I click sort from Price At Great Deal Rating from autotrader
    And I click sort from Price Change At Great Deal Rating from autotrader
    And I click sort from deal rating from carsDotCom
    And I click sort from Price from carsDotCom
    And I click sort from New Deal Rating from carsDotCom
    And I click sort from New Price from carsDotCom
    And I click sort from Price Change from carsDotCom
    And I click sort from Great Deal Rating from carsDotCom
    And I click sort from Price At Great Deal Rating from carsDotCom
    And I click sort from Price Change At Great Deal Rating from carsDotCom
    And I click sort from deal rating from carfax
    And I click sort from Price from carfax
    And I click sort from New Deal Rating from carfax
    And I click sort from New Price from carfax
    And I click sort from Price Change from carfax
    And I click sort from Great Deal Rating from carfax
    And I click sort from Price At Great Deal Rating from carfax
    And I click sort from Price Change At Great Deal Rating from carfax

  Scenario: C321578 Verify that price has data from cargurus
    Then price from cargurus has data for cargurus

  Scenario: C321578 Verify that deal rating has data from cargurus
    Then deal rating from cargurus has data for cargurus

  Scenario: C321578 Verify that new deal rating has data from cargurus
    Then new deal rating from cargurus has data for cargurus

  Scenario: C321578 Verify that new price has data from cargurus
    Then new price from cargurus has data for cargurus

  Scenario: C321578 Verify that price change has data from cargurus
    Then price change from cargurus has data for cargurus

  Scenario: Verify that deal rating has data from autotrader
    Then deal rating from cargurus has data for autotrader

  Scenario: Verify that Price has data from autotrader
    Then Price from cargurus has data for autotrader

  Scenario: Verify that New Deal Rating has data from autotrader
    Then New Deal Rating from cargurus has data for autotrader

  Scenario: Verify that New Price has data from autotrader
    Then New Price from cargurus has data for autotrader

  Scenario: Verify that Price Change has data from autotrader
    Then Price Change from cargurus has data for autotrader

  Scenario: Verify that Great Deal Rating has data from autotrader
    Then Great Deal Rating from cargurus has data for autotrader

  Scenario: Verify that Price At Great Deal Rating has data from autotrader
    Then Price At Great Deal Rating from cargurus has data for autotrader

  Scenario: Verify that Price Change At Great Deal Rating has data from autotrader
    Then Price Change At Great Deal Rating from cargurus has data for autotrader

  Scenario: Verify that deal rating has data from carsDotCom
    Then deal rating from cargurus has data for carsDotCom

  Scenario: Verify that Price has data from carsDotCom
    Then Price from cargurus has data for carsDotCom

  Scenario: Verify that New Deal Rating has data from carsDotCom
    Then New Deal Rating from cargurus has data for carsDotCom

  Scenario: Verify that New Price has data from carsDotCom
    Then New Price from cargurus has data for carsDotCom

  Scenario: Verify that Price Change has data from carsDotCom
    Then Price Change from cargurus has data for carsDotCom

  Scenario: Verify that Great Deal Rating has data from carsDotCom
    Then Great Deal Rating from cargurus has data for carsDotCom

  Scenario: Verify that Price At Great Deal Rating has data from carsDotCom
    Then Price At Great Deal Rating from cargurus has data for carsDotCom

  Scenario: Verify that Price Change At Great Deal Rating has data from carsDotCom
    Then Price Change At Great Deal Rating from cargurus has data for carsDotCom

  Scenario: Verify that deal rating has data from carfax
    Then deal rating from cargurus has data for carfax

  Scenario: Verify that Price has data from carfax
    Then Price from cargurus has data for carfax

  Scenario: Verify that New Deal Rating has data from carfax
    Then New Deal Rating from cargurus has data for carfax

  Scenario: Verify that New Price has data from carfax
    Then New Price from cargurus has data for carfax

  Scenario: Verify that Price Change has data from carfax
    Then Price Change from cargurus has data for carfax

  Scenario: Verify that Great Deal Rating has data from carfax
    Then Great Deal Rating from cargurus has data for carfax

  Scenario: Verify that Price At Great Deal Rating has data from carfax
    Then Price At Great Deal Rating from cargurus has data for carfax

  Scenario: Verify that Price Change At Great Deal Rating has data from carfax
    Then Price Change At Great Deal Rating from cargurus has data for carfax








