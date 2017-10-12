package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//import static pages.RegisterPage.myemail;

public class LoginPage {


    @FindBy(how=How.LINK_TEXT, using="Login")
    public static WebElement lnkLogin;

    @FindBy(how=How.ID, using="username")
    public static WebElement txtUserName;

    @FindBy(how=How.ID, using="password")
    public static WebElement txtpassword;

    @FindBy(how=How.ID, using="doLogin")
    public static WebElement login_button;

    @FindBy(how=How.LINK_TEXT, using="Logout")
    public static WebElement logout_button;

    public void click_signin(){lnkLogin.click();}

    public void type_username(String username){
        txtUserName.sendKeys(username);
    }

    public void type_password(String password){
        txtpassword.sendKeys(password);
    }
    public void click_loginOutBtn(){
        logout_button.click();
    }

    public void click_loginBtn(){
        login_button.click();
    }

    public void Login(){
        lnkLogin.click();
        txtUserName.sendKeys("admin");
        txtpassword.sendKeys("password");
        login_button.click();
    }

}
