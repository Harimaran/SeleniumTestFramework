package org.base;

import org.enums.Browser;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDrivermanager implements DriverManager{
    String gridUrl = "http://localhost:4444";

    private DesiredCapabilities getDesiredCapability(Browser browser, Platform platform){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(browser.name().toLowerCase());
        desiredCapabilities.setPlatform(platform);

        return desiredCapabilities;
    }

    @Override
    public WebDriver getDriverInstance(Browser browser) {
        WebDriver driver = null;
        try{
            URL url = new URL(gridUrl);
            driver = new RemoteWebDriver(url, getDesiredCapability(browser, Platform.WINDOWS));
        } catch(MalformedURLException exception){
            exception.printStackTrace();
        }
        return driver;
    }
}
