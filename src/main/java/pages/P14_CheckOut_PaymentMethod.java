package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P14_CheckOut_PaymentMethod {
    //Todo declare webdriver
    WebDriver driver;
    //todo constructor
    public P14_CheckOut_PaymentMethod(WebDriver driver){
        this.driver=driver;
    }

    //todo define locators
    private final By creditCardRadioButton=By.id("paymentmethod_1");

    private final By paymentMethodContinueButton=By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");
    //todo define methods
    public P14_CheckOut_PaymentMethod selectCreditCardRadioButton(){
        driver.findElement(this.creditCardRadioButton).click();
        return this;
    }

    public P14_CheckOut_PaymentMethod clickOnPaymentMethodContinueButton(){
        driver.findElement(this.paymentMethodContinueButton).click();
        return this;
    }
}
