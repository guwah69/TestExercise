package steps;

import helper.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

import java.io.IOException;
import static org.junit.Assert.assertTrue;

public class Login extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @When("^I enter email \"([^\"]*)\" details$")
    public void i_enter_email_details(String email) throws Throwable {
        LoginPage signinpage = PageFactory.initElements(driver, LoginPage.class);
        signinpage.type_username(email);
    }

    @When("^I enter password \"([^\"]*)\" details$")
    public void i_enter_password_details(String password) throws Throwable {
        LoginPage signinpage = PageFactory.initElements(driver, LoginPage.class);
        signinpage.type_password(password);
    }

    @Then("^I verify that I am logged in$")
    public void i_verify_that_I_am_logged_in() throws Throwable {
        assertTrue(driver.getTitle().contains("Hotel Management Platform"));
    }

    @When("^I click Signin button$")
    public void i_click_Signin_button() throws Throwable {
        LoginPage signinpage = PageFactory.initElements(driver, LoginPage.class);
        signinpage.click_loginBtn();
    }

    @When("^I log out successfully$")
    public boolean i_log_out_successfully() throws Throwable {
        LoginPage signinpage = PageFactory.initElements(driver, LoginPage.class);
        signinpage.click_loginOutBtn();
        Thread.sleep(3000);
        return signinpage.lnkLogin.isDisplayed();
//
    }

    @When("^I log in to the platform$")
    public void iLogInToThePlatform() throws Throwable {
        LoginPage signinpage = PageFactory.initElements(driver, LoginPage.class);
        signinpage.Login();

    }
}
