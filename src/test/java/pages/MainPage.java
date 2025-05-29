package pages;

import com.codeborne.selenide.appium.SelenideAppiumElement;
import com.codeborne.selenide.appium.selector.CombinedBy;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static org.openqa.selenium.By.xpath;

public class MainPage {
    private SelenideAppiumElement successLoginLabel = $(CombinedBy.android(xpath("//android.widget.TextView[@text='Вход в Alfa-Test выполнен']")))
            .as("successLoginLabel");

    @Step("successLoginLabel is displayed")
    public void checkSuccessLoginLabelIsDisplayed(){
        successLoginLabel.shouldBe(visible, Duration.ofSeconds(6)).should(have(exactText("Вход в Alfa-Test выполнен")));
    }
}
