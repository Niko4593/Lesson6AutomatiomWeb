package org.example.Lesson6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageTest extends AbstractTest {

    @Test
    void LoginIn(){
        new MainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().findElement(By.xpath("//*[@id=\"pt-login\"]/a/span")).getText().equals("Log in"));
        new LoginPage(getWebDriver())
                .loginButton("Evil Morrty","XASm5BX/.hNC)z&");
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Main_Page",getWebDriver().getCurrentUrl());

    }

    @AfterEach
    void logOut(){
        new AccountPage(getWebDriver()).logOut();
        new WebDriverWait(getWebDriver(),Duration.ofSeconds(3));
        Assertions.assertTrue(getWebDriver().findElement(By.xpath("//*[@id=\"pt-logout\"]/a/span")).getText().equals("Log out"));
    }
}
