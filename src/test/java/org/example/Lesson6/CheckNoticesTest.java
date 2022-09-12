package org.example.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class CheckNoticesTest extends AbstractTest {

    @Test
    void CheckNotices(){
        new MainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().findElement(By.xpath("//*[@id=\"pt-login\"]/a/span")).getText().equals("Log in"));
        new LoginPage(getWebDriver())
                .loginButton("Evil Morrty","XASm5BX/.hNC)z&");
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Main_Page",getWebDriver().getCurrentUrl());
        new CheckNotices(getWebDriver())
                .checkNotices();
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            Thread.sleep(200);
            return "result";
        });
    }
}
