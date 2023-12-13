package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.PrivateKey;

import static util.Utility.generateRandomInt;

public class P02_Register {
    //Todo declare web driver
    WebDriver driver;
    //Todo constructor
    public P02_Register(WebDriver driver){
        this.driver=driver;
    }
    //Todo define Locator
    private final By genderMale=By.xpath("(//input[@type=\"radio\"])[1]");
  private final By genderFemal=By.xpath("(//input[@type=\"radio\"])[2]");
  private final By randomGender=By.xpath("(//input[@type=\"radio\"])["+generateRandomInt(2)+"]");
   private final By firstName=By.xpath("(//input[@type=\"text\"])[2]");
  private final By lastName=By.xpath("(//input[@type=\"text\"])[3]");
  private final By dateOfBirthDay=By.xpath("//select[@name=\"DateOfBirthDay\"]");
  private final By dateOfBirthMonth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
  private final By dateOfBirthYear=By.xpath("//select[@name=\"DateOfBirthYear\"]");
  private final By email=By.xpath("(//input[@type=\"email\"])[1]");
  private final By companyName=By.xpath("(//input[@type=\"text\"])[4]");
  private final By newsLetter=By.xpath("//input[@type=\"checkbox\"]");
  private final By password=By.id("Password");
  private final By confirmPassword=By.id("ConfirmPassword");
  private final By submitButton =By.id("register-button");

    //Todo define Methods
    public P02_Register chooseGenderMale(){
        driver.findElement(genderMale).click();
        return this;
    }
    public P02_Register chooseGenderFemale(){
        driver.findElement(genderFemal).click();
        return this;
    }
    public P02_Register chooseRandomGender(){
        driver.findElement(this.randomGender).click();
        return this;
    }
    public P02_Register insertFirstname(String firstName){
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }
    public P02_Register insertLastname(String lastName){
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }
    public P02_Register selectDateOfBirthDay(int index){
       WebElement birthday=  driver.findElement(this.dateOfBirthDay);
        Select selectedBirthDay= new Select(birthday);
        selectedBirthDay.selectByIndex(index);
        return this;
    }
    public P02_Register selectDateOfBirthMonth(int index){
        WebElement BirthMonth= driver.findElement(this.dateOfBirthMonth);
        Select selectedBirthMonth=new Select(BirthMonth);
        selectedBirthMonth.selectByIndex(index);

        return this;
    }
public P02_Register selectDateOfBirthYear(String year){
        WebElement birthYear= driver.findElement(this.dateOfBirthYear);
        Select selectedBirthYear= new Select(birthYear);
        selectedBirthYear.selectByValue(year);
        return this;
}
public P02_Register insertEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
}
public P02_Register insertCompanyname(String companyName){
        driver.findElement(this.companyName).sendKeys(companyName);
        return this;
}
public P02_Register unCheckNewsletterbox(){
        driver.findElement(this.newsLetter).click();
        return this;
}
  public P02_Register insertPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return this;
  }
   public P02_Register insertConfirmpassword(String confirmPassword){
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
        return this;
   }
   public P02_Register clickSubmitRegisterButton(){
        driver.findElement(this.submitButton).click();
        return this;
   }

    //////////////////////Old Code design/////////////////////////

   /* WebDriver driver;
    //1-Todo define constructor
    public P02_Register(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //2-Todo define locator
    @FindBy(xpath ="(//input[@type=\"radio\"])[1]")
    WebElement genderMale;
    @FindBy(xpath = "(//input[@type=\"radio\"])[2]")
    WebElement genderFemal;
    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    WebElement firstName;

    @FindBy(xpath = "(//input[@type=\"text\"])[3]")
    WebElement lasName;
    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
    WebElement dateOfBirthDay;
    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]")
    WebElement dateOfBirthMonth;
    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]")
    WebElement dateOfBirthYear;
    @FindBy(xpath = "(//input[@type=\"email\"])[1]")
    WebElement email;
    @FindBy(xpath = "(//input[@type=\"text\"])[4]")
    WebElement companyName;
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement newsLetter;
    @FindBy(id ="Password")
    WebElement password;
    @FindBy(id= "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(id = "register-button")
    WebElement submitButton;

    //3-Todo define action method
public void chooseGenderMale(){
    this.genderMale.click();
}
public void chooseGenderFemale(){
    this.genderFemal.click();
}
public void chooseRondomGender(){
        driver.findElement(By.xpath("(//input[@type=\"radio\"])["+generateRandomInt(2)+"]")).click();
    }+
public void insertFirstname(String firstName){
    this.firstName.sendKeys(firstName);
}

public void insertLastname(String lastName){
    this.lasName.sendKeys(lastName);
}
public void selectDateOfBirthDay(int index){
    Select day= new Select(dateOfBirthDay);
    day.selectByIndex(index);

}
public void selectDateOfBirthMonth(int index){
    Select month=new Select(dateOfBirthMonth);
    month.selectByIndex(index);
}
public void selectDateOfBirthYear(String yearValue){
    Select year=new Select(dateOfBirthYear);
    year.selectByValue(yearValue);
}

public void insertEmail(String email){
    this.email.sendKeys(email);
}

public void insertCompanyname(String companyName){
    this.companyName.sendKeys(companyName);
}
public void unCheckNewsletterbox(){
    this.newsLetter.click();
}
public void insertPassword(String password){
    this.password.sendKeys(password);
}
public void insertConfirmpassword(String cPassword){
    this.confirmPassword.sendKeys(cPassword);
}
public void submitRegister(){
    this.submitButton.click();
}*/
}
