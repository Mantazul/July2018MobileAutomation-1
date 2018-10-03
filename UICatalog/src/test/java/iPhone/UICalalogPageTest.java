package iPhone;

import UiCatalogPage.UiCatalog;
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
        getButtonPage();
    }
    @Test
    public void testContolClick(){
        getControls();
    }
    @Test
    public void testTextClick(){
        getTextFields();
    }
    @Test
    public void testSearchClick() {
        getSearchBar();
    }
    @Test
    public void testTextViewClick() {
        getTextView();
    }
    @Test
    public void testPickersClick() {
        getPickers();
    }
    @Test
    public void testImagesClick() {
        getImages();
    }
    @Test
    public void testWebClick() {
        getWeb();
    }
    @Test
    public void testSegmentClick() {
        getSegments();
    }
    @Test
    public void testToolbarClick() {
        getToolbar();
    }
    @Test
    public void testAlertsClick() {
        getAlerts();
    }
    @Test
    public void testTransitionsClick() {
        getTransitions();
    }
}
