package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends Base {

    By userLocator = By.name("userName");
    By passLocator = By.name("password");
    By singInBtnLocator = By.name("submit");

    By homePageLocator = By.xpath("//img[@src='/images/masts_flightfinder.gif']");

    public SingInPage(WebDriver driver){
        super(driver);
    }

    public void singIn() {
        if(isDisplayed(userLocator)) {
            type("qualityadmin", userLocator);
            type("pass1", passLocator);
            click(singInBtnLocator);
        }
        else{
            System.out.println("username textbox was not present");
        }
    }

    public boolean isHomePageDisplayed() {
        return isDisplayed(homePageLocator);
    }

}