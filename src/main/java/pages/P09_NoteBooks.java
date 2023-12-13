package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_NoteBooks {
    //Todo declare Webdriver
    WebDriver driver;

    //Todo Constructor
    public P09_NoteBooks(WebDriver driver){
        this.driver=driver;
    }
    //Todo define locators
    private final By noteBooksCompareButton= By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]");

//Todo define methods

    public P09_NoteBooks clickOnNoteBooksCompareButton(){
        driver.findElement(this.noteBooksCompareButton).click();
        return this;
    }

}
