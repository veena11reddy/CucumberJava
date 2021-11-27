package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.*;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BasePage
{
    public static WebDriver driver;
    public static Properties prop;

    public static final String AUTOMATE_USERNAME = "veenakannareddy_NAPbWC";
    public static final String AUTOMATE_ACCESS_KEY = "aNhzLEe9Bpm9syuoFrv4";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static HomePage homepage;
    public static LoginPage loginpage;
    public static RegisterPage registerPage;
    public static AddtocartPage addtocartPage;
    public static RegisternewuserPage registernewuserPage;

    public static void SetUp() throws MalformedURLException {
        prop = new Properties();
        try
        {
            FileInputStream fs=new FileInputStream("src/main/java/config/data.properties");
             prop.load(fs);
        }
         catch (Exception e)
         {
             e.printStackTrace();
         }
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "Monterey");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "95.0");
        caps.setCapability("os", "OS X");
        caps.setCapability("name", "browser stack test"); // test name
        caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
         driver = new RemoteWebDriver(new URL(URL), caps);
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        registernewuserPage = new RegisternewuserPage(driver);
    }


    public static void tearDown()
    {
       driver.quit();
    }

    public static void navigateTourl(String url)
    {
        driver.navigate().to(url);
    }

     public static void load()
     {
         driver.navigate().to(prop.getProperty("url"));
     }
     public static void selectByVisibleText(WebElement ele,String text)
     {
         Select select = new Select(ele);
         select.selectByVisibleText(text);

     }
     public static String getageTitle()
     {
         return driver.getTitle();
     }

}
