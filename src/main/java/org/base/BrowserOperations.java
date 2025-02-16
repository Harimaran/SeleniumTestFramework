package org.base;

import org.enums.Browser;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserOperations extends DriverFactory{
    private static BrowserOperations browserOperations;
    private final WebDriver driver;

    public BrowserOperations(Browser browser){
        super(browser);
        driver = getDriverInstance();
    }

    static BrowserOperations getInstance(){
        return browserOperations;
    }

    static BrowserOperations openBrowser(Browser browser) {
        browserOperations = new BrowserOperations(browser);
        return browserOperations;
    }

    boolean openPage(String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return true;
    }

    boolean refreshPage(){
        driver.navigate().refresh();
        return true;
    }

    boolean gotoPreviousPage(){
        driver.navigate().back();
        return true;
    }

    boolean gotoNextPage(){
        driver.navigate().forward();
        return true;
    }

    boolean quitBrowser(){
        driver.quit();
        return true;
    }
}
