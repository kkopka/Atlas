package Pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface GeneralElements extends AtlasWebElement {

    @FindBy("//span[text()='{{ text }}']")
    AtlasWebElement checkbox(@Param("text")String nameCheckBox);

    default void selectCheckbox(String nameCheckBox){
         if (!checkbox(nameCheckBox).isSelected()){
            checkbox(nameCheckBox).click();
         }
    }
}
