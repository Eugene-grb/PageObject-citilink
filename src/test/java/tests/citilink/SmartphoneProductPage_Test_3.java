package tests.citilink;

import helpers.JSExecutor;
import models.Smartphone;
import models.SmartphoneBuilder;
import models.SmartphoneVO;
import models.valueobjects.Company;
import models.valueobjects.Ram;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.citilink.MainPage;
import pages.citilink.SmartphoneProductPage;
import pages.citilink.SmartphonesPage;
import tests.BaseTest2;

public class SmartphoneProductPage_Test_3 extends BaseTest2 {

    @Test
    public void selectedProduct_Is_Samsung() {

        SmartphoneBuilder builder = new SmartphoneBuilder(
                new Ram(8),
                new Company("Samsung"))
                .setRom(256)
                .setModel("S20");
        Smartphone smartphone = builder.build();

        SmartphoneProductPage smartphoneProductPage = getProductPage(smartphone);
        String actualTitle = smartphoneProductPage.getPageTitle();

        String expectedTitle = "Купить Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb, SM-N985F, бронзовый в интернет-магазине СИТИЛИНК, цена на Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb, SM-N985F, бронзовый (1404220) - Волгоград";
        Assertions.assertThat(actualTitle)
                .as("Заголовок страницы не соответсвует ожидаемому")
                .isEqualTo(expectedTitle);
    }

    public SmartphoneProductPage getProductPage(Smartphone smartphone) {
        driver.get("https://www.citilink.ru/");
        MainPage mainPage = new MainPage(driver);
        mainPage.linkCatalogButtonClick();
        mainPage.linkSmartphonesClick();

        SmartphonesPage smartphonesPage = new SmartphonesPage(driver);
        smartphonesPage.sortPriceButton();
        smartphonesPage.sortPriceButton();
        JSExecutor.scrollBy(0, 1500);
        smartphonesPage.checkboxCompanyClick(smartphone.getCompany().getCompany());
        JSExecutor.scrollBy(0, 350);
        smartphonesPage.checkboxRamClick(smartphone.getRam().getRam() + " ГБ");
        smartphonesPage.applyFiltersButtonClick();
        smartphonesPage.firstProductLinkClick("Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb");
        return new SmartphoneProductPage(driver);
    }
}
