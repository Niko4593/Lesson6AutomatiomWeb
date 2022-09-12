package org.example.Lesson5;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class Lesson5HW extends AbstractTest{




    @Test
    void search() {

        WebElement webElement1 = driver.findElement(By.id("searchInput"));
        webElement1.click();
        webElement1.sendKeys("GeekBrains");

        WebElement webElement2 = driver.findElement(By.id("searchButton"));
        webElement2.click();

        assertEquals("GeekBrains", myString, "Wrong value raw of search");
    }

    @Test
    void addToWatchlist() throws InterruptedException {

        //Search
        WebElement webElement1 = driver.findElement(By.id("searchInput"));
        webElement1.click();
        webElement1.sendKeys("GeekBrains");
        WebElement webElement2 = driver.findElement(By.id("searchButton"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"ca-watch\"]/a"));
        webElement3.click();

        Assertions.assertTimeout(ofMillis(10), () -> {
            Thread.sleep(200);
            return "result";
        });

    }

    @Test
    void changeLanguage() throws InterruptedException {

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"p-lang\"]/button"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"languagesettings-settings-panel\"]/div/div[2]/div[2]/div/button[2]"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"language-settings-dialog\"]/div[3]/div/button[2]"));
        webElement3.click();

        Assertions.assertEquals("Change language",driver.getTitle(),"Wrong page");
    }

    @Test
    void addEMail() throws NoSuchElementException {
        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"pt-userpage\"]/a/span"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[1]/div[1]/div/div/span[2]/a"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.name("wpNewEmail"));
        webElement3.sendKeys("Test@mail.ru");

        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"ooui-php-8\"]/button/span[2]"));
        webElement4.click();

        Assertions.assertThrows(NoSuchElementException.class, ()-> getException(),"Element not found");
    }

    @Test
    void viewHistory(){
        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"ca-history\"]/a/span"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"mw-history-search\"]/legend/span[2]"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.name("tagfilter"));
        webElement3.sendKeys(myString);

        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"tagfilter\"]/div/span/a/span[3]"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"ooui-php-7\"]/button/span[2]"));
        webElement5.click();

        assertEquals("GeekBrains", myString, "No matching revisions were found");
    }

    @Test
    void checkNotices(){
        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"pt-notifications-notice\"]/a"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/div/a/div[2]/div[1]/div/div"));
        webElement2.click();

        Assertions.assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            Thread.sleep(200);
            return "result";
        });
    }

    private String getException() throws NoSuchElementException{
        if(myBoolean) throw new NoSuchElementException("Element not found");
        return "result";
    }
}
