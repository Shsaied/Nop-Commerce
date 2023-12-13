package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P05_HomePageAfterLogin;

import static testcases.TC01_Registration.email;

public class TC04_SearchForProduct extends TestBase {

    //Todo declare used page
    //P01_HomePage homePage;
    //P03_Login loginPage;
    //P05_HomePageAfterLogin homeAfterLogInpage;

    //Todo define parameter
    //String email="shaimaa.saeed@test.com";
    String password="Test@123";
    String searchKeyword="notebook";


    @Test(priority = 1, description ="Logged User could search for any product")
    public void loggedUserSearchForAnyProduct_P() throws InterruptedException {
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
        new P05_HomePageAfterLogin(driver).typeSearchKeywordOnProductSerachFiield(searchKeyword).clickOnSearchButton();
        Thread.sleep(3000);
        /*
        //Todo define page
        homePage=new P01_HomePage(driver);
        loginPage=new P03_Login(driver);
        homeAfterLogInpage=new P05_HomePageAfterLogin(driver);
        //Todo Test steps:
        //1-Click on login link
        homePage.clickLoginLink();
        //2-login with valid user
        loginPage.insertEmail(email);
        loginPage.insertPassword(password);
        loginPage.clickLoginButton();
        Thread.sleep(4000);
        //3-search on product using search field
        homeAfterLogInpage.typeSearchKeywordOnProductSerachFiield(searchKeyword);
        homeAfterLogInpage.clickOnSearchButton();
        Thread.sleep(4000);

         */
    }

}
