package config.browsers;

public class BrowserFactory {
    public static Browsers initializeBrowser(String browserType){
        Browsers browser  = BrowserType.valueOf(browserType).getBrowser();
        browser.setUp();
        return browser;
    }
}
