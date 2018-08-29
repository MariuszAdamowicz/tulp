Feature: Declaring variable
  Scenario: Declaring variable
    Given text consist line 'var a = 5'
    When start compilation
    Then Is assigned memory o heap for one integer
      And memory is initialized
