package AT_Cucumber;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseSteps {
    private WebDriver driver;
    private WebDriverWait wait;
    private Atlas atlas;

    public BaseSteps() {
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, 10);
        this.atlas = new Atlas(new WebDriverConfiguration(driver));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public Atlas getAtlas() {
        return atlas;
    }

    protected <T extends WebPage> T getPage(Class<T> page){
        return getAtlas().create(getDriver(),page);
    }

}
