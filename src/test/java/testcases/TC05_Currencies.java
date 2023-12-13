package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P05_HomePageAfterLogin;

import static testcases.TC01_Registration.email;

public class TC05_Currencies extends TestBase{
    //Todo declare used pages
    //P01_HomePage homePage;
    //P03_Login loginPage;
    //P05_HomePageAfterLogin homePageAfterLogin;

    //Todo define parameters
    String email ="shaimaa.saeed@test.com";
    String password="Test@123";
    String currency= String.valueOf(faker.currency());

    @Test(priority = 1, description = "SC5- Logged User could switch between currencies US-Euro")
    public void switchBetweenCurrency_P() throws InterruptedException {
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
        new P05_HomePageAfterLogin(driver).selectCurrency(currency);
        Thread.sleep(3000);

        /*
        //todo define pages
        homePage = new P01_HomePage(driver);
        loginPage= new P03_Login(driver);
        homePageAfterLogin=new P05_HomePageAfterLogin(driver);

        //todo testcase steps:
        //1-go to login page
        homePage.clickLoginLink();
        //2-login
        loginPage.insertEmail(email);
        loginPage.insertPassword(password);
        loginPage.clickLoginButton();
        //3-Switch currency
        homePageAfterLogin.selectCurrency("US Dollar");
        Thread.sleep(2000);
        homePageAfterLogin.selectCurrency("Euro");
        Thread.sleep(4000);

         */
    }
}
