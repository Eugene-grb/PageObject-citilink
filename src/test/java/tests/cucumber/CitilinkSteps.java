package tests.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CitilinkSteps {
    @Given("открываю главную страницу магазина citilink")
    public void открываюГлавнуюСтраницуМагазинаCitilink() {
    }

    @When("нажимаю на кнопку {string}")
    public void нажимаюНаКнопку(String arg0) {
    }

    @And("перехожу на страницу каталога смартфонов")
    public void перехожуНаСтраницуКаталогаСмартфонов() {
    }

    @And("ставлю сортировку сначала дорогие")
    public void ставлюСортировкуСначалаДорогие() {
    }

    @And("выставляю фильтр по производителю {string}")
    public void выставляюФильтрПоПроизводителю(String arg0) {
    }

    @And("выставляю фильтр по оперативной памяти {string}")
    public void выставляюФильтрПоОперативнойПамяти(String arg0) {
    }

    @And("принимаю все значения фильтров")
    public void принимаюВсеЗначенияФильтров() {
    }

    @And("открываю первый товар из списка в новом окне")
    public void открываюПервыйТоварИзСпискаВНовомОкне() {
    }

    @Then("заголовок страницы соответсвует ожидаемому")
    public void заголовокСтраницыСоответсвуетОжидаемому() {
    }
}
