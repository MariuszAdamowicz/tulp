Feature: Creating build script
  In order to create new Tulp project
  As a programmer
  I want to be able create build script

  Scenario: Should be created build script after 'tulp init' command
    Given I am in directory '/tmp/tulp_test' where I want start my tulp project
    When I type 'tulp init' command
    Then In current directory will be created file called 'build.tulp'
