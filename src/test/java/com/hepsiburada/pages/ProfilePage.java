package com.hepsiburada.pages;

import com.github.javafaker.Faker;
import com.hepsiburada.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.text.SimpleDateFormat;

public class ProfilePage extends HomePage {

    @FindBy(id = "txtBirthDay")
    public WebElement birthDay;


    @FindBy(xpath = "//div[@class='dZAEjxk-ljB6ui8oOynrl']/button[.='Güncelle']")
    public WebElement updateButton;

    @FindBy(xpath = "//div[@class='customerAccount-StaticMenuItem-359Tt']")
    public WebElement logoutButton;

    public void changeBirthday() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Faker faker = new Faker();
        String dob = sdf.format(faker.date().birthday(8, 120));
        birthDay.sendKeys(dob);
    }


    public void clickUpdateButton() {
        BrowserUtils.clickWithJSExe(updateButton);
    }

    public void logout() {
        BrowserUtils.clickWithJSExe(logoutButton);
    }

    public String getBirthday() {
        String birthday = birthDay.getAttribute("value");
        return birthday;
    }

    public String getUpdatedBirthday() {
        String birthday = birthDay.getAttribute("value");
        return birthday;
    }


}
