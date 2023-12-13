package testcases;

import com.github.javafaker.CreditCardType;
import org.testng.annotations.Test;
import pages.*;

import java.awt.*;
import java.math.MathContext;
import java.time.Year;

import static testcases.TC01_Registration.email;
import static util.Utility.generateRandomInt;
import static util.Utility.generateRandomYear;

public class TC12_Orders extends TestBase{
    //Todo define test case parameters
    //String email="shaimaa.saeed@test.com";
    String password="Test@123";
    String billingFirstName="Sheema";
    String billingLastName=faker.name().lastName();
    int country=generateRandomInt(55);
    String city= faker.country().name();
    String address= faker.address().fullAddress();
    String zipCode=faker.address().zipCode();
    String phoneNumber=faker.phoneNumber().phoneNumber();
    String cardHolderName=faker.name().fullName();
    String  cardNumber=faker.finance().creditCard(CreditCardType.VISA);
    int month= generateRandomInt(12);
    int year= generateRandomInt(5);
    String cardCode="695";
    @Test(priority = 1, description = "SC12- Create successful Order")
    public void createSuccessfullyOrder_P() throws InterruptedException, AWTException {
        System.out.println("orders"+email);
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
        Thread.sleep(4000);
        new P05_HomePageAfterLogin(driver).clickOnBooksLink();
        new P10_Books(driver).clickOnAddBooksToCart().clickOnShoppingCartInBooksPage();
        Thread.sleep(3000);
        new P11_ShoppingCartPage(driver).checkOnTermsOfServiceBox().clickOnCheckOutButton();
        //new P12_CheckOutPage_BillingAddress(driver).insertBillingFirstName(billingFirstName).insertBillingLastName(billingLastName).insertBillingEmail(email);
        Thread.sleep(3000);
        new P12_CheckOutPage_BillingAddress(driver).selectBillingCounty(country).insertBillingCity(city).insertBilling1stAddress(address).insertBillingZipCode(zipCode).insertBillingPhoneNumber(phoneNumber).clickBillingAddressSubmitButton();
        Thread.sleep(5000);
        new P13_Checkout_ShippingMethod(driver).clickOnContinueShippingMethodButton();
        Thread.sleep(3000);
        new P14_CheckOut_PaymentMethod(driver).selectCreditCardRadioButton().clickOnPaymentMethodContinueButton();
        Thread.sleep(4000);
        new P15_Checkout_PaymentInfo(driver).insertCardHolder(cardHolderName).insertCardNumber(cardNumber).selectCardExpireMonth(month).selectCardExpireYear(year).insertCardCode(cardCode).clickOnPaymentInfoContinueButton();
        Thread.sleep(3000);
        new P16_Checkout_ConfirmOrder(driver).clickOnConfirmOrderButton();
        Thread.sleep(3000);

    }
}
