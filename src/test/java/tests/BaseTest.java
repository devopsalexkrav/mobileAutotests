package tests;

import com.codeborne.selenide.WebDriverRunner;
import config.MobileDriverProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        MobileDriverProvider.startDriver();
    }

    @AfterMethod
    public void tearDown(){
        WebDriverRunner.getWebDriver().quit();
    }
}
