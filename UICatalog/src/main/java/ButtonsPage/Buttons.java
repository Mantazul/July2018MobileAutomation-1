package ButtonsPage;

import common.Base;
import common.TestLogger;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import UiCatalogPage.UiCatalog;
/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {
    UiCatalog obj = new UiCatalog();

   public void ClickOnButton(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       obj.getButtonPage();
   }
   public void clickOnGrayButton(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       ClickOnButton();
       clickOnWebElement("Gray","id");
   }
   public void clickOnRightArrow(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       ClickOnButton();
       clickOnWebElement("Right pointing arrow","id");
   }

}
