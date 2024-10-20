Feature: Application Login Setup

  @setup
  Scenario: Verify if user can successfully login
    When I navigate to the Result Summary Page
    And I select "Demo Client"
    And I select vehicle type "Used Inventory"

  @resultSummary
  Scenario: C96162 Verify that Total VDPs section should have value
    Then the totalVDPs should have data

  @resultSummary
  Scenario: C96163 Verify that VDP Pace section should have value
    Then the Verify that VDP Pace section should have value

  @resultSummary
  Scenario: C238773 Verify if Avg VDPs has value
    Then the Verify if Avg VDPs has value

  @resultSummary
  Scenario: C96164 Verify if Front Line Ready should have data
    Then the Front Line Ready should have data

  @resultSummary
  Scenario: C96165 Verify if Sales to FLR Ratio has value
    Then the Sales to FLR Ratio should have data

  @resultSummary
  Scenario: C96166 Verify if Sales Pace has value
    Then the Sales Pace should have data

  @resultSummary
  Scenario: C96168 Verify if Result Score is not empty
    Then the result score should show data

  @resultSummary
  Scenario: C96173 Verify that Top Vehicle VDPs should have a list of vehicles with VDP Count
    Then the Top Vehicle VDPs should have a list of vehicles with VDP Count

  @resultSummary
  Scenario: C96174 Verify that Top VDP’s by Body Style Summary should list all the available vehicle with its corresponding value
    Then the Top VDP’s by Body Style Summary should list all the available vehicle

# Needs Attention
  @resultSummary
  Scenario: C96169 Verify that Needs attention for vehicle with red results score should have value
    Then the "Red" results score has data

  @resultSummary
  Scenario: C96170 Verify that Needs attention for vehicle with yellow results score should have value
    Then the "Yellow" results score has data

# Quick Result Table
  @resultSummary
  Scenario: C96175 Verify that tippable cargurus column from the quick results table should not show 0 data in all row
    Then the Tippable Cargurus column should have data

  @resultSummary
  Scenario: C96176 Verify that tippable AutoTrader column from the quick results table should not show 0 data in all row
    Then the Tippable Autotrader column should have data

  @resultSummary
  Scenario: C96177 Verify that tippable Cars.com column from the quick results table should not show 0 data in all row
    Then the Tippable Cars dot com column should have data

  @resultSummary
  Scenario: C97061 Verify that Zero Leads column from the quick result table will not show 0 data in all row
    Then the Zero Leads column should have data