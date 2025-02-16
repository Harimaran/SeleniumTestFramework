package org.uiOperations;

import org.base.DriverFactory;
import org.enums.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {
    public static WebElement getWebElement(LocatorType locatorType, String value){
        By locator = switch(locatorType){
            case ID -> By.id(value);
            case NAME -> By.name(value);
        };

        return DriverFactory.getDriverInstance().findElement(locator);
    }
}
