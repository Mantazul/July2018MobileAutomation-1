package iPhone;

import ControlsPage.Controls;
import common.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTest extends Controls {
    @BeforeMethod
    public void init(){
         Controls obj = PageFactory.initElements(ad,Controls.class);
    }
    @Test
    public void testSwich(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSwich();
    }
    @Test
    public void testSlider(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slider();
    }
    @Test
    public void testCustomSlider(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        customSlider();
    }
}
