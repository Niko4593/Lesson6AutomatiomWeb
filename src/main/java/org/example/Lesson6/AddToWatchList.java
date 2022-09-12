package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddToWatchList extends AbstractPage{

    @FindBy(id = "searchInput")
    private WebElement search;

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"ca-watch\"]/a")
    private WebElement addWL;

    public AddToWatchList(WebDriver driver) {
        super(driver);
    }

    public void addWatchList (String searchInput){
        Actions addWatchList = new Actions(getDriver());
        addWatchList
                .click(search)
                .sendKeys(this.searchInput, searchInput)
                .click(searchButton)
                .click(addWL)
                .build()
                .perform();
    }
}
