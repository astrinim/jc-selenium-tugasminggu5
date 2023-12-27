package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // 1
    @Given("Admin enter url web SwagLabs")
    public void admin_enter_url_web_swaglabs(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Admin enter url web SwagLabs");
        // Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @When("Admin enter username")
    public void admin_enter_username(){
        loginPage.setUsername("standard_user");
        extentTest.log(LogStatus.PASS,"Admin enter username");
    }

    @And("Admin enter password")
    public void admin_enter_password(){
        loginPage.setPassword("secret_sauce");
        extentTest.log(LogStatus.PASS,"Admin enter password");
    }

    @And("Admin click login button")
    public void admin_click_login_button(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Admin click login button");
    }

    @Then("Admin login successful redirect page product")
    public void admin_login_successful_redirect_page_product(){
        Assert.assertEquals(loginPage.getTxtProduct(),"Product");
        extentTest.log(LogStatus.PASS,"Admin login successful redirect page product");

    }

    // 2
    @Given("Admin enter url web SwagLabs or Admin logout")
    public void admin_enter_url_web_swaglabs_or_admin_logout(){
        loginPage.logout();
        extentTest.log(LogStatus.PASS,"Admin enter url web SwagLabs or Admin logout");
    }

    @When("Admin enter wrong username")
    public void admin_enter_wrong_username(){
        loginPage.setUsername("Adminn");
        extentTest.log(LogStatus.PASS,"Admin enter wrong username");
    }

    @Then("Admin invalid login")
    public void admin_invalid_login(){
        Assert.assertTrue(loginPage.getTxtInvalidLogin().contains("Invalid"));
        extentTest.log(LogStatus.PASS,"Admin invalid login");
    }


}
