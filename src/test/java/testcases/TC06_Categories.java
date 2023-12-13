package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P05_HomePageAfterLogin;

import static testcases.TC01_Registration.email;
import static util.Utility.generateRandomInt;

public class TC06_Categories extends TestBase{
    //Todo Declare used pages
    //P01_HomePage homePage;
    //P03_Login loginPage;
    //P05_HomePageAfterLogin homePageAfterLogin;

    //Todo define test case parameter
    //String email="shaimaa.saeed@test.com";
    String password="Test@123";


    @Test(priority = 1, description ="SC6- Logged user could select different Categories" )
    public void selectDifferentCategories() throws InterruptedException {
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
        new P05_HomePageAfterLogin(driver).hoverOnRandomMenuLink();
        Thread.sleep(3000);

/*
        //Todo define pages
        homePage=new P01_HomePage(driver);
        loginPage=new P03_Login(driver);
        homePageAfterLogin= new P05_HomePageAfterLogin(driver);
        //Todo Steps
        //click on login in link at  home page
        homePage.clickLoginLink();
        //login with valid user
        loginPage.insertEmail(email);
        loginPage.insertPassword(password);
        loginPage.clickLoginButton();
        //hover on random category in the main menu
        homePageAfterLogin.hoverOnRandomMenuLink();
        Thread.sleep(3000);

 */

       /* homePageAfterLogin.ClickOnBookLink();
        //select random category
        homePageAfterLogin.selectRandomcategory();
        Thread.sleep(3000);*/

    }
}
