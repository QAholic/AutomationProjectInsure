package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
    LoginPage login = new LoginPage();

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_sauce_demo_login_page() {
        login.launchBrowser();
        pages.BasePage.driver.get("https://www.saucedemo.com/");
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        login.clickLogin();
    }

    @Then("I should be redirected to the products dashboard")
    public void i_should_be_redirected_to_the_products_dashboard() {
        // Simple validation to check if we are on the inventory page
        String currentUrl = pages.BasePage.driver.getCurrentUrl();
        if(currentUrl.contains("inventory.html")) {
            System.out.println("Login Successful!");
        }
        login.quitBrowser();
    }
}