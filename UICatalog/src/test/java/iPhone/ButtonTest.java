package iPhone;

import ButtonsPage.Buttons;
import common.TestLogger;
import navigate.NavigateUi;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends Buttons{
    @BeforeMethod
    public void init(){
        Buttons obj = PageFactory.initElements(ad,Buttons.class);
    }

    @Test
    public void navigate()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
    }
    @Test
    public void testClickOnGray(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnGrayButton();
    }
    @Test
    public void testClickOnRightArrow(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnRightArrow();
    }

}