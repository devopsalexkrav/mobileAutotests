package steps;

import pages.LoginPage;

public class LoginPageSteps {
    private LoginPage loginPage = new LoginPage();

    public void login(String login, String password) {
        loginPage.enterLogin(login);
        loginPage.enterPassword(password);
        loginPage.tapVhodButton();
    }

    public void checkLoginField(String expectedText) {
        loginPage.checkLoginField(expectedText);
    }

    public void checkDefaultStateAfterStartApp() {
        loginPage.checkTitleIsDisplayed();
        loginPage.checkLoginPlaceholderIsDisplayed();
        loginPage.checkPasswordPlaceholderIsDisplayed();
        loginPage.checkShowPasswordButtonIsDisplayed();
        loginPage.checkVhodButtonIsDisplayed();
    }

    public void checkErrorMessageIsDisplayed(String errorMessage) {
        loginPage.checkErrorMessageIsDisplayed(errorMessage);
    }
}
