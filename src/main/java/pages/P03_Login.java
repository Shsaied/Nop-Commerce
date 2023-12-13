package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_Login  {
    //Todo declare web driver
    WebDriver driver;
    //Todo constructor
    public P03_Login(WebDriver driver){
        this.driver=driver;
    }
    //Todo define Locators
    private final By loginEmail= By.xpath("//input[@class=\"email\"]");
    private final By loginPassword=By.id("Password");
    private final By loginButton=By.xpath("//button[@class=\"button-1 login-button\"]");
    private final By forgetPasswordLink=By.xpath("//a[@href=\"/passwordrecovery\"]");

    //Todo define Methods
    public P03_Login insertEmail(String email){
        driver.findElement(this.loginEmail).sendKeys(email);
        return this;
    }
    public P03_Login insertPassword(String password){
        driver.findElement(this.loginPassword).sendKeys(password);
        return this;
    }
public P03_Login clickLoginButton(){
        driver.findElement(this.loginButton).click();
        return this;
}
public P03_Login clickForgetPasswordlink(){
        driver.findElement(this.forgetPasswordLink).click();
        return this;
}

    ///////////////////////////////Old code design/////////////////////////////////
/*
    //Todo define Constructor
    public  P03_Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Todo define Locator
    @FindBy(xpath = "//input[@class=\"email\"]")
    WebElement loginEmail;

    @FindBy(id = "Password")
    WebElement loginPassword;
    @FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
    WebElement loginButton;

    @FindBy(xpath = "//a[@href=\"/passwordrecovery\"]")
    WebElement forgetPasswordLink;

    //Todo Define methods
    public void insertEmail(String loginEmail){
        this.loginEmail.sendKeys(loginEmail);
    }

    public void insertPassword(String loginPassword){
        this.loginPassword.sendKeys(loginPassword);
    }

    public void clickLoginButton(){
        this.loginButton.click();
    }
    public void clickForgetPasswordlink(){
        forgetPasswordLink.click();
    }
 */
}


