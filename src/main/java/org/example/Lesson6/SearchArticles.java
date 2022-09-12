package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchArticles extends AbstractPage {

    @FindBy(id = "searchInput")
    private WebElement searchInputButton;

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(id = "searchButton")
    private WebElement searchButton;
    public SearchArticles(WebDriver driver) {
        super(driver);
    }

    public void searchArticles(String searchInput){
        Actions searchArticles = new Actions(getDriver());
        searchArticles
                .click(this.searchInputButton)
                .sendKeys(this.searchInput,searchInput)
                .click(this.searchButton)
                .build()
                .perform();
    }
}
