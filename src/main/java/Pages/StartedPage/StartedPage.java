package Pages.StartedPage;


import Pages.GeneralElements.CheckBox;
import Pages.GeneralElements.Header;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;


public interface StartedPage extends WebPage, CheckBox {
    final String URL = "https://www.avito.ru/izhevsk";

    @FindBy("//a[@href='#login?next=%2Fadditem&authsrc=ca']")
    AtlasWebElement input();

    @FindBy("//div[@class='index-form-2POmG']")
    Header header();

    @FindBy("//div[@data-marker='popup-location/content']")
    BlockRegions blockRegions();
}
