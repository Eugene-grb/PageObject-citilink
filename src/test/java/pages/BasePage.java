package pages;

import helpers.JSExecutor;
import helpers.WaitFor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;

    // Конструктор базового класса
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;

        // Инициализация ожидания - 10 секунд
        WaitFor.initWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));
        // Инициализация исполнителя JS скриптов
        JSExecutor.initJS(driver);
    }
}
