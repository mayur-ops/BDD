package com.BDD.StepDefinitions;

import com.BDD.PageObject.WishListButton;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class WishListButtonSteps {

    WishListButton wishListButton = new WishListButton();

    @When("User clicks on wishlist button")
    public void user_clicks_on_wishlist_button() {
       wishListButton.wishList();
    }
    @Then("User should be able to see your wishlist page")
    public void user_should_be_able_to_see_your_wishlist_page() {
    String title = wishListButton.wishListAssertion();
    Assert.assertThat(title, Matchers.containsString("Argos - Wishlist"));
    }

}
