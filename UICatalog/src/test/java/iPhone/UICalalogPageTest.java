package iPhone;

import UiCatalogPage.UiCatalog;
import common.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UICalalogPageTest extends UiCatalog {
    @BeforeMethod
    public void init(){
        UiCatalog uicObj = PageFactory.initElements(ad,UiCatalog.class);
    }
    @Test
    public void testButtonClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getButtonPage();
    }
    @Test
    public void testContolClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getControls();
    }
    @Test
    public void testTextClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTextFields();
    }
    @Test
    public void testSearchClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchBar();
    }
    @Test
    public void testTextViewClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTextView();
    }
    @Test
    public void testPickersClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPickers();
    }
    @Test
    public void testImagesClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getImages();
    }
    @Test
    public void testWebClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getWeb();
    }
    @Test
    public void testSegmentClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSegments();
    }
    @Test
    public void testToolbarClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getToolbar();
    }
    @Test
    public void testAlertsClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlerts();
    }
    @Test
    public void testTransitionsClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTransitions();
    }
}
