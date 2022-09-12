package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckNotices extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"pt-notifications-notice\"]/a")
    private WebElement alerts;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[2]/div/a/div[2]/div[1]/div/div")
    private WebElement notification;

    public CheckNotices(WebDriver driver) {
        super(driver);
    }

    public void checkNotices(){
        Actions checkNotices = new Actions(getDriver());
        checkNotices
                .click(this.alerts)
                .click(this.notification)
                .build()
                .perform();
    }
}
