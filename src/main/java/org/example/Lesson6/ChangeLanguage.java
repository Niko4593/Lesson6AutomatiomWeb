package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ChangeLanguage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"p-lang\"]/div/ul/li[35]/a/span")
    private WebElement rus;

    public ChangeLanguage(WebDriver driver) {
        super(driver);
    }

    public void changeLanguage(){
        Actions changeLanguage = new Actions(getDriver());
        changeLanguage
                .click(this.rus)
                .build()
                .perform();
    }
}