package tests;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.MobileDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import listeners.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import steps.LoginPageSteps;
import steps.MainPageSteps;

@Listeners(TestListener.class)
public class BaseTest {
    protected LoginPageSteps loginPageSteps = new LoginPageSteps();
    protected MainPageSteps mainPageSteps = new MainPageSteps();

    @BeforeSuite(alwaysRun = true)
    public void performSettings() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().includeSelenideSteps(false));
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        MobileDriverProvider.createDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        WebDriverRunner.getWebDriver().quit();
    }
}
