package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.Addtocartpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Basepage {
    public static WebDriver driver;
    public static Homepage homepage;
    public static Loginpage loginpage;
    public static Addtocartpage addtocart;
    public static Properties prop;
    public static Properties OR;


    @BeforeAll
    public static void setUp() throws IOException {
        prop =new Properties();
        OR = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
            prop.load(fs);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try {
            FileInputStream fs1 = new FileInputStream("src/main/java/config/or.properties");
            prop.load(fs1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        addtocart = new Addtocartpage(driver);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();

    }
}
