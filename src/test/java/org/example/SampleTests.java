package org.example;

import org.base.BrowserOperations;
import org.enums.Browser;
import org.enums.LocatorType;
import org.testng.annotations.Test;
import org.uiOperations.UiOperations;

public class SampleTests {

    @Test
    public void basicTest(){
        BrowserOperations browserOperations = BrowserOperations.openBrowser(Browser.FIREFOX);
        browserOperations.openPage("https://www.google.co.in/");
        UiOperations.type(LocatorType.NAME, "q" , "Sunitha Williams");
        browserOperations.quitBrowser();
    }

}
