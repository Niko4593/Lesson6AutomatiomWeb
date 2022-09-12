package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class MainPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"pt-login\"]/a/span")
    private WebElement login;



    public MainPage(WebDriver driver) {
        super(driver);
    }


    public void goToAccountPage(){
        login.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://en.wikipedia.org/w/"));
    }
}