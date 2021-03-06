package TextViewPage;

import common.Base;
import common.TestLogger;
import org.openqa.selenium.By;
import UiCatalogPage.UiCatalog;
import org.testng.Assert;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextView extends Base {
    UiCatalog obj = new UiCatalog();
    public void goToTextViewPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        obj.getTextView();
    }
    public void findElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToTextViewPage();
        String text = ad.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView")).getAttribute("value");
        System.out.println(text);
        Assert.assertEquals("Now is the time for all good developers to come to serve their country.\n" +
                "\n" +
                "Now is the time for all good developers to come to serve their country.\n" +
                "\n" +
                "This text view can also use attributed strings.",text);
    }
}
