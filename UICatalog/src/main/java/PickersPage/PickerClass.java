package PickersPage;

import common.Base;
import UiCatalogPage.UiCatalog;
import common.TestLogger;
import org.openqa.selenium.By;

public class PickerClass extends Base {
    UiCatalog obj = new UiCatalog();
    public void goToPickerPage(){
        obj.getPickers();
    }
    public void clickUIPicker(){
        clickOnWebElement("UIPicker","id");
    }
    public void clickUIDataPicker(){
        clickOnWebElement("UIDatePicker","id");
    }
    public void clickCustom(){
        clickOnWebElement("Custom","id");
    }
    public void clickOnNameSelector2(){
        clickByXpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]/XCUIElementTypeOther[2]");
    }
    public void clickOnNameSelector3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]/XCUIElementTypeOther[3]");
    }
    public void clickOnNumber2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel[2]/XCUIElementTypeOther[2]");
    }
    public void clickOnNumber3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel[2]/XCUIElementTypeOther[3]");
    }
    public void clickOnNumber1inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUIDataPicker();
       clickOnWebElement("1","id");
    }
    public void clickOnNumber2inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUIDataPicker();
        clickOnWebElement("2","id");
    }
    public void clickOnNumber3inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUIDataPicker();
        clickOnWebElement("3","id");
    }
    public void clickOnNumber4inUIDataPicker(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUIDataPicker();
        clickOnWebElement("4","id");
    }
    public void getUIDatePickerModeCountDownTimerText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUIDataPicker();
        String text = ad.findElement(By.id("UIDatePickerModeCountDownTimer")).getText();
        System.out.println(text);
    }

}
