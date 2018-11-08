package config.browsers;

public enum BrowserType {
    CHROME(new ChromeBrowser()),
    IE(new IEBrowser()),
    FIREFOX(new FirefoxBrowser())''
}
