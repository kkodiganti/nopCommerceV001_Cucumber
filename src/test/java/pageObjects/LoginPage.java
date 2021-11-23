package pageObjects;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.lang.System;

public class LoginPage {

    public WebDriver ldriver;

   /*@Before
    public void browser(){
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        ldriver = new ChromeDriver();
    }

    @After
    public void close(){
        ldriver.quit();
    }*/


    public LoginPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id="Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id="Password")
    @CacheLookup
    WebElement txtPassword;

    //@FindBy(xpath="//input[@value='Log in']")
    //@FindBy(xpath = "//input[@class='button-1 login-button']")
    //@FindBy(how = How.XPATH, using="//input[@class='button-1 login-button']")
    //@FindBy(xpath="//input[@value='submit']")
    @FindBy( css = ".button-1.login-button")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(linkText="Logout")
    @CacheLookup
    WebElement lnkLogout;

    public void setUserName(String uname) {
        txtEmail.clear();
        txtEmail.sendKeys(uname);

    }

    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

    public void clickLogout()
    {
        lnkLogout.click();
    }

}
