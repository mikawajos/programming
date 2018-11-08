package config;
import config.environment.EnvironmentConfig;
import config.selenium.SeleniumConfig;
import ru.qatools.properties.PropertyLoader;


public class TestConfig {
    public static final SeleniumConfig seleniumConfig = PropertyLoader.newInstance()
            .populate(SeleniumConfig.class);
}
