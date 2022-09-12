package org.example.Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AbstractTest {
    static WebDriver driver;

    String myString = "GeekBrains";

    @BeforeAll
    static void setDriver(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadTimeout(Duration.ofSeconds(10));

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeEach
    void startPage(){
        Assertions.assertDoesNotThrow( ()-> getWebDriver().navigate().to("https://en.wikipedia.org/wiki/Main_Page"),
                "Страница не доступна");
        Assertions.assertTrue(true);    }

    @AfterAll
    static void quit(){
        if(driver !=null) driver.quit();
    }

//    @AfterEach
//    public void checkBrowser(){
//        List<LogEntry> allLogRows = getWebDriver().manage().logs().get(LogType.BROWSER).getAll();
//        if(!allLogRows.isEmpty()){
//
//            if (allLogRows.size() > 0 ) {
//                allLogRows.forEach(logEntry -> {
//                    System.out.println(logEntry.getMessage());
//                });
//
//            }
//
//        }
//
//    }

    public WebDriver getWebDriver(){
        return this.driver;
    }
}