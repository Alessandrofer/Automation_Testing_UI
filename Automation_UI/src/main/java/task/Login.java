package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;

/**
 * @author Alejandro.Ozuna
 */
public class Login {
    public static void as(WebDriver driver, String user, String password){
        Enter.text(driver, LoginUI.userInput, user);
        Enter.text(driver, LoginUI.passWordInput, password);
        Click.on(driver,LoginUI.loginButton);
    }
}
