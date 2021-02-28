package com.BDD.StepDefinitions.ResultPageStepDefinitions;

import com.BDD.PageObject.PriceRangeCheckBox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceRangeCheckBoxSteps {

    PriceRangeCheckBox priceRangeCheckBox = new PriceRangeCheckBox();

    @Given("User is on the result page of argos website")
    public void user_is_on_the_result_page_of_argos_website() {

    }

    @When("User click on five and ten pound  price range checkbox")
    public void userClickOnFiveAndTenPoundPriceRangeCheckbox() {
        priceRangeCheckBox.priceRangeCheckBox();
    }

    @Then("User should be able to see all the item within these price range")
    public void userShouldBeAbleToSeeAllTheItemWithinThesePriceRange() {
    }
}
