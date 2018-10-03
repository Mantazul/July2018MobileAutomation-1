package iPhone;

import TextViewPage.TextView;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextViewTest extends TextView {
    @BeforeMethod
    public void init(){
        TextView obj = PageFactory.initElements(ad,TextView.class);
    }
    @Test
    public void testText(){
        findElement();
    }
}
