package steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import helper.testBase;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.hotelManagementPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class HotelManagementSteps extends testBase {

    @Before
    public void setup() throws IOException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        initialize();

    }

    @And("^I enter \"([^\"]*)\" in the hotel name field$")
    public void iEnterHotelNameInTheHotelNameField(String hotelname) throws Throwable {
        hotelManagementPage hotelPage = PageFactory.initElements(driver, hotelManagementPage.class);
        hotelPage.enterHotelName(hotelname);
    }

    @And("^I enter  \"([^\"]*)\" in the address field$")
    public void iEnterInTheAddressField(String address) throws Throwable {
        hotelManagementPage hotelPage = PageFactory.initElements(driver, hotelManagementPage.class);
        hotelPage.enterAddress(address);
    }

    @And("^I enter \"([^\"]*)\" in the owners field$")
    public void iEnterInTheOwnersField(String owner) throws Throwable {
        hotelManagementPage hotelPage = PageFactory.initElements(driver, hotelManagementPage.class);
        hotelPage.enterOwner(owner);
    }

    @And("^I enter \"([^\"]*)\" in the phone number field$")
    public void iEnterInThePhoneNumberField(String phoneNumber) throws Throwable {
        hotelManagementPage hotelPage = PageFactory.initElements(driver, hotelManagementPage.class);
        hotelPage.enterPhoneNo(phoneNumber);
    }

    @And("^I enter \"([^\"]*)\" in the email field$")
    public void iEnterInTeEmailField(String email) throws Throwable {
        hotelManagementPage hotelPage = PageFactory.initElements(driver, hotelManagementPage.class);
        hotelPage.enterEmail(email);
    }

    @And("^I click create button$")
    public void iClickCreateButton() throws Throwable {
        hotelManagementPage hotelPage = PageFactory.initElements(driver, hotelManagementPage.class);
        hotelPage.clickCreateBtn();
    }

    @And("^click should be able to delete multiple entrie$")
    public void clickShouldBeAbleToDeleteMultipleEntrie() throws Throwable {
        hotelManagementPage hotelPage = PageFactory.initElements(driver, hotelManagementPage.class);
        hotelPage.DeleteEntry();
    }
}

