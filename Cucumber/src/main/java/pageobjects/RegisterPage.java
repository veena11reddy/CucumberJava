package pageobjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage
{
    WebDriver driver;
    //locators
    @FindBy(linkText="Register") public WebElement RegisterLink;
    @FindBy(id="FirstName-error") public WebElement Firstnameerrormsg;
    @FindBy(id="LastName-error") public WebElement Lastnameerrormsg;
    @FindBy(id="Email-error") public WebElement Emailerrormsg;
    @FindBy(id="Password-error") public WebElement Passworderrormsg;
    @FindBy(id="ConfirmPassword-error") public WebElement CnfPasswderrormsg;
    @FindBy(id="register-button") public WebElement registerBtn;

    //Constructor
    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //actions


    public void RegisterBtn()
    {
        registerBtn.click();
    }

    public String getFirstnameerrormsg()
    {
        return Firstnameerrormsg.getText();
    }
    public String getLastnameerrormsg()
    {
        return Lastnameerrormsg.getText();
    }
    public String getEmailerrormsg()
    {
        return Emailerrormsg.getText();
    }
    public String getPassworderrormsg()
    {
        return Passworderrormsg.getText();
    }
    public String getCnfPasswordmsg()
    {
        return CnfPasswderrormsg.getText();
    }

    public  String getPageTitle()
    {
        return driver.getTitle();
    }



}
