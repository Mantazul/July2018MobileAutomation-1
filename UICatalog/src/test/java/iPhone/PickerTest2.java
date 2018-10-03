package iPhone;

import PickersPage.PickerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PickerTest2 extends PickerClass {
    @BeforeMethod
    public void init(){
        PickerClass obj = PageFactory.initElements(ad,PickerClass.class);
    }
    @Test
    public void testClickUIPicker(){
        clickUIPicker();
    }
    @Test
    public void testClickUIDataPicker(){
        clickUIDataPicker();
    }
    @Test
    public void testClickCustom(){
        clickCustom();
    }
    @Test
    public void testClickOnNameSelector2(){
        clickOnNameSelector2();
    }
    @Test
    public void testClickOnNameSelector3(){
        clickOnNameSelector3();
    }
    @Test
    public void testClickOnNumber2(){
        clickOnNumber2();
    }
    @Test
    public void testClickOnNumber3(){
        clickOnNumber3();
    }
    @Test
    public void testClickOnNumber1inUIDataPicker(){
        clickOnNumber1inUIDataPicker();
    }
    @Test
    public void testClickOnNumber2inUIDataPicker(){
        clickOnNumber2inUIDataPicker();
    }
    @Test
    public void testClickOnNumber3inUIDataPicker(){
        clickOnNumber3inUIDataPicker();
    }
    @Test
    public void testClickOnNumber4inUIDataPicker(){
        clickOnNumber4inUIDataPicker();
    }
    @Test
    public void testGetUIDatePickerModeCountDownTimerText(){
        getUIDatePickerModeCountDownTimerText();
    }
}
