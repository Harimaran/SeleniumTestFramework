package org.example;

import org.testng.annotations.*;
import org.uiOperations.BrowserOperations;
import org.enums.Browser;
import org.enums.LocatorType;
import org.uiOperations.UiOperations;

public class SampleTests {
    private BrowserOperations browserOperations;
    private String applicationUrl = "https://www.google.co.in/";

    @BeforeSuite
    public void beforeEachTest(){
        browserOperations = new BrowserOperations(Browser.CHROME);
        browserOperations.openPage(applicationUrl);
    }

    @Test
    public void basicTest(){
        UiOperations.type(LocatorType.NAME, "q" , "Sunitha Williams");
    }

    @AfterSuite
    public void afterEachTest(){
        browserOperations.quitBrowser();
    }
}
