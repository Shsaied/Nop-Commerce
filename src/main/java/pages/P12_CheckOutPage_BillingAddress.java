package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P12_CheckOutPage_BillingAddress {
    //TOdo declare web driver
    WebDriver driver;
    //Todo constructor
    public P12_CheckOutPage_BillingAddress(WebDriver driver){
        this.driver=driver;
    }
    //Todo define locators
    private final By billingFirstName=By.xpath("(//input)[@type=\"text\"][2]");
    private final By billingLastName=By.id("BillingNewAddress_LastName");
    private final By billingEmail=By.id("BillingNewAddress_Email");

    private  final By billingCountryDropDownList= By.id("BillingNewAddress_CountryId");
    private final By billingCity= By.id("BillingNewAddress_City");
    private final By billing1stAddress=By.id("BillingNewAddress_Address1");
    private final By billingZIPCode=By.id("BillingNewAddress_ZipPostalCode");
    private final By billingPhoneNumber=By.id("BillingNewAddress_PhoneNumber");
    private final By billingAddressFormSubmitButton=By.xpath("//button[@class=\"button-1 new-address-next-step-button\"]");
    //Todo Define Methods
    public P12_CheckOutPage_BillingAddress insertBillingFirstName(String billingFirstName){
        driver.findElement(this.billingFirstName).sendKeys(billingFirstName);
        return this;
    }
    public P12_CheckOutPage_BillingAddress insertBillingLastName (String billingLastName){
        driver.findElement(this.billingLastName).sendKeys(billingLastName);
        return this;
    }
    public P12_CheckOutPage_BillingAddress insertBillingEmail (String billingEmail){
        driver.findElement(this.billingEmail).sendKeys(billingEmail);
        return this;
    }
    public P12_CheckOutPage_BillingAddress selectBillingCounty (int index){
       WebElement countryDropDownLIst= driver.findElement(this.billingCountryDropDownList);
       Select selectCountry= new Select(countryDropDownLIst);
        selectCountry.selectByIndex(index);
        return this;
    }
    public P12_CheckOutPage_BillingAddress insertBillingCity(String billingCity){
        driver.findElement(this.billingCity).sendKeys(billingCity);
        return this;
    }

    public P12_CheckOutPage_BillingAddress insertBilling1stAddress(String billingAddress){
        driver.findElement(this.billing1stAddress).sendKeys(billingAddress);
        return this;
    }

    public P12_CheckOutPage_BillingAddress insertBillingZipCode(String billingZipCode){
        driver.findElement(this.billingZIPCode).sendKeys(billingZipCode);
        return this;
    }

    public P12_CheckOutPage_BillingAddress insertBillingPhoneNumber(String billingPhoneNumber){
        driver.findElement(this.billingPhoneNumber).sendKeys(billingPhoneNumber);
        return this;
    }
    public P12_CheckOutPage_BillingAddress clickBillingAddressSubmitButton() {
        driver.findElement(this.billingAddressFormSubmitButton).click();
        return this;
    }

}
