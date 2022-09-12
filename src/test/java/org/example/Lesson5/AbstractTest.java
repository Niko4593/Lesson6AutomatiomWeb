package org.example.Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AbstractTest {


    static WebDriver driver;

    Boolean myBoolean = true;
    String myString = "GeekBrains";

    @BeforeAll
    static void initialization(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a/span"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.id("wpName1"));
        webElement2.sendKeys("Evil Morrty");

        WebElement webElement3 = driver.findElement(By.id("wpPassword1"));
        webElement3.sendKeys("XASm5BX/.hNC)z&");

        WebElement webElement4 = driver.findElement(By.id("wpLoginAttempt"));
        webElement4.click();
    }

    @BeforeEach
    void startPage(){
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
    }

    @AfterAll
    static void quit(){
        driver.quit();
    }
}
