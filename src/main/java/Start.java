import io.qameta.atlas.core.Atlas;


import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public abstract class Start implements Site, StartedPage {
    public Atlas atlas;
    public ChromeDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp(){
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        atlas = new Atlas(new WebDriverConfiguration(driver));
    }

    @Test
    public void test() {
        onPage(StartedPage.class).open("https://www.avito.ru/izhevsk");
        onPage(StartedPage.class).input().click();
    }

    private <T extends WebPage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }

}
