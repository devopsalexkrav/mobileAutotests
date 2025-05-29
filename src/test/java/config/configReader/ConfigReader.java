package config.configReader;

import org.aeonbits.owner.ConfigFactory;

import java.util.Optional;

public class ConfigReader {
    private static final MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class);

    public static String platformName(){
        return Optional.ofNullable(mobileConfig.platformName())
                .orElseThrow(() -> new IllegalArgumentException("platformName is null"));
    }

    public static String platformVersion(){
        return Optional.ofNullable(mobileConfig.platformVersion())
                .orElseThrow(() -> new IllegalArgumentException("platformVersion is null"));
    }

    public static String url(){
        return Optional.ofNullable(mobileConfig.url())
                .orElseThrow(() -> new IllegalArgumentException("url is null"));
    }

    public static String deviceName(){
        return Optional.ofNullable(mobileConfig.deviceName())
                .orElseThrow(() -> new IllegalArgumentException("deviceName is null"));
    }

    public static String app(){
        return Optional.ofNullable(mobileConfig.app())
                .orElseThrow(() -> new IllegalArgumentException("app is null"));
    }

    public static String login(){
        return Optional.ofNullable(mobileConfig.login())
                .orElseThrow(() -> new IllegalArgumentException("login is null"));
    }

    public static String password(){
        return Optional.ofNullable(mobileConfig.password())
                .orElseThrow(() -> new IllegalArgumentException("password is null"));
    }
}
