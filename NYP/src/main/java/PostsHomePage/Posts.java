package PostsHomePage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Posts extends Base {
    @FindBy(id="br.com.golmobile.nypost:id/headline_text_view")
    public static WebElement firstHeadline;
    /*public MobileElement getFirstHeadline() {
        return firstHeadline;
    }*/
   public void clickOnFirstHeadline(){
        firstHeadline.click();
   }

}
