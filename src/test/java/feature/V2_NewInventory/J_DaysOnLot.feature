Feature: Data Health Check for Days On Lot Report

  Scenario: C332520 Verify that all column is sortable for Last 7 days
    When I navigate to the "Days on Lot" from advance Report
    Then I click "Last 7 Days" V2
    And the "Days on Lot" should have data
    And I click sort from Price from Days On Lot
    And I click sort from Default Percent of Market from Days On Lot
    And I click sort from DOL from Days On Lot
    And I click sort from Photos from Days On Lot
    And I click sort from Leads from Days On Lot
    And I click sort from VDPs from Days On Lot
    And I click sort from Leads and Vdps from Days On Lot

  Scenario: C332525 Verify that Price from Days On Lot should have data
    Then Price from Days On Lot should have data

  Scenario: C332526 Verify that Default Percent of Market from Days On Lot should have data
    Then Default Percent of Market from Days On Lot should have data

  Scenario: C332527 Verify that DOL from Days On Lot should have data
    Then DOL from Days On Lot should have data

  Scenario: C332528 Verify that Photos from Days On Lot should have data
    Then Photos from Days On Lot should have data

  Scenario: C332529 Verify that Leads from Days On Lot should have data
    Then Leads from Days On Lot should have data

  Scenario: C332530 Verify that Vdps from Days On Lot should have data
    Then Vdps from Days On Lot should have data

  Scenario: C332531 Verify that Leads and Vdps from Days On Lot should have data
    Then Leads and Vdps from Days On Lot should have data

  Scenario: C332535 Verify that all column is sortable for Last Month
    When I navigate to the "Days On Lot" from advance Report
    Then I click "Last Month" V2
    And the "Days On Lot" should have data
    And I click sort from Price from Days On Lot
    And I click sort from Default Percent of Market from Days On Lot
    And I click sort from DOL from Days On Lot
    And I click sort from Photos from Days On Lot
    And I click sort from Leads from Days On Lot
    And I click sort from VDPs from Days On Lot
    And I click sort from Leads and Vdps from Days On Lot

  Scenario: C332540 Verify that Price from Days On Lot should have data
    Then Price from Days On Lot should have data

  Scenario: C332541 Verify that Default Percent of Market from Days On Lot should have data
    Then Default Percent of Market from Days On Lot should have data

  Scenario: C332542 Verify that DOL from Days On Lot should have data
    Then DOL from Days On Lot should have data

  Scenario: C332543 Verify that Photos from Days On Lot should have data
    Then Photos from Days On Lot should have data

  Scenario: C332544 Verify that Leads from Days On Lot should have data
    Then Leads from Days On Lot should have data

  Scenario: C332545 Verify that Vdps from Days On Lot should have data
    Then Vdps from Days On Lot should have data

  Scenario: C332546 Verify that Leads and Vdps from Days On Lot should have data
    Then Leads and Vdps from Days On Lot should have data