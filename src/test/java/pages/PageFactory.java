package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.citilink.MainPage;
import pages.citilink.SmartphoneProductPage;
import pages.citilink.SmartphonesPage;

public class PageFactory {

    private static final Logger logger = LogManager.getLogger(PageFactory.class);

    public static BasePage getPage(WebDriver driver, PageName name) {
        switch (name) {
            case MAIN_PAGE -> {
                logger.info("Стартовая страница");
                MainPage mainPage = new MainPage(driver);
                return mainPage;
            }
            case SMARTPHONES_PAGE -> {
                logger.info("Страница 'Смартфоны'");
                SmartphonesPage smartphonesPage = new SmartphonesPage(driver);
                return smartphonesPage;
            }
            case SMARTPHONE_PRODUCT_PAGE -> {
                logger.info("Страница 'Продукт. Смартфон'");
                SmartphoneProductPage smartphoneProductPage = new SmartphoneProductPage(driver);
                return smartphoneProductPage;
            }
            default -> throw new RuntimeException("Некорректное наименование страницы (пейдж обджекта)");
        }
    }
}
