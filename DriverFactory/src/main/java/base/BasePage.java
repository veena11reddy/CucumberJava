package base;

import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;
import utils.DriverFactory;
import utils.DriverUtils;

import java.util.Properties;

public class BasePage
{

    public static HomePage homepage;
    public static LoginPage loginpage;
    public static RegisterPage registerPage;
    public static DriverUtils driverUtils;


    public static void initPages()
    {
        homepage = new HomePage(DriverFactory.driver);
        loginpage = new LoginPage(DriverFactory.driver);
        registerPage = new RegisterPage(DriverFactory.driver);
        driverUtils = new DriverUtils();
    }



}
