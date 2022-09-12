//package org.example.Lesson3;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class WikiAutoTests {
//    public static void main( String[] args ) {
//
//        LogIn();
//        Search();
//        AddToWatchlist();
//        ChangeLanguage();
//    }
//
//    private static void LogIn () {
//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//
//        //Entering an account
//        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a/span"));
//        webElement1.click();
//
//        WebElement webElement2 = driver.findElement(By.id("wpName1"));
//        webElement2.sendKeys("Evil Morrty");
//
//        WebElement webElement3 = driver.findElement(By.id("wpPassword1"));
//        webElement3.sendKeys("XASm5BX/.hNC)z&");
//
//        WebElement webElement4 = driver.findElement(By.id("wpLoginAttempt"));
//        webElement4.click();
//
//        driver.quit();
//    }
//
//    private static void Search () {
//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//
//        //Entering an account
//        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a/span"));
//        webElement1.click();
//        WebElement webElement2 = driver.findElement(By.id("wpName1"));
//        webElement2.sendKeys("Evil Morrty");
//        WebElement webElement3 = driver.findElement(By.id("wpPassword1"));
//        webElement3.sendKeys("XASm5BX/.hNC)z&");
//        WebElement webElement4 = driver.findElement(By.id("wpLoginAttempt"));
//        webElement4.click();
//
//        //Search
//        WebElement webElement5 = driver.findElement(By.id("searchInput"));
//        webElement5.click();
//        webElement5.sendKeys("GeekBrains");
//
//        WebElement webElement6 = driver.findElement(By.id("searchButton"));
//        webElement6.click();
//
//        driver.quit();
//    }
//
//    private static void AddToWatchlist() {
//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//
//        //Entering an account
//        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a/span"));
//        webElement1.click();
//        WebElement webElement2 = driver.findElement(By.id("wpName1"));
//        webElement2.sendKeys("Evil Morrty");
//        WebElement webElement3 = driver.findElement(By.id("wpPassword1"));
//        webElement3.sendKeys("XASm5BX/.hNC)z&");
//        WebElement webElement4 = driver.findElement(By.id("wpLoginAttempt"));
//        webElement4.click();
//
//        //Search
//        WebElement webElement5 = driver.findElement(By.id("searchInput"));
//        webElement5.click();
//        webElement5.sendKeys("GeekBrains");
//        WebElement webElement6 = driver.findElement(By.id("searchButton"));
//        webElement6.click();
//
//        //Adding to my watchlist
//        WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"ca-watch\"]/a"));
//        webElement7.click();
//
//        driver.quit();
//    }
//
//    private static void ChangeLanguage(){
//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//
//        //Entering an account
//        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a/span"));
//        webElement1.click();
//        WebElement webElement2 = driver.findElement(By.id("wpName1"));
//        webElement2.sendKeys("Evil Morrty");
//        WebElement webElement3 = driver.findElement(By.id("wpPassword1"));
//        webElement3.sendKeys("XASm5BX/.hNC)z&");
//        WebElement webElement4 = driver.findElement(By.id("wpLoginAttempt"));
//        webElement4.click();
//
//        //Change language
//        WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"p-lang\"]/button"));
//        webElement5.click();
//
//        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"languagesettings-settings-panel\"]/div/div[2]/div[2]/div/button[2]"));
//        webElement6.click();
//
//        WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"language-settings-dialog\"]/div[3]/div/button[2]"));
//        webElement7.click();
//
//        driver.quit();
//    }
//}