package iPhone;

import ControlsPage.Controls;
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
        clickOnSwich();
    }
    @Test
    public void testSlider(){
        slider();
    }
    @Test
    public void testCustomSlider(){
        customSlider();
    }
}
