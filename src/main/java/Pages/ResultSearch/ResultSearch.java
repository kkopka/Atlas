package Pages.ResultSearch;

import AT_Cucumber.MyStepdefs;
import Pages.GeneralElements;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public interface ResultSearch extends WebPage, GeneralElements {

    @FindBy("//button[@data-marker='search-filters/submit-button']")
    AtlasWebElement buttonShow();

    default void filtr(String parametrFiltr){
        Select filtr=new Select(MyStepdefs.driver.findElement(By.xpath("//div[@class='index-content-2lnSO']//select[@class='select-select-3CHiM']")));
        filtr.selectByVisibleText(parametrFiltr);
    }
}
