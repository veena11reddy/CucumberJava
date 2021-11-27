package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;
    //locators

    @FindBy(id="Email") public WebElement emailTextBox;
    @FindBy(id="Password") public WebElement passwordTextBox;
    @FindBy(className="login-button") public WebElement loginBtn;



    //Constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //Actions


    public void enteremailText(String em)
    {
        emailTextBox.sendKeys(em);
    }

    public void passwordTextBox(String pwd)
    {
        passwordTextBox.sendKeys(pwd);
    }

    public void clicklogin()
    {

        loginBtn.click();
    }
}


