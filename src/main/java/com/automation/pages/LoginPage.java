package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By email = By.id("Email");
    By password = By.id("Password");
    By submit = By.xpath("//button[contains(.,'Log in')]");

    public void login(String user, String pass) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(email))
                .sendKeys(user);

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(password))
                .sendKeys(pass);

        wait.until(
                ExpectedConditions.elementToBeClickable(submit))
                .click();

    }
}