package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static util.Utility.*;

public class P05_HomePageAfterLogin {
    //Todo declare web driver
    WebDriver driver;
    //Todo constructor
    public P05_HomePageAfterLogin(WebDriver driver){
        this.driver=driver;
    }
    //Todo Define Locators
    private final By searchField=By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]");
    private final By searchButton=By.xpath("//button[@class=\"button-1 search-box-button\"]");
   private final By selectedCurrency=By.id("customerCurrency");
   private final By computersLink=By.xpath("(//a)[11]");
   private final By booksLink=By.xpath("//a[@href=\"/books\"]");
   private final By apperalLink=By.xpath("(//a)[19]");
   private final By electronicsLink=By.xpath("(//a)[15]");
   private final By shoesLink=By.xpath("(//a)[15]");
   private final By randomMenuLink=By.xpath("(//a)["+generateRandomNumberFromList()+"]");
   private final By randomCategory=By.xpath("//li[@class=\\\"inactive\\\"][\"+generateRandomInt(6)+\"]");
    private final By cellPhoneLink=By.xpath("//a[@href=\"/cell-phones\"]");
    private final By noteBooksLink=By.xpath("//a[@href=\"/notebooks\"]");

    //Todo Define Methods
    public P05_HomePageAfterLogin hoverOnRandomMenuLink() {
        Actions action = new Actions(driver);
        WebElement randomCategory = driver.findElement(randomMenuLink);
        action.moveToElement(randomCategory).build().perform();
        return this;
    }
    public P05_HomePageAfterLogin hoverOnComputersMenu(){
        Actions action= new Actions(driver);
        WebElement computerCategory= driver.findElement(computersLink);
        action.moveToElement(computerCategory).build().perform();
        return this;
    }
    public P05_HomePageAfterLogin hoverOnElectronicsLink(){
        Actions action=new Actions(driver);
       WebElement electronicCategory =driver.findElement(this.electronicsLink);
        action.moveToElement(electronicCategory).build().perform();
        return  this;
    }

    public P05_HomePageAfterLogin selectRandomCategoryUnderComputersMenu() {
        driver.findElement(By.xpath("")).click();
        return this;
    }
    public P05_HomePageAfterLogin selectCellPhones(){
        driver.findElement(this.cellPhoneLink).click();
        return this;
    }
public P05_HomePageAfterLogin selectNoteBooksLink(){
        driver.findElement(this.noteBooksLink).click();
        return this;
}

    public P05_HomePageAfterLogin ClickOnBookLink(){
       driver.findElement(this.computersLink).click();
       return this;
    }
    public P05_HomePageAfterLogin hoverOnApperalLink(){
        Actions action =new Actions(driver);
       WebElement apparelLink= driver.findElement(this.apperalLink);
        action.moveToElement(apparelLink).build().perform();
        return this;
    }
    public P05_HomePageAfterLogin selectShoesFromAppreallink(){
        driver.findElement(this.shoesLink).click();
        return this;
    }
    public P05_HomePageAfterLogin clickOnBooksLink(){
        driver.findElement(this.booksLink).click();
        return this;
    }
    public P05_HomePageAfterLogin selectRandomCategory(){
        driver.findElement(this.randomCategory).click();
        return this;
    }

    public P05_HomePageAfterLogin selectCurrency(String selectedCurrency){
        WebElement currency= driver.findElement(this.selectedCurrency);
        Select currencyDropDownList= new Select(currency);
        currencyDropDownList.selectByVisibleText(selectedCurrency);
        return this;
    }
    public P05_HomePageAfterLogin typeSearchKeywordOnProductSerachFiield(String searchKeyword){
        driver.findElement(this.searchField).sendKeys(searchKeyword);
        return this;
    }
    public  P05_HomePageAfterLogin clickOnSearchButton(){
        driver.findElement(this.searchButton).click();
        return this;

    }
    //////////////////////////////Old Code Design//////////////////////////
    /*
   WebDriver driver;
    //Todo define Constructor
    public P05_HomePageAfterLogin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Todo define locator
    @FindBy(xpath = "//input[@class=\"search-box-text ui-autocomplete-input\"]")
    WebElement searchField;
    @FindBy(xpath = "//button[@class=\"button-1 search-box-button\"]")
    WebElement searchButton;
    @FindBy(id = "customerCurrency")
    WebElement selectedCurrency;
    @FindBy(xpath ="(//a)[6]" )
    WebElement computersLink;
    @FindBy(xpath ="(//a)[19]" )
    WebElement booksLink;

    @FindBy(xpath ="(//a)[14]" )
    WebElement apperalLink;
    @FindBy(xpath = "(//a)[15]")
    WebElement shoesLink;



    //Todo define methods
    public void hoverOnRandomMenuLink() {
        Actions action = new Actions(driver);
        WebElement randomCategory = driver.findElement(By.xpath("(//a)[" + generateRandomNumberFromList() + "]"));
        action.moveToElement(randomCategory).build().perform();
    }
    public void selectRandomCategoryUnderComputersMenu() {
        WebElement randomCategory = driver.findElement(By.xpath("(//a)[" + generateRandomNumberFromComputersCategoryList() + "]"));
        randomCategory.click();
    }
    public void hoverOnComputersMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(computersLink).build().perform();
    }
    public void ClickOnBookLink(){
        booksLink.click();

    }
    public void hoverOnApperalLink(){
        Actions action =new Actions(driver);
        action.moveToElement(apperalLink).build().perform();
    }
    public void selectShoesFromAppreallink(){
        shoesLink.click();
    }

    public void selectRandomcategory(){
        driver.findElement(By.xpath("//li[@class=\"inactive\"]["+generateRandomInt(6)+"]")).click();
    }

    public void selectCurrency(String text){
        Select currency= new Select(selectedCurrency);
        currency.selectByVisibleText(text);
    }
    public void typeSearchKeywordOnProductSerachFiield(String searchKeyword){
        searchField.sendKeys(searchKeyword);
    }
public  void clickOnSearchButton(){
        searchButton.click();

}
     */

}
