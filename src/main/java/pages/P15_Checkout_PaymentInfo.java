package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P15_Checkout_PaymentInfo {
    //Todo declare webdriver
    WebDriver driver;
    //todo constructor
    public P15_Checkout_PaymentInfo(WebDriver driver){
        this.driver=driver;
    }

    //todo define locators
    private final By cardHolderName=By.id("CardholderName");

    private final By cardNumber=By.id("CardNumber");
    private final By cardExpireMonth=By.id("ExpireMonth");
    private final By cardExpireYear=By.id("ExpireYear");
    private final By cardCode=By.id("CardCode");
    private final By paymentInfoContinueButton=By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");

    //todo define methods
    public P15_Checkout_PaymentInfo insertCardHolder(String cardHolder){
        driver.findElement(this.cardHolderName).sendKeys(cardHolder);
        return this;
    }
    public P15_Checkout_PaymentInfo insertCardNumber(String cardNumber){
        driver.findElement(this.cardNumber).sendKeys(cardNumber);
        return this;
    }
    public P15_Checkout_PaymentInfo selectCardExpireMonth(int index){
        WebElement expireMonth=driver.findElement(this.cardExpireMonth);
        Select selectCardMonthExpire=new Select(expireMonth);
        selectCardMonthExpire.selectByIndex(index);
        return this;
    }

    public P15_Checkout_PaymentInfo selectCardExpireYear(int index){
        WebElement expireYear=driver.findElement(this.cardExpireYear);
        Select selectCardYearExpire=new Select(expireYear);
        selectCardYearExpire.selectByIndex(index);
        return this;
    }
    public P15_Checkout_PaymentInfo insertCardCode(String cardCode){
       driver.findElement(this.cardCode).sendKeys(cardCode);
       return this;
    }
    public P15_Checkout_PaymentInfo clickOnPaymentInfoContinueButton() {
        driver.findElement(this.paymentInfoContinueButton).click();
        return this;
    }
    }
