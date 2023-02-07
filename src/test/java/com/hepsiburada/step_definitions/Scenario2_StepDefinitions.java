package com.hepsiburada.step_definitions;

import com.hepsiburada.pages.HomePage;
import com.hepsiburada.pages.ProfilePage;
import com.hepsiburada.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Scenario2_StepDefinitions {

    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();


    @And("user goes to User Info page")
    public void user_goes_to_User_Info_page() {
        homePage.goToUserInfoPage();
    }


    @And("User changes birthday Info")
    public void user_changes_birthday_Info() {
        String birthday = profilePage.getBirthday();
        profilePage.changeBirthday();
        String updatedBirthday = profilePage.getUpdatedBirthday();
        Assert.assertNotEquals(birthday, updatedBirthday);

    }

    @And("User click update button")
    public void user_click_update_button() {
        profilePage.clickUpdateButton();
    }

    @Then("user logout")
    public void user_logout() {
        profilePage.logout();
        Driver.closeDriver();
    }


}
