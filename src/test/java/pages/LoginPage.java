package pages;

import com.codeborne.selenide.appium.SelenideAppiumElement;
import com.codeborne.selenide.appium.selector.CombinedBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static org.openqa.selenium.By.xpath;

public class LoginPage {
    private SelenideAppiumElement loginField = $(CombinedBy.android(xpath("//android.widget.EditText[@resource-id='com.alfabank.qapp:id/etUsername']")))
            .as("loginField");

    private SelenideAppiumElement title = $(CombinedBy.android(xpath("//android.widget.TextView[@resource-id='com.alfabank.qapp:id/tvTitle']")))
            .as("title");

    private SelenideAppiumElement showPasswordButton = $(CombinedBy.android(xpath("//android.widget.ImageButton[@resource-id='com.alfabank.qapp:id/text_input_end_icon']")))
            .as("showPasswordButton");

    private SelenideAppiumElement errorMessageLabel = $(CombinedBy.android(xpath("//android.widget.TextView[@resource-id='com.alfabank.qapp:id/tvError']")))
            .as("errorMessageLabel");

    private SelenideAppiumElement passwordField = $(CombinedBy.android(xpath("//android.widget.EditText[@resource-id='com.alfabank.qapp:id/etPassword']")))
            .as("passwordField");

    private SelenideAppiumElement vhodButton = $(CombinedBy.android(xpath("//android.widget.Button[@resource-id='com.alfabank.qapp:id/btnConfirm']")))
            .as("vhodButton");

    @Step("enterLogin")
    public void enterLogin(String login){
        loginField.shouldBe(visible).setValue(login);
    }

    @Step("checkLoginField}")
    public void checkLoginField(String expectedText){
        loginField.shouldBe(visible).shouldHave(exactText(expectedText));
    }

    @Step("enterPassword")
    public void enterPassword(String password){
        passwordField.shouldBe(visible).setValue(password);
    }

    @Step("checkErrorMessageIsDisplayed")
    public void checkErrorMessageIsDisplayed(String errorMessage){
        errorMessageLabel.shouldBe(visible).shouldHave(exactText("%s".formatted(errorMessage)));
    }

    @Step("tapVhodButton")
    public void tapVhodButton(){
        vhodButton.shouldBe(visible).click();
    }

    @Step("checkVhodButtonIsDisplayed")
    public void checkVhodButtonIsDisplayed(){
        vhodButton.shouldBe(visible).shouldHave(exactText("Вход"));
    }

    @Step("checkShowPasswordButtonIsDisplayed")
    public void checkShowPasswordButtonIsDisplayed(){
        showPasswordButton.shouldBe(visible);
    }

    @Step("tapShowPasswordButtonIsDisplayed")
    public void tapShowPasswordButtonIsDisplayed(){
        showPasswordButton.shouldBe(visible).click();
    }

    @Step("checkTitleIsDisplayed")
    public void checkTitleIsDisplayed(){
        title.shouldBe(visible).shouldHave(exactText("Вход в Alfa-Test"));
    }

    @Step("checkLoginPlaceholder")
    public void checkLoginPlaceholderIsDisplayed(){
        loginField.shouldBe(visible).shouldHave(attribute("hint", "Логин"));
    }

    @Step("checkPasswordPlaceholder")
    public void checkPasswordPlaceholderIsDisplayed(){
        passwordField.shouldBe(visible).shouldHave(attribute("hint", "Пароль"));
    }
}
