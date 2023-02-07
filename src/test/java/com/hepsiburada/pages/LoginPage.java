package com.hepsiburada.pages;


import com.hepsiburada.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends HomePage {

    @FindBy(xpath = "//input[@placeholder='E-posta adresi veya telefon numarası']")
    public WebElement username;

    @FindBy(id = "btnLogin")
    public WebElement goToPassword;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnEmailSelect")
    public WebElement loginToApp;


    public void login() {
        username.sendKeys(ConfigurationReader.get("username"));
        goToPassword.click();
        password.sendKeys(ConfigurationReader.get("password"));
        loginToApp.click();
    }


}
