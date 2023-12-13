package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_Books {
    //Todo declare web driver
    WebDriver driver;
    //Todo constructor
    public P10_Books(WebDriver driver){
        this.driver=driver;
    }

//Todo define Locators
    private final By addBooksToCartButton= By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]");
    private final By closeButtonForAddToShoppingCartMessage=By.xpath("//span[@class=\"close\"]");
    private final By shoppingCartLinkINBooksPage=By.xpath("//span[@class=\"cart-label\"]");

    //Todo define methods
    public P10_Books clickOnAddBooksToCart(){
        driver.findElement(addBooksToCartButton).click();
        return this;
    }
    public P10_Books clickOnCloseButtonAfterAddingBooksToShoppingCart(){
        driver.findElement(closeButtonForAddToShoppingCartMessage).click();
        return this;
    }
    public P10_Books clickOnShoppingCartInBooksPage(){
        driver.findElement(this.shoppingCartLinkINBooksPage).click();
        return this;
    }
}