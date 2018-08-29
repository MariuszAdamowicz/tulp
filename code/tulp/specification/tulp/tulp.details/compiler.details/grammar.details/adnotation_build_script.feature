Feature: Annotation that meaning that it is a build script
  Scenario: Recognize build script
    Given Exists build.tulp file
    And start with '@build_script'
    When I start build application
    Then This file will be build as Windows class
