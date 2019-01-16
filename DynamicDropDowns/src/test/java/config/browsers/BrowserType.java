package config.browsers;

enum BrowserType {
    CHROME(new ChromeBrowser());
//    IE(new IEBrowser()),
//    FIREFOX(new FirefoxBrowser());

    private final Browsers type;
    BrowserType(Browsers type) {
        this.type = type;
    }

    public Browsers getBrowser(){
        return type;
    }

}
