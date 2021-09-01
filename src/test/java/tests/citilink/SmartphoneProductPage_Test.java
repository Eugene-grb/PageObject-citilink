package tests.citilink;

import helpers.JSExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.citilink.MainPage;
import pages.citilink.SmartphoneProductPage;
import pages.citilink.SmartphonesPage;
import tests.BaseTest;


public class SmartphoneProductPage_Test extends BaseTest {

    @Test
    public void selectedProduct_Is_Samsung() {
        String product = "Samsung";
        String ram = "8 ГБ";

        SmartphoneProductPage smartphoneProductPage = getProductPage(product, ram);
        String actualTitle = smartphoneProductPage.getPageTitle();

        String expectedTitle = "Купить Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb, SM-N985F, бронзовый в интернет-магазине СИТИЛИНК, цена на Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb, SM-N985F, бронзовый (1404220) - Волгоград";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    public SmartphoneProductPage getProductPage (String product, String ram) {
        driver.get("https://www.citilink.ru/");
        MainPage mainPage = new MainPage(driver);
        mainPage.linkCatalogButtonClick();
        mainPage.linkSmartphonesClick();

        SmartphonesPage smartphonesPage = new SmartphonesPage(driver);
        smartphonesPage.sortPriceButton();
        smartphonesPage.sortPriceButton();
        JSExecutor.scrollBy(0, 1200);
        smartphonesPage.checkboxCompanyClick(product);
        JSExecutor.scrollBy(0, 650);
        smartphonesPage.checkboxRamClick(ram);
        smartphonesPage.applyFiltersButtonClick();
        smartphonesPage.firstProductLinkClick("Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb");
        return new SmartphoneProductPage(driver);
    }
}
