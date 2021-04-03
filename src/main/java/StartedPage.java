import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface StartedPage extends WebPage {

     @FindBy("//button[@data-marker='search-form/submit-button']")
     AtlasWebElement input();

}
