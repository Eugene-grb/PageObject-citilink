package tests.citilink;

import helpers.JSExecutor;
import models.SmartphoneVO;
import models.valueobjects.Company;
import models.valueobjects.Ram;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.BaseTest2;
import pages.citilink.MainPage;
import pages.citilink.SmartphoneProductPage;
import pages.citilink.SmartphonesPage;

public class SmartphoneProductPage_Test_2 extends BaseTest2 {

    @Test
    public void selectedProduct_Is_Samsung() {

        String product = "Samsung";
        int ram = 8;

        SmartphoneVO smartphoneVO = new SmartphoneVO(
                new Ram(ram),
                new Company(product)
        );

        SmartphoneProductPage smartphoneProductPage = getProductPage(smartphoneVO);
        String actualTitle = smartphoneProductPage.getPageTitle();

        String expectedTitle = "Купить Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb, SM-N985F, бронзовый в интернет-магазине СИТИЛИНК, цена на Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb, SM-N985F, бронзовый (1404220) - Волгоград";
        Assertions.assertThat(actualTitle)
                .as("Заголовок страницы не соответсвует ожидаемому")
                .isEqualTo(expectedTitle);
    }

    public SmartphoneProductPage getProductPage(SmartphoneVO smartphoneVO) {
        driver.get("https://www.citilink.ru/");
        MainPage mainPage = new MainPage(driver);
        mainPage.linkCatalogButtonClick();
        mainPage.linkSmartphonesClick();

        SmartphonesPage smartphonesPage = new SmartphonesPage(driver);
        smartphonesPage.sortPriceButton();
        smartphonesPage.sortPriceButton();
        JSExecutor.scrollBy(0, 1500);
        smartphonesPage.checkboxCompanyClick(smartphoneVO.getCompany().getCompany());
        JSExecutor.scrollBy(0, 350);
        smartphonesPage.checkboxRamClick(smartphoneVO.getRam().getRam() + " ГБ");
        smartphonesPage.applyFiltersButtonClick();
        smartphonesPage.firstProductLinkClick("Смартфон SAMSUNG Galaxy Note 20 Ultra 256Gb");
        return new SmartphoneProductPage(driver);
    }

}
