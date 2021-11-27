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

public class Searchbuttonalter1
{

    public static WebDriver driver;

    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;

    String SearchbuttonExpectedTile = "Search";
    String SearchbuttonnActualtitle;


    WebDriverWait wait;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void searchbuttonalert1()
    {
        SearchbuttonnActualtitle = driver.findElement(By.className("search-box-button")).getText();
        Assertions.assertEquals(SearchbuttonExpectedTile,SearchbuttonnActualtitle);

         wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("search-box-button")));
         SearchbuttonnActualtitle = driver.switchTo().alert().getText();
        Assertions.assertEquals(SearchbuttonExpectedTile,SearchbuttonnActualtitle);
        driver.switchTo().alert().accept();

    }
    @AfterAll
    public static void tearDown()
    {
        //driver.quit();
    }
}
















