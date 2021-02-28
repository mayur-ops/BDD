package com.BDD.StepDefinitions;

import com.BDD.PageObject.AccountButton;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class AccountButtonSteps {

    AccountButton accountButton = new AccountButton();

    @When("User clicks on account button")
    public void user_clicks_on_account_button() {
        accountButton.accountButtonClick();
    }

    @Then("User should be able to see sign in page")
    public void user_should_be_able_to_see_sign_in_page() {
    String accountTitle = accountButton.accountButtonAssertion();
    Assert.assertThat(accountTitle, Matchers.containsString("Sign in | Argos"));

    }

}
