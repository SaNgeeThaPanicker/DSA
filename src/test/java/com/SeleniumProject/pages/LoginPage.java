package com.SeleniumProject.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{
    WebDriver driver;
    //constructor
    public LoginPage(WebDriver lDriver)
    {
        this.driver=lDriver;

        PageFactory.initElements(driver,this);
    }
    @FindBy(css=".font10 > .makeFlex > p") WebElement accountButton;
    @FindBy(css=".landingSprite2") WebElement signInButton;
    @FindBy(id="webklipper-publisher-widget-container-notification-close-div") WebElement bannerClose;

    public void loginToPortal() throws InterruptedException {
//        accountButton.click();
        Thread.sleep(3000);
        bannerClose.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);
//        signInButton.click();
//        Thread.sleep(8000);


    }
}
