package org.example.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ViewHistoryTest extends AbstractTest{

    @Test
    void viewHistory(){
        new MainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().findElement(By.xpath("//*[@id=\"pt-login\"]/a/span")).getText().equals("Log in"));
        new LoginPage(getWebDriver())
                .loginButton("Evil Morrty","XASm5BX/.hNC)z&");
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Main_Page",getWebDriver().getCurrentUrl());
        new ViewHistory(getWebDriver())
                .viewHistory(myString);
        Assertions.assertEquals("GeekBrains", myString, "No matching revisions were found");
    }
}
