package com.CICD.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Given");
    }


    @When("user enter credentials")
    public void user_enter_credentials() {
        System.out.println("When");
    }


    @When("user click login button")
    public void user_click_login_button() {
        System.out.println("And");
    }

    @Then("User should be able to see welcome page")
    public void user_should_be_able_to_see_welcome_page() {

        System.out.println("Then");
    }

}
