Feature: Data Health Check for Most Vdps Report

  Scenario: C332430 Verify that all column is sortable for Last 7 days
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last 7 Days" V2
    And the "Most VDPs" should have data
    And I click sort from Price from Most VDPs
    And I click sort from Default Percent of Market from Most VDPs
    And I click sort from DOL from Most VDPs
    And I click sort from Photos from Most VDPs
    And I click sort from Leads from Most VDPs
    And I click sort from VDPs from Most VDPs
    And I click sort from Leads and Vdps from Most VDPs

  Scenario: C332435 Verify that Price from Most VDPs should have data
    Then Price from Most VDPs should have data

  Scenario: C332436 Verify that Default Percent of Market from Most VDPs should have data
    Then Default Percent of Market from Most VDPs should have data

  Scenario: C332437 Verify that DOL from Most VDPs should have data
    Then DOL from Most VDPs should have data

  Scenario: C332438 Verify that Photos from Most VDPs should have data
    Then Photos from Most VDPs should have data

  Scenario: C332439 Verify that Leads from Most VDPs should have data
    Then Leads from Most VDPs should have data

  Scenario: C332440 Verify that Vdps from Most VDPs should have data
    Then Vdps from Most VDPs should have data

  Scenario: C332441 Verify that Leads and Vdps from Most VDPs should have data
    Then Leads and Vdps from Most VDPs should have data

  Scenario: C332445 Verify that all column is sortable for Last Month
    When I navigate to the "Most VDPs" from advance Report
    Then I click "Last Month" V2
    And the "Most VDPs" should have data
    And I click sort from Price from Most VDPs
    And I click sort from Default Percent of Market from Most VDPs
    And I click sort from DOL from Most VDPs
    And I click sort from Photos from Most VDPs
    And I click sort from Leads from Most VDPs
    And I click sort from VDPs from Most VDPs
    And I click sort from Leads and Vdps from Most VDPs

  Scenario: C332450 Verify that Price from Most VDPs should have data
    Then Price from Most VDPs should have data

  Scenario: C332451 Verify that Default Percent of Market from Most VDPs should have data
    Then Default Percent of Market from Most VDPs should have data

  Scenario: C332452 Verify that DOL from Most VDPs should have data
    Then DOL from Most VDPs should have data

  Scenario: C332453 Verify that Photos from Most VDPs should have data
    Then Photos from Most VDPs should have data

  Scenario: C332454 Verify that Leads from Most VDPs should have data
    Then Leads from Most VDPs should have data

  Scenario: C332455 Verify that Vdps from Most VDPs should have data
    Then Vdps from Most VDPs should have data

  Scenario: C332456 Verify that Most VDPs and Vdps from Most VDPs should have data
    Then Leads and Vdps from Most VDPs should have data