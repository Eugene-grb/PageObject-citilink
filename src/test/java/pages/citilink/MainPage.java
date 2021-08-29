package pages.citilink;

import elements.Link;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class MainPage extends BasePage {

    private final Logger logger = LogManager.getLogger(MainPage.class);

    private static final String URL = "https://www.citilink.ru/";
    private static final String CATALOG_BUTTON = "//span[@class='Button__text jsButton__text' and contains(text(), 'Каталог товаров')]";
    private static final String SMARTPHONE_SUBMENU_BUTTON = "//*[contains(@class, 'CatalogMenu__subcategory-link') and contains(text(), 'Смартфоны')][1]";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return URL;
    }

    public void openPage() {
        driver.get(URL);
        logger.info("Открыта страница " + driver.getTitle());
    }

    public void linkCatalogButtonClick() {
        Link catalogButton = new Link(driver, By.xpath(CATALOG_BUTTON));
        catalogButton.click();
        logger.info("Нажата ссылка 'Каталог товаров'");
    }

    public void linkSmartphonesClick() {
        Link smartphonesButton = new Link(driver, By.xpath(SMARTPHONE_SUBMENU_BUTTON));
        smartphonesButton.click();
        logger.info("Нажата ссылка 'Смартфоны'");
    }

}
