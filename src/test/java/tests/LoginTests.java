package tests;

import config.configReader.ConfigReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.TextUtils;

public class LoginTests extends BaseTest {
    private static final String LOGIN = ConfigReader.login();
    private static final String PASSWORD = ConfigReader.password();

    @Test
    public void validLoginValidPasswordTest() {
        loginPageSteps.login(LOGIN, PASSWORD);
        mainPageSteps.checkSuccessLoginLabelIsDisplayed();
    }

    @Test
    public void invalidLoginInvalidPasswordTest() {
        loginPageSteps.login("Loginn", "Passwordd");
        loginPageSteps.checkErrorMessageIsDisplayed("Введены неверные данные");
    }

    @Test
    public void defaultStateAfterAppStartTest() {
        loginPageSteps.checkDefaultStateAfterStartApp();
    }

    @Test(dataProvider = "invalidLogins")
    public void invalidLoginValidPasswordTest(String login) {
        loginPageSteps.login(login, PASSWORD);
        loginPageSteps.checkErrorMessageIsDisplayed("Введены неверные данные");
    }

    @DataProvider(name = "invalidLogins")
    public Object[][] getInvalidLogins() {
        return new Object[][]{
                {"##"},
                {"!!!"},
        };
    }

    @Test()
    public void loginCharMoreLimitTest() {
        String randomText = TextUtils.getRandomText(60);
        loginPageSteps.login(randomText, PASSWORD);
        loginPageSteps.checkLoginField(randomText.substring(0, randomText.length() - 10));
    }
}
