package org.utility.jsUtils;

import org.base.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptUtils {

    private static final JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriverInstance();

    static boolean scrollToWebElement(WebElement element){
        js.executeScript("argument[0].scrollIntoView(true)", element);
        return true;
    }

    static boolean scrollToEndOfPage(){
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return true;
    }

}
