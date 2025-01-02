Feature: Data Health Check for Leads Report

  Scenario: C332400 Verify that all column is sortable for Last 7 days
    When I navigate to the "Leads" from advance Report
    Then I click "Last 7 Days" V2
    And the "Leads" should have data
    And I click sort from Price from Leads
    And I click sort from Default Percent of Market from Leads
    And I click sort from DOL from Leads
    And I click sort from Photos from Leads
    And I click sort from Leads from Leads
    And I click sort from VDPs from Leads
    And I click sort from Leads and Vdps from Leads

  Scenario: C332405 Verify that Price from Leads should have data
    Then Price from Leads should have data

  Scenario: C332406 Verify that Default Percent of Market from Leads should have data
    Then Default Percent of Market from Leads should have data

  Scenario: C332407 Verify that DOL from Leads should have data
    Then DOL from Leads should have data

  Scenario: C332408 Verify that Photos from Leads should have data
    Then Photos from Leads should have data

  Scenario: C332409 Verify that Leads from Leads should have data
    Then Leads from Leads should have data

  Scenario: C332410 Verify that Vdps from Leads should have data
    Then Vdps from Leads should have data

  Scenario: C332411 Verify that Leads and Vdps from Leads should have data
    Then Leads and Vdps from Leads should have data

  Scenario: C332415 Verify that all column is sortable for Last Month
    When I navigate to the "Leads" from advance Report
    Then I click "Last Month" V2
    And the "Leads" should have data
    And I click sort from Price from Leads
    And I click sort from Default Percent of Market from Leads
    And I click sort from DOL from Leads
    And I click sort from Photos from Leads
    And I click sort from Leads from Leads
    And I click sort from VDPs from Leads
    And I click sort from Leads and Vdps from Leads

  Scenario: C332420 Verify that Price from Leads should have data
    Then Price from Leads should have data

  Scenario: C332421 Verify that Default Percent of Market from Leads should have data
    Then Default Percent of Market from Leads should have data

  Scenario: C332422 Verify that DOL from Leads should have data
    Then DOL from Leads should have data

  Scenario: C332423 Verify that Photos from Leads should have data
    Then Photos from Leads should have data

  Scenario: C332424 Verify that Leads from Leads should have data
    Then Leads from Leads should have data

  Scenario: C332425 Verify that Vdps from Leads should have data
    Then Vdps from Leads should have data

  Scenario: C332426 Verify that Leads and Vdps from Leads should have data
    Then Leads and Vdps from Leads should have data