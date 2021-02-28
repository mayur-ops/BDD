package com.BDD.StepDefinitions;

import com.BDD.PageObject.MultipleProductSearch;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleProductsSearchSteps {

    MultipleProductSearch multipleProductSearch = new MultipleProductSearch();

    @When("User search for product {string}")
    public void user_search_for_product(String item) {
    multipleProductSearch.multipleProduct(item);
    }

    @Then("User should be able to see all the products related to search")
    public void user_should_be_able_to_see_all_the_products_related_to_search() {

    }
}
