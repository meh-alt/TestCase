package com.hepsiburada.step_definitions;

import com.hepsiburada.pages.CartPage;
import com.hepsiburada.pages.HomePage;
import com.hepsiburada.pages.LoginPage;
import com.hepsiburada.pages.SearchPage;
import com.hepsiburada.utilities.ConfigurationReader;
import com.hepsiburada.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Scenario1_StepDefinitions {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("user goes to login page")
    public void user_goes_to_login_page() {
        homePage.acceptCookies();
        homePage.goTologinPage();
    }


    @And("user enters credentials")
    public void user_enters_credentials() {
        loginPage.login();
    }

    @And("user enters item to search box")
    public void userEntersItemToSearchBox() {
        homePage.enterItemToSearchbox();
    }

    @And("User adds items to cart")
    public void userAddsItemsToCart() {
        searchPage.selectItems();
    }

    @And("User goes to cart")
    public void user_goes_to_cart() {
        searchPage.gotoShoppingCart();

    }

    @And("The quantity of any product in the cart is increased.")
    public void the_quantity_of_any_product_in_the_cart_is_increased() {
        int quantity = cartPage.productQuantity();
        cartPage.increaseItem();
        int quantityIncreased = cartPage.productQuantityIncreased();
        Assert.assertEquals(quantity + 1, quantityIncreased);
    }

    @And("user goes to home page")
    public void user_goes_to_home_page() {
        cartPage.gotoHomePage();
    }

    @Then("user logout from application")
    public void user_logout_from_application() {
        homePage.logout();
    }


}
