package config.selenium;

//import ru.qatools.properties.Property;
//import ru.qatools.properties.Resource;

public interface SeleniumConfig {

//    @Property("ChromeDriverPath")
    String getChromeDriverPath();

//    @Property("UseJsFilling") //TODO: uncomment after resolving dependencies //16-11
    Boolean getJSProperty();

}
