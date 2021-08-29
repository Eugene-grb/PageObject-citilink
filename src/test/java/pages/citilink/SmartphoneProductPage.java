package pages.citilink;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SmartphoneProductPage extends BasePage {

    private Logger logger = LogManager.getLogger(SmartphoneProductPage.class);

    public SmartphoneProductPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        logger.info("Заголовок страницы: " + title);
        return title;
    }
}
