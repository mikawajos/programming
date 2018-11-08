package config.browsers;

import static config.helpers.WebDriverSettings.WEB_DRIVER_CHROME;
import static java.lang.System.setProperty;

public class ChromeBrowser implements Browsers {
    @Override
    public void setUp(){
        setProperty(WEB_DRIVER_CHROME, seleniumConfig.getChromeDriverPath());
    }
}
