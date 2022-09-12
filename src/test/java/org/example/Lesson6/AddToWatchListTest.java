package org.example.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static java.time.Duration.ofMillis;

public class AddToWatchListTest extends AbstractTest {

    @Test
    void addWatchList(){
        new MainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().findElement(By.xpath("//*[@id=\"pt-login\"]/a/span")).getText().equals("Log in"));
        new LoginPage(getWebDriver())
                .loginButton("Evil Morrty","XASm5BX/.hNC)z&");
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Main_Page",getWebDriver().getCurrentUrl());
        new AddToWatchList(getWebDriver())
                .addWatchList(myString);
        Assertions.assertTimeout(ofMillis(10), () -> {
            Thread.sleep(200);
            return "result";
        });
    }
}
