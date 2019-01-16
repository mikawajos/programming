package config.browsers;

import org.openqa.selenium.chrome.ChromeOptions;

//import static config.mainConfig.TestConfig.seleniumConfig;
import static config.helpers.WebBrowserSettings.useJavaScriptSetValue;
import static config.helpers.WebDriverSettings.SET_FULLSCREEN;
import static config.helpers.WebDriverSettings.WEB_DRIVER_CHROME;
import static java.lang.System.setProperty;

public class ChromeBrowser implements Browsers {
    @Override
    public void setUp(){
//        setProperty(WEB_DRIVER_CHROME, seleniumConfig.getChromeDriverPath()); //TODO: uncomment after resolving dependencies
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(SET_FULLSCREEN);
//        useJavaScriptSetValue(seleniumConfig.getJSProperty()); //TODO: uncomment after resolving dependencies
    }
}
