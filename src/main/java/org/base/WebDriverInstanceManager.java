package org.base;

import org.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInstanceManager implements DriverManager{

    @Override
    public WebDriver getDriverInstance(Browser browser) {
        return switch (browser) {
            case EDGE -> new EdgeDriver();
            case FIREFOX -> new FirefoxDriver();
            default -> new ChromeDriver();
        };
    }
}