package AlertsPage;

import common.Base;
import common.TestLogger;

/**
 * Created by mrahman on 1/15/17.
 */
public class Alerts extends Base{
    public void showActionSheetSimple(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]");
    }
    public void showActionSheetOkCancel(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]");
    }
    public void showActionSheetCustom(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]");
    }
    public void showAlertSimple(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]");
    }
    public void showAlertOkCancel(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[9]");
    }
    public void showAlertCustom(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[11]");
    }
    public void showSecureTextInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[13]");
    }
}
