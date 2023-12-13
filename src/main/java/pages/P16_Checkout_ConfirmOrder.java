package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P16_Checkout_ConfirmOrder {
    //Todo declare webdriver
    WebDriver driver;
    //todo constructor
    public P16_Checkout_ConfirmOrder(WebDriver driver){
        this.driver=driver;
    }

    //todo define locators
    private final By confirmOrderButton=By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");

    //todo define methods
    public P16_Checkout_ConfirmOrder clickOnConfirmOrderButton(){
        driver.findElement(confirmOrderButton).click();
        return this;
    }
}
