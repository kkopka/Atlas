package AT_Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setUp(){
        System.getProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        MyStepdefs.driver = new ChromeDriver();
        MyStepdefs.atlas = new Atlas(new WebDriverConfiguration(MyStepdefs.driver));
        MyStepdefs.wait=new WebDriverWait(MyStepdefs.driver, 10);
        MyStepdefs.driver.manage().window().maximize();
        MyStepdefs.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
    }

    @After
    public void close(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyStepdefs.driver.close();
    }

}
