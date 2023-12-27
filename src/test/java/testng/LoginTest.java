//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package testng;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private int priority;

    public LoginTest() {
    }

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        this.driver = DriverSingleton.getDriver();
        String url = "https://www.saucedemo.com/";
        this.driver.get(url);
    }

    @AfterClass
    public void finish() {
        DriverSingleton.delay(3L);
        DriverSingleton.closerObjectInstance();
    }

    @Test(
            priority = 1
    )
    public void testValidationLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(loginPage.getTxtProduct(), "Product");
    }

    @Test(
            priority = 2
    )
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("Adminn", "admin1234");
        Assert.assertTrue(loginPage.getTxtInvalidLogin().contains("Invalid"));
    }
}
