package config.selenium;

import ru.qatools.properties.Property;
import ru.qatools.properties.Resource;

import javax.annotation.Resource;

@Resource.Classpath("selenium.properties")
public interface SeleniumConfig {

    @Property("ChromeDriverPath")
    String getChromeDriverPath();

}
