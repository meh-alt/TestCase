package com.hepsiburada.pages;

import com.hepsiburada.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends HomePage {

    @FindBy(id = "shoppingCart")
    public WebElement shoppingCartButton;

    @FindBy(xpath = "//li[@id]")
    public List<WebElement> items;

    @FindBy(xpath = "//li[@id]//button/div[text()='Sepete ekle']")
    public WebElement addToCartButton;


    public void gotoShoppingCart() {

        BrowserUtils.clickWithWait(shoppingCartButton, 3);
    }


    public void selectItems() {
        BrowserUtils.hover(items.get(0));
        BrowserUtils.hover(items.get(2));
        BrowserUtils.hover(items.get(0));

        BrowserUtils.clickWithJSExe(addToCartButton);
        BrowserUtils.hover(items.get(2));
        BrowserUtils.clickWithWait(addToCartButton,1);


    }


}
