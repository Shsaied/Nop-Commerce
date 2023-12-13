package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_ForgetPassword;

import static testcases.TC01_Registration.email;

public class TC03_ForgetPassword extends TestBase{
    //Todo Declare the used pages
    //P01_HomePage homePage;
   // P03_Login loginPage;
    //P04_ForgetPassword forgetPasswordPage;


    //Todo set parameter
    String forgetPasswordEmail="shaimaa.saeed@Test.com";

    @Test(priority = 1, description = "User could reset his/her password successfully")
    public void resetPasswordSccessfully_P() throws InterruptedException {
        new P01_HomePage(driver).clickLoginLink();
        new P03_Login(driver).clickForgetPasswordlink();
        new P04_ForgetPassword(driver).insertForgetPasswordEmail(email).clickRecoverButton().AssertDisplayedForgetMessageWithTrue();
        Thread.sleep(4000);


        /*
        //Todo define used pages
        homePage= new P01_HomePage(driver);
        loginPage= new P03_Login(driver);
        forgetPasswordPage= new P04_ForgetPassword(driver);
        //Todo steps
        //1-Click login
        homePage.clickLoginLink();
        //2-Click forget password
        loginPage.clickForgetPasswordlink();
        //3-insert Email
        forgetPasswordPage.insertForgetPasswordEmail(forgetPasswordEmail);
        //4-Click Recover
        forgetPasswordPage.clickRecoverButton();
        Thread.sleep(4000);
        //5- Assert on the displayed message
        forgetPasswordPage.AssertDisplayedForgetMessageWithTrue();

         */

    }
}
