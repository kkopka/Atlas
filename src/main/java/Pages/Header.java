package Pages;

import AT_Cucumber.MyStepdefs;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public interface Header extends AtlasWebElement {

    @FindBy("//div[@class='category-select-root-2U90T']")
    AtlasWebElement category();

    @FindBy("//input[@id='search']")
    AtlasWebElement searchField();

    @FindBy("//div[@class='main-locationWrapper-3C0pT']")
    AtlasWebElement region();

    default void categoryList(String nameCategory){
        Select select=new Select(MyStepdefs.driver.findElement(By.xpath("//select[@name='category_id']")));
        select.selectByVisibleText(nameCategory);
    }
}
