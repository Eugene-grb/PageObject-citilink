package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import webdriverfactory.BrowserName;
import webdriverfactory.WebDriverFactory;

public abstract class BaseTest2 {

    protected static WebDriver driver;
    private final Logger logger = LogManager.getLogger(BaseTest2.class);

    @BeforeEach
    public void setUp() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        driver = WebDriverFactory.getDriver(BrowserName.fromString(browser));
        logger.info("Драйвер стартовал!");
    }

    @AfterEach
    public void setDown() {
        if(driver != null) {
            driver.quit();
            logger.info("Драйвер остановлен!");
        }
    }
}
