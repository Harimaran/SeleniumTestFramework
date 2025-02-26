package org.uiOperations;

import org.base.DriverFactory;
import org.enums.Browser;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserOperations extends DriverFactory {

    private final WebDriver driver;

    public BrowserOperations(Browser browser){
        driver = getDriverInstance(browser);
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
