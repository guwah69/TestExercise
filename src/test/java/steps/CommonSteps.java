package steps;

import helper.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CommonSteps extends testBase{


    @Before
    public void setup() throws IOException{
        initialize();
    }

    @Given("^I am on the Homepage$")
    public void i_am_on_the_Homepage() throws Throwable {
        driver.get(CONFIG.getProperty("testSiteName"));
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @Given("^I see a logo banner$")
    public void i_see_a_logo_banner() throws Throwable {
        System.out.println("I see Logo");
    }

    @Given("^I click sigin button$")
    public void i_click_sigin_button() throws Throwable {
        LoginPage signinpage = PageFactory.initElements(driver, LoginPage.class);
        signinpage.click_signin();

    }


}
