Feature: Result Summary for Lost Pines Toyota
  This feature deal with validating the data for each section if it has data for Lost Pines Toyota

  Scenario: Verify if totalVDPs has value
    Given a user with a correct credentials
      | email    | jjuanillo@dealercmo.com |
      | password | !Pass1234               |
    When I navigate to the Result Summary Page
    And I select "Lost Pines Toyota"
    Then the totalVDPs should have data

  Scenario: Verify if Avg VDPs has value
    And I select "Lost Pines Toyota"
    Then the Avg VDPs Vehicle should have data

  Scenario: Verify if Front Line Ready has value
    And I select "Lost Pines Toyota"
    Then the Front Line Ready should have data

  Scenario: Verify if Sales to FLR Ratio has value
    And I select "Lost Pines Toyota"
    Then the Sales to FLR Ratio should have data

  Scenario: Verify if Sales Pace has value
    And I select "Lost Pines Toyota"
    Then the Sales Pace should have data

  Scenario: Verify if Average days to sell has value
    And I select "Lost Pines Toyota"
    Then the Average days to sell have data
    And Close Browser