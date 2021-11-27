package pageobjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id="gender-male")
    WebElement maleRadioBtn;
    @FindBy(id="gender-female")
    WebElement femaleRadioBtn;
    @FindBy(id="FirstName")
    WebElement firstnameTextbox;
    @FindBy(id="LastName")
    WebElement lastnameTextbox;
    @FindBy(id="Email")
    WebElement emailTextbox;
    @FindBy(id="Password")
    WebElement passwordTextbox;
    @FindBy(id="ConfirmPassword")
    WebElement CnfpasswordTextbox;
    @FindBy(id="register-button")
    WebElement registerBtn;
    @FindBy(name="DateOfBirthDay")
    WebElement dayDropdown;
    @FindBy(name="DateOfBirthMonth")
    WebElement monthDropdown;
    @FindBy(name="DateOfBirthYear")
    WebElement yearDropdown;
    @FindBy(className="result")
    WebElement regTextmsg;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterfirstname(String fn) {
        firstnameTextbox.sendKeys(fn);
    }

    public void enterlastname(String ln) {
        lastnameTextbox.sendKeys(ln);
    }

    public void enteremail(String em) {
        emailTextbox.sendKeys(em);
    }

    public void enterpassword(String pwd) {
        passwordTextbox.sendKeys(pwd);
    }

    public void enterCnfpassword(String Cnfpwd) {
        CnfpasswordTextbox.sendKeys(Cnfpwd);
    }

    public void clickRegisterBtn() {
        registerBtn.click();
    }

    public void maleRadioBtn() {
        maleRadioBtn.click();
    }

    public void femaleRadioBtn() {
        femaleRadioBtn.click();
    }

    public void selectDay()
    {
        BasePage.driverUtils.selectByVisibleText(dayDropdown, DriverFactory.prop.getProperty("day"));
    }

    public void selectMonth()
    {
        BasePage.driverUtils.selectByVisibleText(monthDropdown,DriverFactory.prop.getProperty("month"));
    }

    public void selectYear()
    {
        BasePage.driverUtils.selectByVisibleText(yearDropdown, DriverFactory.prop.getProperty("year"));
    }

    public String getRegistrationText() {
        return regTextmsg.getText();

    }
}
