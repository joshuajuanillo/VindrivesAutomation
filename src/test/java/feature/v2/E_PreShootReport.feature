Feature: Data Health Check for Pre Shoot Report

  @dealratingByChannel
  Scenario: C321578 Verify that all column is sortable
    When I navigate to the "Pre Shoot report" from merchandising report
    And the "Pre Shoot report" should have data
    And I click sort from Price Pre Shoot Report
    And I click sort from Dol Pre Shoot Report
    And I click sort from Images Pre Shoot Report
    And I click sort from Total Vdps Pre Shoot Report

  Scenario: Verify that Price from Pre Shoot Report should have data
    Then price from Pre Shoot Report should have data

  Scenario: Verify that Dol from Pre Shoot Report should have data
    Then dol from Pre Shoot Report should have data

  Scenario: Verify that Images from Pre Shoot Report should have data
    Then images from Pre Shoot Report should have data

  Scenario: Verify that Total Vdps from Pre Shoot Report should have data
    Then total Vdps from Pre Shoot Report should have data


