package org.uiOperations;

import org.base.DriverFactory;
import org.enums.LocatorType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UiOperations {

    public static boolean type(LocatorType locatorType, String elementPath, String valueToEnter){
        WebElement element = Locators.getWebElement(locatorType, elementPath);
        element.sendKeys(valueToEnter);
        return true;
    }

    public static boolean clickElement(LocatorType locatorType, String elementPath){
        Locators.getWebElement(locatorType, elementPath).click();
        return true;
    }

    public static boolean pressEnterOnKey(LocatorType locatorType, String elementPath, Keys key){
        Actions actions = new Actions(DriverFactory.getDriverInstance());
        actions.moveToElement(Locators.getWebElement(locatorType, elementPath)).sendKeys(key).build();
        return true;
    }

    public static boolean rightClickElement(LocatorType locatorType, String elementPath){
        Actions actions = new Actions(DriverFactory.getDriverInstance());
        actions.moveToElement(Locators.getWebElement(locatorType, elementPath)).contextClick().build();
        return true;
    }
}

