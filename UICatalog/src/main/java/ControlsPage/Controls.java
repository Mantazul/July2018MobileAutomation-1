package ControlsPage;

import common.Base;
import UiCatalogPage.UiCatalog;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

/**
 * Created by mrahman on 1/15/17.
 */
public class Controls extends Base {
    UiCatalog obj = new UiCatalog();
   public void goToControlsPage(){
       obj.getControls();
   }
  public void clickOnSwich(){
       goToControlsPage();
       clickByXpath("//XCUIElementTypeSwitch[@name=\"Standard\"]");
  }
  public void slider(){
       goToControlsPage();
       MobileElement ele0 = (MobileElement) ad.findElement(By.id("Standard Slider"));
       new TouchAction(ad).press(ele0).moveTo(240,332).perform();
  }
    public void customSlider(){
        goToControlsPage();
        MobileElement ele0 = (MobileElement) ad.findElement(By.id("Custom"));
        new TouchAction(ad).press(ele0).moveTo(240,511).perform();
    }
}
