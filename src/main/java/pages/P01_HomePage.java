package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage {
    //Todo Declare web driver
    WebDriver driver;
    //Todo create page constructor
    public P01_HomePage(WebDriver driver){
        this.driver=driver;
    }
    //Todo define locator
    private final By registerLink=(By.xpath("(//a)[1]"));
    private  final By loginLink=(By.xpath("(//a)[2]"));
    //Todo define methods
    public P01_HomePage clickRegisterLink(){
        driver.findElement(this.registerLink).click();
        return this;
    }
    public P01_HomePage clickLoginLink(){
        driver.findElement(this.loginLink).click();
        return this;
    }

    //////////////////////Old Code design/////////////////////////
    //Old Code design
    /*//1-Todo define constructor
    public P01_HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //2-Todo define elecotors
    @FindBy(xpath ="(//a)[1]" )
    WebElement registerLink;
    @FindBy (xpath="(//a)[2]")
    WebElement loginLink;
    //3-Todo define action method
    public void clickRegisterLink() {
        this.registerLink.click();
    }
    public void clickLoginLink(){
        this.loginLink.click();
    }*/
}
