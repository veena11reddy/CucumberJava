package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
    WebDriver driver;
    //locators
    @FindBy(linkText="Log in") public  WebElement loginLink;
    @FindBy(id="Email") public WebElement emailTextBox;
    @FindBy(id="Password") public WebElement passwordTextBox;
    @FindBy(className="login-button") public WebElement loginButton;



    //Constructor
    public Loginpage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //Actions
    public void clickloginLink()
    {
        loginLink.click();
    }
    public void enteremailText(String email)
    {
        emailTextBox.sendKeys(email);
    }

    public void passwordTextBox(String password)
    {
        passwordTextBox.sendKeys(password);
    }

    public void clickloginButton()
    {
        loginButton.click();
    }


}
