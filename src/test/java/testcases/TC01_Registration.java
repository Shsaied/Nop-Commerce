package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_Register;

import static util.Utility.*;

public class TC01_Registration extends TestBase {
//Todo Declare used pages
    //P01_HomePage Home;
    //P02_Register Register;
    //Todo define parameter values
    String firstName= faker.name().firstName();
    String lasName=faker.name().lastName();
    int day = generateRandomInt(28);
    int month= generateRandomInt(12);
    String  year= generateRandomYear();
    static String email=faker.internet().emailAddress();
    String companyName= "test";
    String password ="Test@123";
    String cPassword ="Test@123";


    @Test( priority = 1 , description = "SC1- User could register with valid data")
    public void registerNewUserWithValiddata_P() throws InterruptedException {
        System.out.println("Registration"+email);
 new P01_HomePage(driver).clickRegisterLink();
 new P02_Register(driver).chooseRandomGender().insertFirstname(firstName).insertLastname(lasName).selectDateOfBirthDay(day).selectDateOfBirthMonth(month).selectDateOfBirthYear(year).insertEmail(email).insertCompanyname(companyName).insertPassword(password).insertConfirmpassword(cPassword).clickSubmitRegisterButton();
 Thread.sleep(3000);

 /*
        //Todo define pages
        Home = new P01_HomePage(driver);
        Register = new P02_Register(driver);

        //Todo test steps
        //1-navigate to Registration page
        Home.clickRegisterLink();
        //2-Select gender
        Register.chooseRondomGender(randomGender);
        //3-insert First name
        Register.insertFirstname(firstName);
        //4-insert Last name
        Register.insertLastname(lasName);
        //5-Select Birth day
        Register.selectDateOfBirthDay(day);
        //6-Select Birth month
        Register.selectDateOfBirthMonth(month);
        //7-select Birth year
        Register.selectDateOfBirthYear(year);
        //8-insert email
        Register.insertEmail(email);
        //9-insert Company name
        Register.insertCompanyname(companyName);
        //10-Check newsletter
        //Register.unCheckNewsletterbox();
        //12-insert password
        Register.insertPassword(password);
        //13-insert Confirm password
       Register.insertConfirmpassword(cPassword);

        Thread.sleep(5000);
        //14-Click submit
        Register.submitRegister();
        Thread.sleep(5000);
          */

}
}
