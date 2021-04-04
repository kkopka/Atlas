package AT_Cucumber;

import Pages.ResultSearch.ResultSearch;
import Pages.StartedPage.StartedPage;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepdefs {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Atlas atlas;
    private StartedPage startedpage=getPage(StartedPage.class);
    private ResultSearch resultSearch=getPage(ResultSearch.class);
    @Пусть("открыт ресурс авито")
    public void открытРесурсАвито() {
        startedpage.open(StartedPage.URL);
    }

    @И("в выпадающем списке категорий выбрали {string}")
    public void вВыпадающемСпискеКатегорийВыбралиНастольныеКомпьютеры(String category) {
        startedpage.header().categoryList(category);
    }

    @И("в поле поиска ввели значение {string}")
    public void вПолеПоискаВвелиЗначениеМонитор(String name) {
        startedpage.header().searchField().sendKeys(name);
    }

    @Тогда("кликнули по выпадающему списку региона")
    public void кликнулиПоВыпадающемуСпискуРегиона(){
        startedpage.header().region().click();
    }

    @Тогда("в поле регион ввели значение {string}")
    public void вПолеРегионВвелиЗначениеМонитор(String nameCity){
       startedpage.blockRegions().searchField().sendKeys(nameCity);
    }

    @И("кликнули по кнопке показать объявления")
    public void кликнулиПоКнопкеПоказатьОбъявления() {
        startedpage.blockRegions().buttonShow().click();
    }

    @Тогда("открылась страница результаты по запросу Мониторы")
    public void открыласьСтраницаРезультатыПоЗапросуМониторы() {
        System.out.println(MyStepdefs.driver.getTitle());
    }


    @И("активировали чекбокс {string}")
    public void активировалиЧекбоксТолькоСФото(String nameCheckbox) {
       resultSearch.selectCheckbox(nameCheckbox);
    }

    @И("нажали на кнопку показать объявления")
    public void нажалиНаКнопкуПоказатьОбъявления() {
        resultSearch.buttonShow().click();
    }

    @И("в выпадающем списке сортировка выбрали значение {string}")
    public void вВыпадающемСпискеСортировкаВыбралиЗначениеДороже(String parametrFiltr) {
      resultSearch.filtr(parametrFiltr);
    }

    
    private <T extends WebPage> T getPage(Class<T> page) {
        return atlas.create(driver, page);
    }



}
