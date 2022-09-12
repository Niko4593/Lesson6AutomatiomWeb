package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ViewHistory extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"ca-history\"]/a/span")
    private WebElement viewHistoryButton;

    @FindBy(xpath = "//*[@id=\"mw-history-search\"]/legend/span[2]")
    private WebElement filterRevisionsButton;

    @FindBy(name = "tagfilter")
    private WebElement filterInput;

    @FindBy(xpath = "//*[@id=\"tagfilter\"]/div/span/a/span[3]")
    private WebElement turnButton;

    @FindBy(xpath = "//*[@id=\"ooui-php-7\"]/button/span[2]")
    private WebElement showRevisionsButton;

    public ViewHistory(WebDriver driver) {
        super(driver);
    }

    public void viewHistory(String filterInput){
        Actions viewHistory = new Actions(getDriver());
        viewHistory
                .click(this.viewHistoryButton)
                .click(this.filterRevisionsButton)
                .sendKeys(this.filterInput, filterInput)
                .click(this.turnButton)
                .click(this.showRevisionsButton)
                .build()
                .perform();
    }
}
