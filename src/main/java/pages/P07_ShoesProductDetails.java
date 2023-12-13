package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P07_ShoesProductDetails {
    //Todo declare web driver
    WebDriver driver;
    //Todo construcor
    public P07_ShoesProductDetails(WebDriver driver){
        this.driver=driver;
    }
    //Todo Locators
    private final By addToCartButton= By.id("add-to-cart-button-25");
    private final By shoesSizeDropDownList=By.id("product_attribute_9");
    //Todo methods
    public P07_ShoesProductDetails clickOnAddtoCartButton(){
        driver.findElement(this.addToCartButton);
        return this;
    }
    public P07_ShoesProductDetails selectShoesSize(int index){
        WebElement shoesSizeList= driver.findElement(this.shoesSizeDropDownList);
        Select selectedShoesSize= new Select(shoesSizeList);
        selectedShoesSize.selectByIndex(index);
        return this;
    }

    ///////////////////////////////Old Code Redesign//////////////////////////////
    /*
    //Todo constructor
    public P07_ShoesProductDetails(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //Todo define Locator
    @FindBy(id="add-to-cart-button-25")
    WebElement addToCartButton;

    @FindBy(id="product_attribute_9")
    WebElement sizeDropDownList;

    //Todo define method
    public void clickOnAddtoCartButton(){
        addToCartButton.click();
    }

    public void selectSize(int index){
      Select select=new Select(sizeDropDownList);
      select.selectByIndex(index);
    }

     */
}
