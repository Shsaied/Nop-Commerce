package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_ShoppingCartPage {
    //todo declare webdriver
    WebDriver driver;

    //Todo Constructor
    public P11_ShoppingCartPage(WebDriver driver){
        this.driver=driver;
    }

    //Todo Define Locators
    private final By termsOfServiceCheckBox= By.id("termsofservice");
    private final By checkOutButton =By.id("checkout");

    //Todo Methods
    public P11_ShoppingCartPage checkOnTermsOfServiceBox(){
        driver.findElement(this.termsOfServiceCheckBox).click();
        return this;
    }
    public P11_ShoppingCartPage clickOnCheckOutButton(){
        driver.findElement(checkOutButton).click();
        return this;
    }
}
