package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.uiOperations.BrowserOperations;
import org.enums.Browser;
import org.enums.LocatorType;
import org.testng.annotations.Test;
import org.uiOperations.UiOperations;

public class SampleTests {
    private BrowserOperations browserOperations;
    private String applicationUrl = "https://www.google.co.in/";

    @BeforeTest
    public void beforeEachTest(){
        browserOperations = new BrowserOperations(Browser.CHROME);
        browserOperations.openPage(applicationUrl);
    }

    @Test
    public void basicTest(){
        UiOperations.type(LocatorType.NAME, "q" , "Sunitha Williams");
    }

    @AfterTest
    public void afterEachTest(){
        browserOperations.quitBrowser();
    }
}
