package webdriverfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

    private static final Logger logger = LogManager.getLogger(WebDriverFactory.class);

    public static WebDriver getDriver(BrowserName name) {
        switch (name) {
            case CHROME:
                logger.info("Драйвер для браузера Google Chrome");
                ChromeBrowser.getDriver();
            case EDGE:
                logger.info("Драйвер для браузера Microsoft Edge");
                EdgeBrowser.getDriver();
            case FIREFOX:
                logger.info("Драйвер для браузера Mozilla Firefox");
                FirefoxBrowser.getDriver();
            default:
                throw new RuntimeException("Некорректное имя браузера");
        }
    }
}
