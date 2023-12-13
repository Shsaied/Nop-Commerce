package testcases;

import org.testng.annotations.Test;
import pages.*;

import static testcases.TC01_Registration.email;
import static util.Utility.generateRandomInt;

public class TC09_ShoppingCart extends TestBase{

    //Todo declare page
    //P01_HomePage homePage;
    //P03_Login loginPage;
    //P05_HomePageAfterLogin homePageAfterLogin;
    //P06_Shoes shoesPage;
    //P07_ShoesProductDetails shoesProductDetails;

    //Todo define parameter
    //String email= "Shaimaa.saeed@test.com";
    String password="Test@123";
    int shoseSize= generateRandomInt(4);

@Test(priority = 1, description = "SC9- Logged user could add different products to Shopping cart")
    public void addDifferentProductToShoppingCart() throws InterruptedException {
 new P01_HomePage(driver).clickLoginLink();
 new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
 new P05_HomePageAfterLogin(driver).hoverOnApperalLink().selectShoesFromAppreallink();
 new P06_Shoes(driver).clickOnAddToCardButton();
 new P07_ShoesProductDetails(driver).selectShoesSize(shoseSize).clickOnAddtoCartButton();

    /*
    //Todo define pages
    homePage=new P01_HomePage(driver);
    loginPage= new P03_Login(driver);
    homePageAfterLogin= new P05_HomePageAfterLogin(driver);
    shoesPage= new P06_Shoes(driver);
    shoesProductDetails=new P07_ShoesProductDetails(driver);

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
    shoesPage.clickOnAddToCardButton();
    Thread.sleep(3000);
    shoesProductDetails.selectSize(1);
    shoesProductDetails.clickOnAddtoCartButton();
    Thread.sleep(3000);
/*

     */
}
}