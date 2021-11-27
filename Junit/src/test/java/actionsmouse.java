import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsmouse
{
    public static WebDriver driver;
    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;

    String computersExpectedTitle = "nopCommerce demo store. Computers";
    String computersActualTitle;

    String DesktopspageExpectedTile = "nopCommerce demo store. Desktops";
    String DesktopspageActualTitle;

    WebDriverWait wait;

    @BeforeAll
     public static void setUp() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    @Test

       public void actionsmouse()
    {
        WebElement computers =  driver.findElement(By.linkText("Computers"));
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(computers));


        //computersActualTitle = driver.getTitle();
       // Assertions.assertEquals(computersExpectedTitle,computersActualTitle);
        Actions action = new Actions(driver);
        action.moveToElement(computers).perform();



          //computersPageActualTitle = driver.getTitle();
         // Assertions.assertEquals(computerspageExpectedTitle,computersPageActualTitle);

          driver.findElement(By.linkText("Desktops")).click();

         DesktopspageActualTitle = driver.getTitle();
         Assertions.assertEquals(DesktopspageExpectedTile,DesktopspageActualTitle);
    }
    @AfterAll
    public static void tearDown()
    {
      // driver.quit();
    }
}
