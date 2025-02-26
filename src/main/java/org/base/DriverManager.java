package org.base;

import org.enums.Browser;
import org.openqa.selenium.WebDriver;

public interface DriverManager {
    WebDriver getDriverInstance(Browser browser);
}