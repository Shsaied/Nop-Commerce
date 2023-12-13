package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P05_HomePageAfterLogin;

import static testcases.TC01_Registration.email;

public class TC08_Tags extends TestBase {
//Todo declare page
//P01_HomePage homePage;
//P03_Login loginPage;
// P05_HomePageAfterLogin homePageAfterLogin;

  //Todo define parameter
 //String email= "Shaimaa.saeed@test.com";
 String password="Test@123";

 @Test(priority = 1,description = "Logged user could select different tags")
    public void SelectDifferentTags() throws InterruptedException {
  new P01_HomePage(driver).clickLoginLink();
  new P03_Login(driver).insertEmail(email).insertPassword(password).clickLoginButton();
  new P05_HomePageAfterLogin(driver).hoverOnComputersMenu().selectRandomCategoryUnderComputersMenu();
  Thread.sleep(3000);
  /*
     homePage =new P01_HomePage(driver);
     loginPage=new P03_Login(driver);
    homePageAfterLogin= new P05_HomePageAfterLogin(driver);

     //Todo Steps
     //click on login in link at  home page
     homePage.clickLoginLink();
     //login with valid user
     loginPage.insertEmail(email);
     loginPage.insertPassword(password);
     loginPage.clickLoginButton();
     //hover on Computer category in the main menu
      homePageAfterLogin.hoverOnComputersMenu();
     //select random tag under computers
     Thread.sleep(1000);
     homePageAfterLogin.selectRandomCategoryUnderComputersMenu();

   */
 }
}
