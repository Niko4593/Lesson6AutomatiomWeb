package org.example.Lesson6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"pt-logout\"]/a/span")
    private WebElement exit;

    public AccountPage(WebDriver driver){
        super(driver);
    }


    public void logOut(){
        this.exit.click();

    }
}
