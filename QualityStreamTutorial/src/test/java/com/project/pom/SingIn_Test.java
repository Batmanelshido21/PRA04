package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SingIn_Test {

    private WebDriver driver;
    SingInPage singInPage;

    @Before
    public void setUp() throws Exception {
        singInPage = new SingInPage(driver);
        driver = singInPage.chromeDriverConnection();
        singInPage.visit("http://demo.guru99.com/test/newtours/");
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        singInPage.singIn();
        Thread.sleep(2000);
       assertTrue(singInPage.isHomePageDisplayed());
    }
}