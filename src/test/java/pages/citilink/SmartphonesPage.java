package pages.citilink;

import elements.*;
import helpers.WaitFor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static java.lang.String.format;

public class SmartphonesPage extends BasePage {

    private final Logger logger = LogManager.getLogger(SmartphonesPage.class);

    private static final String APPLY_FILTERS_BUTTON = "//div[@class='css-v4lp2l e1m5p8620']";
    private static final String PRICE_BUTTON = "//div[contains(@class, 'SortingList__item') and @data-alias='price']";
    private static final String FIRST_PRODUCT_LINK = "//*[@class='ProductCardHorizontal__title  Link js--Link Link_type_default'][1]";
    private static final String CARD_CHECKBOX = "//div[@class='ProductCardCategoryList__container']//span[@class='css-1sylyko e1fcpgoj0' and contains(text(),'%s')]";

    public SmartphonesPage(WebDriver driver) {
        super(driver);
    }

    public void sortPriceButton() {
        Button sortPrice = new Button(driver, By.xpath(PRICE_BUTTON));
        sortPrice.click();
        logger.info("Нажата кнопка 'по цене'");
    }

    public void checkboxCompanyClick(String company) {
        String COMPANY_CHECKBOX = format(CARD_CHECKBOX, company.toUpperCase());
        CheckBox checkBoxCompany = new CheckBox(driver, By.xpath(COMPANY_CHECKBOX));
        checkBoxCompany.setChecked(true);
        logger.info("Установлен фильтр \"Производитель\" - " + company);
    }

    public void checkboxRamClick(String ram) {
        String RAM_CHECKBOX = format(CARD_CHECKBOX, ram);
        CheckBox checkBoxRam = new CheckBox(driver, By.xpath(RAM_CHECKBOX));
        checkBoxRam.setChecked(true);
        logger.info("Установлен фильтр \"Объем оперативной памяти\" - " + ram);
    }

    public void applyFiltersButtonClick() {
        Button buttonApply = new Button(driver, By.xpath(APPLY_FILTERS_BUTTON));
        buttonApply.click();
        logger.info("Нажата кнопка \"Применить\"");
    }

    public void firstProductLinkClick(String product) {
        WaitFor.firstProductMustBe(By.xpath(FIRST_PRODUCT_LINK), product);
        Link linkProduct = new Link(driver, By.xpath(FIRST_PRODUCT_LINK));
        linkProduct.openInNewWindow();
        logger.info("Нажата ссылка первого продукта в списке");
    }
}
