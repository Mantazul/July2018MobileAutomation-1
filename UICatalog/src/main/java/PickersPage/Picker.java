package PickersPage;

import common.Base;
import common.TestLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 1/15/17.
 */
public class Picker extends Base {
    public void selectPickerTwoWheels(String name, String number){
        //scrollKeys(ad, new String[]{name,number});
    }
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIASegmentedControl[1]/UIAButton")
    List<WebElement> segmentControl = new ArrayList<WebElement>();

    public void getUIPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        segmentControl.get(0).click();
    }
    public void getUIDatePicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        segmentControl.get(1).click();
    }
    public void getCustom(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        segmentControl.get(2).click();
    }


}
