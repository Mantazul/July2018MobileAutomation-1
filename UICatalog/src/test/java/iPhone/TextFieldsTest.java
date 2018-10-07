package iPhone;

import common.TestLogger;
import navigate.NavigateUi;
import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFieldsTest extends NavigateUi {

    TextFields textFields = new TextFields();

    @Test
    public void navigate()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTextFields();
        textFields.writeTextToFields();

    }
}
