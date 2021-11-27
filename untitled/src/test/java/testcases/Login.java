package testcases;

import base.Basepage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.Loginpage;

public class Login extends Basepage
{
    @Test

    public void login()
    {
        loginpage.clickloginLink();
        loginpage.enteremailText(prop.getProperty("email"));
        loginpage.passwordTextBox(prop.getProperty("password"));
        loginpage.clickloginButton();
    }


    }










