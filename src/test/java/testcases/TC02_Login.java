package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;

import static testcases.TC01_Registration.email;

public class TC02_Login extends TestBase {

    //Todo declare pages
       // P01_HomePage home;
       // P03_Login login;

        //Todo Define parameters values
    String loginEmail="shaimaa.saeed@test.com";
    String loginPassword="Test@123";

    @Test(priority = 1, description ="SC2- User could log in with valid email and password")
    public void loginWithValidEmailAndPassword_P() throws InterruptedException {
      new P01_HomePage(driver).clickLoginLink();
      new P03_Login(driver).insertEmail(email).insertPassword(loginPassword).clickLoginButton();
      Thread.sleep(3000);

        /*//Todo used define pages
        home = new P01_HomePage(driver);
        login= new P03_Login(driver);
        //Todo Script steps:
        //1-Click login
        home.clickLoginLink();
        //2-insert valid email
        login.insertEmail(loginEmail);
        //3-insert valid password
        login.insertPassword(loginPassword);
        Thread.sleep(4000);
        //4-Click login button
        login.clickLoginButton();
        Thread.sleep(4000);*/
    }
   /* @Test(priority = 2, description ="SC2- User could log in with valid email and Invalid password")
    public void loginWithValidEmail_N() throws InterruptedException {
        loginPassword="2323";
        //Todo used define pages
        home = new P01_HomePage(driver);
        login= new P03_Login(driver);
        //Todo Script steps:
        //1-Click login
        home.clickLoginLink();
        //2-insert valid email
        login.insertEmail(loginEmail);
        //3-insert valid password
        login.insertPassword(loginPassword);

        Thread.sleep(4000);

        //4-Click login button
        login.clickLoginButton();
        Thread.sleep(4000);
    }
    @Test(priority = 3, description ="SC2- User could log in with Invalid email and Valid password")
    public void loginWithValidPassword_N() throws InterruptedException {
        //Todo used define pages
        home = new P01_HomePage(driver);
        login= new P03_Login(driver);
        //Todo Script steps:
        //1-Click login
        home.clickLoginLink();
        //2-insert valid email
        login.insertEmail(loginEmail);
        //3-insert valid password
        login.insertPassword(loginPassword);

        Thread.sleep(4000);

        //4-Click login button
        login.clickLoginButton();
        Thread.sleep(4000);
    }
    @Test(priority = 4, description ="SC2- User could log in with Invalid email and password")
    public void loginWithInvalidEmailAndPassword_N() throws InterruptedException {
        //Todo used define pages
        home = new P01_HomePage(driver);
        login= new P03_Login(driver);
        //Todo Script steps:
        //1-Click login
        home.clickLoginLink();
        //2-insert valid email
        login.insertEmail(loginEmail);
        //3-insert valid password
        login.insertPassword(loginPassword);

        Thread.sleep(4000);

        //4-Click login button
        login.clickLoginButton();
        Thread.sleep(4000);
    }

*/

}
