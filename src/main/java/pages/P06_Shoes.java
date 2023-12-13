package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static util.Utility.generateRandomNumberFromColorList;

public class P06_Shoes {
    //Todo declare web driver
    WebDriver driver;
    //Todo constructo
    public P06_Shoes(WebDriver driver){
        this.driver=driver;
    }
    //Todo define locators
    private final By grayColorFilter=By.id("attribute-option-14");
    private final By redColorFilter=By.id("attribute-option-15");
    private final By blueColorFilter=By.id("attribute-option-16");
    private final By randomColorFilter=By.xpath("//input[@id=\\\"attribute-option-\"+generateRandomNumberFromColorList()+\"\\\"]");
    private final By addToCartButton=By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]");

    //Todo define methods
    public P06_Shoes selectRandomColorFilter(){
        driver.findElement(this.randomColorFilter);
        return this;
    }
    public P06_Shoes clickOnAddToCardButton(){
        driver.findElement(this.addToCartButton);
        return this;
    }

    //////////////////////////Old Code redesign /////////////////////
    /*
    WebDriver driver;
    //Todo constructor
     public P06_Shoes(WebDriver driver){
        this.driver= driver ;
         PageFactory.initElements(driver, this);
    }
    //Todo Locators
    @FindBy(id= "attribute-option-14")
    WebElement grayColorFilter;
    @FindBy(id = "attribute-option-15")
    WebElement redColorFilter;
    @FindBy(id = "attribute-option-16")
    WebElement blueColorFilter;
    @FindBy(xpath = "//button[@class=\"button-2 product-box-add-to-cart-button\"]")
    WebElement addToCartButton;

    //Todo methods
    public void selectGrayColorFilter(){
        grayColorFilter.click();
    }
    public void selectRedColorFilter(){
        redColorFilter.click();
    }
    public void selectBlueColorFilter(){
        blueColorFilter.click();
    }
    public void selectRandomColorFilter(){
      driver.findElement(By.xpath("//input[@id=\"attribute-option-"+generateRandomNumberFromColorList()+"\"]")).click();
    }
    public void clickOnAddToCardButton(){
        addToCartButton.click();
    }

     */
}
