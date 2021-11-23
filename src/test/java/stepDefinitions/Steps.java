package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.LoginPage;

public class Steps {

    WebDriver driver;
    LoginPage lp;

    @Given("^user launches Chrome browser$")
    public void user_launches_Chrome_browser() throws Throwable {
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
        /*ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--remote-debugging-port=9225");*/
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/opt/homebrew/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
    }

    @When("^User opens URL \"([^\"]*)\"$")
    public void user_opens_url(String url) throws Throwable {
        driver.get(url);
    }

    @Then("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enters_email_as_and_password_as(String user, String psd) throws Throwable {
        lp.setUserName(user);
        lp.setPassword(psd);
    }

    @Then("^Click on Login$")
    public void click_on_login() throws Throwable {
        lp.clickLogin();
    }

    @Then("^Page Title should be \"([^\"]*)\"$")
    public void page_title_should_be(String title) throws Throwable {
        String title1 = driver.getTitle();
        System.out.println(title1);
    }

    @Then("^Close Browser$")
    public void close_browser() throws Throwable {
        driver.quit();
    }

}