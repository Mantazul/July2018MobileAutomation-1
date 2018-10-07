package iPhone;

import PickersPage.PickerClass;
import common.TestLogger;
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUIPicker();
    }
    @Test
    public void testClickUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUIDataPicker();
    }
    @Test
    public void testClickCustom(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickCustom();
    }
    @Test
    public void testClickOnNameSelector2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNameSelector2();
    }
    @Test
    public void testClickOnNameSelector3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNameSelector3();
    }
    @Test
    public void testClickOnNumber2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNumber2();
    }
    @Test
    public void testClickOnNumber3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNumber3();
    }
    @Test
    public void testClickOnNumber1inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNumber1inUIDataPicker();
    }
    @Test
    public void testClickOnNumber2inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNumber2inUIDataPicker();
    }
    @Test
    public void testClickOnNumber3inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNumber3inUIDataPicker();
    }
    @Test
    public void testClickOnNumber4inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNumber4inUIDataPicker();
    }
    @Test
    public void testGetUIDatePickerModeCountDownTimerText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUIDatePickerModeCountDownTimerText();
    }
}
