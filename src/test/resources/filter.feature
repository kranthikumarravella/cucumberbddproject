Feature: Filter
  As a end user
  I want to filter
  So that i can view filtered products
  Scenario: Filter by rating
    Given I am on the home page
    When I search for a product "nike"
    And I select filter "5only"
    Then I should see results filtered by "5.0"

