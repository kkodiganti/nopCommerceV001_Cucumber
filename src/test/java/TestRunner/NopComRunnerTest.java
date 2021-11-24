package TestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/Login.feature"},
        glue="stepDefinitions",
        monochrome=true,
        plugin= {"pretty", "html:test-output"})
public class NopComRunnerTest {

}
