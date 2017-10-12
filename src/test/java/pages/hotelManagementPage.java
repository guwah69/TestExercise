package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class hotelManagementPage {

    @FindBy(how = How.ID, using = "hotelName")
    public WebElement txtHotelName;

    @FindBy(how = How.ID, using = "address")
    public WebElement txtAddress;

    @FindBy(how = How.ID, using = "owner")
    public WebElement txtOwner;

    @FindBy(how = How.ID, using = "phone")
    public WebElement txtPhoneNumber;

    @FindBy(how = How.ID, using = "email")
    public WebElement txtEmail;

    @FindBy(how = How.ID, using = "createHotel")
    public WebElement btnCreate;

    @FindBy(how = How.CSS, using = ".hotelDelete:nth-of-type(1)")
    public WebElement btnDelete;

    public void enterHotelName(String hotelName) {
        txtHotelName.sendKeys(hotelName);
    }

    public void enterAddress(String address) {
        txtAddress.sendKeys(address);
    }

    public void enterOwner(String owner) {
        txtOwner.sendKeys(owner);
    }

    public void enterPhoneNo(String phoneNo) {
        txtPhoneNumber.sendKeys(phoneNo);
    }

    public void enterEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void clickCreateBtn() throws InterruptedException {
        Thread.sleep(1000);
        btnCreate.click();
    }

    public void DeleteEntry() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            btnDelete.click();
            Thread.sleep(2000);

        }
    }

}

