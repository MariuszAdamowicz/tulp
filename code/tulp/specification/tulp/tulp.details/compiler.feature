Feature: Compiler
Compiler is one of possibilities of Tulp tool. It is started by command build, and must have tulp.build file, that is description of project.
The result of building is jar file.

  Scenario: Should be created jar file after 'tulp build' command
    Given I am in directory 'tmp/tulpExample' when exists tulp.build
    When I type command 'tulp build'
    Then build.tulp will be processed
    And file foo1.jar will be created.

  #Example Files: tulp.build