package com.mariuszadamowicz.tulp.features.steps;

import com.mariuszadamowicz.tulp.features.steps.support.CompilerSteps;
import com.mariuszadamowicz.tulp.features.steps.support.EnviromentSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateBuildScriptStepsDefinition {

    CompilerSteps compiler = new CompilerSteps();
    EnviromentSteps env = new EnviromentSteps();

    String dir;

    @Given("I am in directory '(.*)' where I want start my tulp project")
    public void i_am_in_directory_where_I_want_start_my_tulp_project(String dir) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.dir = dir;
        env.currentPath(dir);
        throw new PendingException();
    }

    @When("^I type '(.*)' command$")
    public void i_type_command(String command) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        compiler.command(command);
        throw new PendingException();
    }

    @Then("^In current directory will be created file called '(.*)'$")
    public void in_current_directory_will_be_created_file_called_build_tulp(String fileName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        env.existFile(dir + '/' + fileName);
        throw new PendingException();
    }

//    Given("I am in directory where I want start my tulp project", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("I type {string} command", (String string) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Then("In current directory will be created file called {string}", (String string) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });

}
