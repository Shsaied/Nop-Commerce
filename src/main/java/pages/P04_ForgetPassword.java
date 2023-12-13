package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.security.PublicKey;

public class P04_ForgetPassword {
    //Todo declare Web driver
    WebDriver driver;
    //Todo constructor
    public P04_ForgetPassword(WebDriver driver){
        this.driver=driver;
    }
    //Todo define locators
    private final By forgetPasswordEmail= By.xpath("//input[@class=\"email\"]");
    private final By recoverButton=By.xpath("//button[@name=\"send-email\"]");
    private final By successForgetPasswordMessage=By.xpath("//p[@class=\"content\"]");

    //Todo define methods
    public P04_ForgetPassword insertForgetPasswordEmail(String email){
        driver.findElement(this.forgetPasswordEmail).sendKeys(email);
        return this;
    }

    public P04_ForgetPassword clickRecoverButton(){
        driver.findElement(this.recoverButton).click();
        return this;
    }
    public P04_ForgetPassword AssertDisplayedForgetMessageWithTrue(){
        String actualMessage=driver.findElement(this.successForgetPasswordMessage).getText();
        String expectedMessage = "Email with instructions has been sent to you.";
        Assert.assertTrue(actualMessage.equals(expectedMessage));
        return this;
}


    ///////////////////////////////Old code design///////////////////////////
    /*
    //Todo constructor
    public P04_ForgetPassword (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Todo define locator
    @FindBy(xpath = "//input[@class=\"email\"]")
    WebElement forgetPasswordEmail;

    @FindBy(xpath = "//button[@name=\"send-email\"]")
    WebElement recoverButton;

    @FindBy(xpath ="//p[@class=\"content\"]" )
    WebElement successForgetPasswordMessage;

    //Todo define methods
    public void insertForgetPasswordEmail(String forgetPasswordEmail){
        this.forgetPasswordEmail.sendKeys(forgetPasswordEmail);
    }

    public void clickRecoverButton(){
        this.recoverButton.click();
    }
    public void AssertDisplayedForgetMessageWithTrue(){
        String actualMessage = successForgetPasswordMessage.getText();
        String expectedMessage = "Email with instructions has been sent to you.";
        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }

     */
}
