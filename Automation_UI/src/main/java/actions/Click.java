package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Alejandro.Ozuna
 */
public class Click {
    public static void on (WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }
}
