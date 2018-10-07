package TextFieldsPage;

import common.Base;
import common.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFields extends Base{
    @FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public MobileElement ele1;
    @FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    public MobileElement ele2;
    public void scrollDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        new TouchAction(ad).press(ele2).moveTo(ele1).release().perform();
    }
    public void typeOnUiTextField(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]", "Architecture");
    }
    public void typeOnUiTextFieldRounded(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]", "Rounded");
    }
    public void typeOnUiTextFieldSecure(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        scrollToElement(ad,"//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]");
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]", "test123");
    }
    public void typeOnUiTextFieldLeftView(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]", "Secure");
    }

    public void writeTextToFields(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnUiTextField();
        scrollDown();
        typeOnUiTextFieldRounded();
        typeOnUiTextFieldSecure();
        typeOnUiTextFieldLeftView();
    }
}
