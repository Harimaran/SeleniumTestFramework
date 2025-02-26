package org.base;

import org.enums.Browser;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class DriverFactory {
    private static WebDriver driver;
    private static boolean executeOnGrid = true;

    public static WebDriver getDriverInstance(Browser browser){
        if(Objects.nonNull(driver)) {
            throw new IllegalStateException("Already have active session. Cannot instantiate multiple Driver");
        }

        if(executeOnGrid) driver = new GridDrivermanager().getDriverInstance(browser);
        else driver = new WebDriverInstanceManager().getDriverInstance(browser);

        return driver;
    }

    public static WebDriver getDriverInstance(){
        if(Objects.isNull(driver)) {
            throw new IllegalStateException("Currently, Browser driver not instantiated please initiate driver");
        }
        return driver;
    }
}
