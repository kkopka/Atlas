package AT_Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseSteps {
    @Before
    public void setUp() {
        System.getProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//        getDriver().manage().window().maximize();
//        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
    }

    @After
    public void close(Scenario scenario) {
        try {
            System.out.println(scenario.getName());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getDriver().close();
    }

}
