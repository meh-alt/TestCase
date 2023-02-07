package com.hepsiburada.pages;

import com.hepsiburada.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends HomePage {


    @FindBy(xpath = "//a[@aria-label='Ürünü Arttır']")
    public WebElement increaseItemButton;


    @FindBy(xpath = "(//input[@name='quantity'])[1]")
    public WebElement productQuantity;

    @FindBy(xpath = "//a[@title='Hepsiburada']")
    public WebElement goToHomePageButton;


    public void increaseItem() {
        BrowserUtils.clickWithWait(increaseItemButton, 2);
    }

    public int productQuantity() {
        String quantity = productQuantity.getAttribute("value");
        int q = Integer.parseInt(quantity);
        return q;
    }

    public int productQuantityIncreased() {
        String quantity = productQuantity.getAttribute("value");
        int q = Integer.parseInt(quantity);
        return q;
    }

    public void gotoHomePage() {

        BrowserUtils.clickWithWait(goToHomePageButton,2);
    }


}
