package config;

import com.codeborne.selenide.WebDriverRunner;
import config.configReader.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriverProvider {
    public static void createDriver() {
        String platformName = ConfigReader.platformName();
        WebDriver webDriver;

        if (platformName.equalsIgnoreCase("android")) {
            webDriver = createAndroidDriver();
        } else {
            throw new IllegalArgumentException("Unsupported platform: " + platformName);
        }

        WebDriverRunner.setWebDriver(webDriver);
    }

    private static WebDriver createAndroidDriver() {
        URL url = null;
        try {
            url = new URL(ConfigReader.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName(ConfigReader.deviceName())
                .setPlatformName(ConfigReader.platformName())
                .setPlatformVersion(ConfigReader.platformVersion())
                .setApp(ConfigReader.app())
                .fullReset();

        return new AndroidDriver(url, options);
    }
}
