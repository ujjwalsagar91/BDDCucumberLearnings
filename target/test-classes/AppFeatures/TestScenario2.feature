Feature: Title 2
  I want to use this template for my feature file
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5.2 | success |
      | name2 |     7.5 | Fail    |
