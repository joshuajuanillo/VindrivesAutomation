Feature: Data Health Check for Least VDPs Report

  Scenario: C332460 Verify that all column is sortable for Last 7 days
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Last 7 Days" V2
    And the "Least VDPs" should have data
    And I click sort from Price from Least VDPs
    And I click sort from Default Percent of Market from Least VDPs
    And I click sort from DOL from Least VDPs
    And I click sort from Photos from Least VDPs
    And I click sort from Leads from Least VDPs
    And I click sort from VDPs from Least VDPs
    And I click sort from Leads and Vdps from Least VDPs

  Scenario: C332465 Verify that Price from Least VDPs should have data
    Then Price from Least VDPs should have data

  Scenario: C332466 Verify that Default Percent of Market from Least VDPs should have data
    Then Default Percent of Market from Least VDPs should have data

  Scenario: C332467 Verify that DOL from Least VDPs should have data
    Then DOL from Least VDPs should have data

  Scenario: C332468 Verify that Photos from Least VDPs should have data
    Then Photos from Least VDPs should have data

  Scenario: C332469 Verify that Leads from Least VDPs should have data
    Then Leads from Least VDPs should have data

  Scenario: C332470 Verify that Vdps from Least VDPs should have data
    Then Vdps from Least VDPs should have data

  Scenario: C332471 Verify that Leads and Vdps from Least VDPs should have data
    Then Leads and Vdps from Least VDPs should have data

  Scenario: C332475 Verify that all column is sortable for Last Month
    When I navigate to the "Least VDPs" from advance Report
    Then I click "Last Month" V2
    And the "Least VDPs" should have data
    And I click sort from Price from Least VDPs
    And I click sort from Default Percent of Market from Least VDPs
    And I click sort from DOL from Least VDPs
    And I click sort from Photos from Least VDPs
    And I click sort from Leads from Least VDPs
    And I click sort from VDPs from Least VDPs
    And I click sort from Leads and Vdps from Least VDPs

  Scenario: C332480 Verify that Price from Least VDPs should have data
    Then Price from Least VDPs should have data

  Scenario: C332481 Verify that Default Percent of Market from Least VDPs should have data
    Then Default Percent of Market from Least VDPs should have data

  Scenario: C332482 Verify that DOL from Least VDPs should have data
    Then DOL from Least VDPs should have data

  Scenario: C332483 Verify that Photos from Least VDPs should have data
    Then Photos from Least VDPs should have data

  Scenario: C332484 Verify that Leads from Least VDPs should have data
    Then Leads from Least VDPs should have data

  Scenario: C332485 Verify that Vdps from Least VDPs should have data
    Then Vdps from Least VDPs should have data

  Scenario: C332486 Verify that Least VDPs and Vdps from Least VDPs should have data
    Then Leads and Vdps from Least VDPs should have data