package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public abstract class BaseTest {

    protected static WebDriver driver;
    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    // Перед каждым тестом
    @BeforeEach
    public void setUp() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();

        // Получаем экземпляр драйвера браузера
        // Настройка исполняемого файла драйвера
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // Поведение при получение алертов 'Игнорирование'
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        options.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NORMAL);
        options.addArguments("--incognito");
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver(options);
        logger.info("Драйвер стартовал!");
    }

    // После каждого теста
    @AfterEach
    public void setDown() {
        if(driver != null) {
            driver.quit();
            logger.info("Драйвер остановлен!");
        }
    }
}
