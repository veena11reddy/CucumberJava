import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gettext
{
    public static WebDriver driver;
    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;

    //String registerPageExpectedTitle ="nopCommerce demo store. Register";
    //String registerPageActualTitle;

    String welcometextExpectedtitle = "Welcome to our store";
    String welcometextActualtitle;

    WebDriverWait wait;


    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
         @Test
         public void gettext()
         {
        //driver.findElement(By.linkText("Register")).click();

      // registerPageActualTitle = driver.getTitle();
        //Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle);
        welcometextActualtitle = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
        Assertions.assertEquals(welcometextExpectedtitle,welcometextActualtitle);

    }
    @AfterAll
    public static void tearDown()
    {
        driver.quit();
    }
}

