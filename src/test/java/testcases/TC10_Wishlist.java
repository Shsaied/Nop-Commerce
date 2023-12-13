package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P05_HomePageAfterLogin;
import pages.P08_CellPhones;

import static testcases.TC01_Registration.email;

public class TC10_Wishlist extends TestBase{

    //String email="shaimaa.saeed@test.com";
    String password="Test@123";

    @Test(priority = 1, description = "SC10- Logged user could add different products to Wishlist")
    public void addProductToWishList(){
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
        new P05_HomePageAfterLogin(driver).hoverOnElectronicsLink().selectRandomCategory();
        new P08_CellPhones(driver).clickCellPhonesFavoriteButton();
    }

}
