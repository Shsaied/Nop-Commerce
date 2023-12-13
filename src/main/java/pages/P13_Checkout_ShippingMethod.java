package pages;

import org.bouncycastle.oer.Switch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.KeyEvent;

public class P13_Checkout_ShippingMethod {
    //ToDo declare Web driver
    WebDriver driver;
    //ToDo Constructor
    public P13_Checkout_ShippingMethod(WebDriver driver){
        this.driver=driver;
    }
    //todo define locators
    private final By continueShippingMethodButton=By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
    private final By groundShippingRadioButton=By.id("shippingoption_0");
    //todo define methods
    public P13_Checkout_ShippingMethod clickOnContinueShippingMethodButton(){
        driver.findElement(this.continueShippingMethodButton).click();
        return this;
    }
    public P13_Checkout_ShippingMethod selectGroundShippingMethod() throws AWTException {
    /*Actions action=new Actions(driver);
    WebElement shippingMethod= driver.findElement(groundShippingMethod);
    action.moveToElement(shippingMethod).build().perform();
         */
        Alert tt= driver.switchTo().alert();
        Robot x =new Robot();
        x.keyPress(KeyEvent.VK_TAB);
        x.keyRelease(KeyEvent.VK_TAB);
        driver.switchTo().activeElement().click();
        driver.findElement(this.groundShippingRadioButton).click();
        return this;
    }
}
