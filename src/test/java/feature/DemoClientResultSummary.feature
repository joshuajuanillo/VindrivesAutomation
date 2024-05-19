Feature: Result Summary for Demo Client
  This feature deal with validating the data for each section if it has data for Demo Client

  Scenario: Verify if totalVDPs has value
    Given a user with a correct credentials
      | email    | jjuanillo@dealercmo.com |
      | password | !Pass1234               |
    When I navigate to the Result Summary Page
    And I select "Demo Client"
    Then the totalVDPs should have data

  Scenario: Verify if Avg VDPs has value
    Then the Avg VDPs Vehicle should have data

  Scenario: Verify if Front Line Ready has value
    Then the Front Line Ready should have data

  Scenario: Verify if Sales to FLR Ratio has value
    Then the Sales to FLR Ratio should have data

  Scenario: Verify if Sales Pace has value
    Then the Sales Pace should have data

  Scenario: Verify if Average days to sell has value
    Then the Average days to sell have data
    And Close Browser