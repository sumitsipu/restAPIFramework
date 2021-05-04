package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    @Given("^user is on landing page$")
    public void userIsOnLandingPage(){
        System.out.println("userIsOnLandingPage");
    }

    @When("user login into the application with username {string} and password {string}")
    public void userLoginIntoTheApplicationWithUsernameAndPassword(String username, String password) {
        System.out.println("userLoginIntoTheApplicationWithUsernameAndPassword " + username + " " + password);
    }

    @Then("home page is populated")
    public void homePageIsPopulated() {
        System.out.println("homePageIsPopulated");
    }

    @And("cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("cardsAreDisplayed");
    }
}
