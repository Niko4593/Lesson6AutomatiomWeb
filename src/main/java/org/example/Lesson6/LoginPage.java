package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"pt-login\"]/a/span")
    private WebElement login;

    @FindBy(id = "wpName1")
    private WebElement usernameInput;

    @FindBy(id = "wpPassword1")
    private WebElement passwordInput;

    @FindBy(id = "wpLoginAttempt")
    private WebElement EnterAnAccount;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void loginButton (String usernameInput, String passwordInput ){
        Actions loginButton = new Actions(getDriver());
        loginButton
                .sendKeys(this.usernameInput,usernameInput)
                .sendKeys(this.passwordInput,passwordInput)
                .click(this.EnterAnAccount)
                .build()
                .perform();
    }

}
