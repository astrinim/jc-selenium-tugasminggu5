package testng;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProcedureExecutionTest {

    @Given("Admin enter url web HRM")
    public void admin_enter_url_web_hrm(){

    }

    @Given("Admin enter username")
    public void admin_enter_username(){
        System.out.println("Admin enter username");
    }

    //kalau misal ada step yang double,buatlah satu saja
    @And("Admin enter password")
    public void admin_enter_password(){
        System.out.println("Admin enter password");
    }

    @And("Admin click login button")
    public void admin_click_login_button(){
        System.out.println("Admin click login button");
    }

    @Then("Admin login successful redirect dashboard")
    public void admin_login_successful_redirect_dashboard(){

    }

    @Given("Admin enter url web HRM or Admin logout")
    public void admin_enter_url_web_hrm_or_admin_logout(){
        System.out.println("Admin enter url web HRM or Admin logout");
    }

    @When("Admin enter wrong username")
    public void admin_enter_wrong_username(){
        System.out.println("Admin enter wrong username");
    }

    @Then("Admin invalid login")
    public void admin_invalid_login(){

    }





}
