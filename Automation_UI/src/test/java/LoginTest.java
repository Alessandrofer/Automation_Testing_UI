import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.AddEmployee;
import task.IsEmployeePageDisplayed;
import task.Login;

/**
 * @author Alejandro.Ozuna
 */
public class LoginTest extends Base {


    @Test
    public void testLogin(){
        Login.as(webDriver,"admin","admin123");
        Assert.assertTrue(IsEmployeePageDisplayed.form(webDriver));
        AddEmployee.as(webDriver, "Alejandro", "estoesunaprueba@gmail.com","cbba","123456789");
    }
}
