package org.base;

import org.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class DriverFactory {
    private static WebDriver webDriver;

    DriverFactory (Browser browser){
        webDriver = setDriver(browser);
    }

    private WebDriver setDriver(Browser browser) {
        return webDriver = switch (browser) {
            case EDGE -> new EdgeDriver();
            case FIREFOX -> new FirefoxDriver();
            default -> new ChromeDriver();
        };
    }

    public static WebDriver getDriverInstance(){
        if(Objects.isNull(webDriver)) {
            throw new IllegalStateException("Currently, Browser driver not instantiated please initiate driver");
        }
        return webDriver;
    }
}
