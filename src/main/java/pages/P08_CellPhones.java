package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_CellPhones {
    //Todo declare web driver
    WebDriver driver;
    //Todo constractor
    public P08_CellPhones(WebDriver driver){
        this.driver=driver;
    }
    //Todo define Locators
    private final By favoriteCellPhonesButton= By.xpath("//button [@class=\"button-2 add-to-wishlist-button\"]");

    //Todo define methods

    public P08_CellPhones clickCellPhonesFavoriteButton(){
        driver.findElement(favoriteCellPhonesButton).click();
        return  this;

    }

}
