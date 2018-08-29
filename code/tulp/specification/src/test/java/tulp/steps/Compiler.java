package tulp.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(SerenityRunner.class)
public class Compiler {

    @Steps
    TravellerSteps travellerSteps;

//    @Test
//    public void shouldCalculatePointsBasedOnDistance() {
//        // GIVEN
//        travellerSteps.a_traveller_has_a_frequent_flyer_account_with_balance(10000);
//
//        // WHEN
//        travellerSteps.the_traveller_flies(1000);
//
//        // THEN
//        travellerSteps.traveller_should_have_a_balance_of(10100);
//
//    }

    @Given("I am in directory (.*) when exists tulp.build")
    public void buyerWantsToBuy(String article) {
        throw new PendingException();
    }

    @When("I type command (.*)")
    public void kiedy(String string)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("build.tulp will be processed")
    public void wtedy() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("file foo1.jar will be created.")
    public void wtedy2() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}