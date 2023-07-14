package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends Utility {
    By userName = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");

    By loginButton = By.xpath("//button[text()=' Login ']");
    By logoAtPage = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By loginText = By.tagName("h5");

    public void enterUserName(String option) {
        sendTextToElement(userName, option);
    }

    public void enterPassword(String option) {
        sendTextToElement(password, option);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }

    public String getLoginText() {
        return getTextFromElement(loginText);
    }

    public void verifyCompanyLogo()
    {
        WebElement loginLogo = driver.findElement(logoAtPage);
        Assert.assertEquals(true, loginLogo.isDisplayed());
    }
}
