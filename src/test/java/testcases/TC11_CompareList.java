package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P05_HomePageAfterLogin;
import pages.P09_NoteBooks;

import static testcases.TC01_Registration.email;

public class TC11_CompareList extends TestBase{
    //Todo Define parameters
    //String email="shaimaa.saeed@test.com";
    String password="Test@123";

    @Test(priority = 1, description = "Logged user could add different products to compare list")
    public void addProductToCompareList(){
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
        new P05_HomePageAfterLogin(driver).hoverOnComputersMenu().selectNoteBooksLink();
        new P09_NoteBooks(driver).clickOnNoteBooksCompareButton();
    }
}
