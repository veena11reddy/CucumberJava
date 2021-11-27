import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class login
{
    public static WebDriver driver;
    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;

    String loginPageExpectedTitle = "nopCommerce demo store. Login";
    String loginPageActualTitle;
    WebDriverWait wait;

    @BeforeAll
    public static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
     @Test
    public void login()
    {

        driver.findElement(By.linkText("Log in")).click();

        loginPageActualTitle = driver.getTitle();
        Assertions.assertEquals(loginPageExpectedTitle,loginPageActualTitle);


        driver.findElement(By.id("Email")).sendKeys("Rose1234@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("asdfgh");
        driver.findElement(By.className("login-button")).click();

        boolean login =  driver.findElement(By.className("login-button")).isDisplayed();
        Assertions.assertTrue(login,"Login is displayed");



    }

    @AfterAll
    public static void tearDown()
    {
        driver.quit();
    }
}


