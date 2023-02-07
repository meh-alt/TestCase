package com.hepsiburada.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {



    //wait for an element to be clickable (with web element)
    public static void waitClickability(WebElement element, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //wait for clickability of an element then click
    public static void clickWithWait(WebElement element, int timeOut){
        waitForVisibility(element,timeOut);
        waitClickability(element,timeOut);
        element.click();
    }


    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }


    //wait for visibility of a web element
    public static void waitForVisibility(WebElement element, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), timeOut);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //click on a web element using JSexecutor
    public static void clickWithJSExe(WebElement element) {
        waitClickability(element, 3);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }


}
