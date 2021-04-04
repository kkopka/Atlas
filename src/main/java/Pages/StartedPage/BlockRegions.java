package Pages.StartedPage;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface BlockRegions extends AtlasWebElement {

    @FindBy("//input[@data-marker='popup-location/region/input']")
    AtlasWebElement searchField();

    @FindBy("//button[@data-marker='popup-location/save-button']")
    AtlasWebElement buttonShow();
}
