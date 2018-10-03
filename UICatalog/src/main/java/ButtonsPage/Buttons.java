package ButtonsPage;

import common.Base;
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
       obj.getButtonPage();
   }
   public void clickOnGrayButton(){
       ClickOnButton();
       clickOnWebElement("Gray","id");
   }
   public void clickOnRightArrow(){
       ClickOnButton();
       clickOnWebElement("Right pointing arrow","id");
   }

}
