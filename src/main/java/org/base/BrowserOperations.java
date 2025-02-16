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

    public static BrowserOperations getInstance(){
        return browserOperations;
    }

    public static BrowserOperations openBrowser(Browser browser) {
        browserOperations = new BrowserOperations(browser);
        return browserOperations;
    }

    public boolean openPage(String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return true;
    }

    public boolean refreshPage(){
        driver.navigate().refresh();
        return true;
    }

    public boolean gotoPreviousPage(){
        driver.navigate().back();
        return true;
    }

    public boolean gotoNextPage(){
        driver.navigate().forward();
        return true;
    }

    public boolean quitBrowser(){
        driver.quit();
        return true;
    }
}
