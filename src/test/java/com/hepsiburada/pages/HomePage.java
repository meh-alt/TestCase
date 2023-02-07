package com.hepsiburada.pages;

import com.hepsiburada.utilities.BrowserUtils;
import com.hepsiburada.utilities.ConfigurationReader;
import com.hepsiburada.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "myAccount")
    public WebElement myAccount;

    @FindBy(id = "login")
    public WebElement login;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement account;

    @FindBy(xpath = "//a[@title='Kullanıcı Bilgilerim']")
    public WebElement userInfo;

    @FindBy(xpath = "//input[@placeholder='Ürün, kategori veya marka ara']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='searchBoxOld-yDJzsIfi_S5gVgoapx6f']")
    public WebElement searchButton;

    @FindBy (id = "onetrust-accept-btn-handler")
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//a[.='Çıkış Yap']")
    public WebElement logoutButton;

    public void acceptCookies(){
        acceptCookiesButton.click();
    }

    public void goTologinPage() {

        BrowserUtils.hover(myAccount);
        login.click();
    }

    public void goToUserInfoPage() {
        BrowserUtils.hover(account);
        userInfo.click();
    }
public void enterItemToSearchbox(){
        searchBox.sendKeys(ConfigurationReader.get("searchItem"));
        searchButton.click();
}
public void logout(){
        BrowserUtils.hover(account);
        BrowserUtils.clickWithJSExe(logoutButton);
}
}
