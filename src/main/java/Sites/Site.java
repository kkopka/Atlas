package Sites;

import Pages.StartedPage.StartedPage;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;

public interface Site extends WebSite {

   @Page
   StartedPage onStartedpage();

}
