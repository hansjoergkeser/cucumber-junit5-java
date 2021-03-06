package ui.tests.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {

    @Given("I opened {string}")
    public void i_opened(String browser) {
        System.out.println("Chosen browser: " + browser);
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        System.out.println("Search term: " + string);
    }

    @Then("I should see the ecosia website")
    public void i_should_see_the_ecosia_website() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

}
