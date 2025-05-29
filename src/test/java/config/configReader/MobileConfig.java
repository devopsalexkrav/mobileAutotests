package config.configReader;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties",
        "classpath:platform/${platform}.properties"
})
public interface MobileConfig extends Config {
    @Config.Key("platformName")
    String platformName();

    @Config.Key("platformVersion")
    String platformVersion();

    @Config.Key("deviceName")
    String deviceName();

    @Config.Key("app")
    String app();

    @Config.Key("url")
    String url();

    @Config.Key("login")
    String login();

    @Config.Key("password")
    String password();
}
