
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import org.openqa.selenium.WebDriver;

public interface Site extends WebSite {

   @Page
   StartedPage onStartedpage();

}
