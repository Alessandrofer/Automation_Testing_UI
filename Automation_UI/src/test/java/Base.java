import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

/**
 * @author Alejandro.Ozuna
 */
public class Base {
    public WebDriver webDriver;

    @BeforeMethod
    public void basePage(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.testfaceclub.com/ejercicios/");
        webDriver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        if(webDriver!=null)
            webDriver.quit();
    }
}
