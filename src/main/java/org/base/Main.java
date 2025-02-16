package org.base;

import org.enums.Browser;
import org.enums.LocatorType;

public class Main {
    public static void main(String[] args) {
        BrowserOperations browserOperations = BrowserOperations.openBrowser(Browser.FIREFOX);
        browserOperations.openPage("https://www.google.co.in/");
        Locators.getWebElement(LocatorType.NAME, "q").sendKeys("Sunitha Williams");
        browserOperations.quitBrowser();
    }
}
