Feature: Title 1
  I want to use this template for my feature file
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     6.8 | success |
      | name2 |     8.8 | Fail    |
