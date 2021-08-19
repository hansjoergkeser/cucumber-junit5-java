package ui.tests.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pageobjects.Homepage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefs {

    @Given("I opened {string}")
    public void i_opened(String browser) {
        // Imagine test code here... this is just to demonstrate cucumber + junit + java
        System.out.println("Chosen browser: " + browser);
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        System.out.println("Search term: " + searchTerm);
    }

    @Then("I should see the ecosia website")
    public void i_should_see_the_ecosia_website() {
        // invert the result to see how cucumber displays failing test in log
        assertTrue(new Homepage().isDisplayed(), "Not on ecosia homepage.");
    }

}
