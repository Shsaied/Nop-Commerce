package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P05_HomePageAfterLogin;
import pages.P06_Shoes;

import static testcases.TC01_Registration.email;

public class TC07_ColorFilter extends TestBase{

    //Todo Declare used pages
    //P01_HomePage homePage;
    //P03_Login loginPage;
    //P05_HomePageAfterLogin homePageAfterLogin;
    //P06_Shoes shoesPage;

    //Todo define parameter
    //String email="shaimaa.saeed@test.com";
    String password="Test@123";

    //Todo define test case parameter

    @Test(priority = 1, description ="SC7- Logged user could filter with color" )
    public void selectDifferentCategories() throws InterruptedException {
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
        new P05_HomePageAfterLogin(driver).hoverOnApperalLink().selectShoesFromAppreallink();
        new P06_Shoes(driver).selectRandomColorFilter();
        Thread.sleep(3000);

         /*
        //Todo define pages
        homePage=new P01_HomePage(driver);
        loginPage= new P03_Login(driver);
        homePageAfterLogin= new P05_HomePageAfterLogin(driver);
        shoesPage =new P06_Shoes(driver);
        //Todo test case steps
        //click login link
        homePage.clickLoginLink();
        //login
        loginPage.insertEmail(email);
        loginPage.insertPassword(password);
        loginPage.clickLoginButton();
        //hover on Appreal
        homePageAfterLogin.hoverOnApperalLink();
        //Click On Shoes
        homePageAfterLogin.selectShoesFromAppreallink();
        //Select random Color
        shoesPage.selectRandomColorFilter();
        Thread.sleep(4000);

       */

       /* shoesPage.selectBlueColorFilter();
        Thread.sleep(4000);
        shoesPage.selectRedColorFilter();
        Thread.sleep(4000);*/

    }
}
