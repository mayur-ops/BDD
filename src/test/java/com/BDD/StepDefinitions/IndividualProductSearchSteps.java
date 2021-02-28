package com.BDD.StepDefinitions;

import com.BDD.PageObject.IndividualProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class IndividualProductSearchSteps {

    IndividualProductSearch obj = new IndividualProductSearch();

    @Given("User is on the home page of argos website")
    public void user_is_on_the_home_page_of_argos_website() {
    String Url = obj.getCurrentUrl();
    Assert.assertThat(Url, Matchers.containsString("https://www.argos.co.uk/"));
    }

    @When("User types nike in the search box")
    public void user_types_nike_in_the_search_box() {
        obj.doSearch("nike");
    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
    obj.searchButtonClick();

    }

    @Then("User should be able to see all the nike product")
    public void user_should_be_able_to_see_all_the_nike_product() {
    String nikeProductTitle = obj.getTitle();
    Assert.assertThat(nikeProductTitle,Matchers.containsString("Results for nike"));

    }
}
