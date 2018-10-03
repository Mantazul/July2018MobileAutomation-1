package PostsHomePage;

import common.Base;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class Posts extends Base {
    @FindBy(id="br.com.golmobile.nypost:id/headline_text_view")
    MobileElement firstHeadline;
    public MobileElement getFirstHeadline() {
        return firstHeadline;
    }
   public void clickOnFirstHeadline(){
        getFirstHeadline().click();
   }

}
