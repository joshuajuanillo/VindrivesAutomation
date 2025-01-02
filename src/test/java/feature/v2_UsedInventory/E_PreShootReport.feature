Feature: Data Health Check for Pre Shoot Report

  @dealratingByChannel
  Scenario: C331820 Verify that all column is sortable
    When I navigate to the "Pre Shoot report" from merchandising report
    And the "Pre Shoot report" should have data
    And I click sort from Price Pre Shoot Report
    And I click sort from Dol Pre Shoot Report
    And I click sort from Images Pre Shoot Report
    And I click sort from Total Vdps Pre Shoot Report

  Scenario: C331821 Verify that Price from Pre Shoot Report should have data
    Then price from Pre Shoot Report should have data

  Scenario: C331822 Verify that Dol from Pre Shoot Report should have data
    Then dol from Pre Shoot Report should have data

  Scenario: C331823 Verify that Images from Pre Shoot Report should have data
    Then images from Pre Shoot Report should have data

  Scenario: C331824 Verify that Total Vdps from Pre Shoot Report should have data
    Then total Vdps from Pre Shoot Report should have data


