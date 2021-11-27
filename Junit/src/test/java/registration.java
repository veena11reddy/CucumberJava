import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class registration {
    public static WebDriver driver;
    String homepageExpectedtitle = "nopCommerce demo store";
    String homepageActualtitle;

    String registerPageExpectedTitle = "nopCommerce demo store. Register";
    String registerPageActualTitle;

    String regcompleteExpectedConfMsg = "Your registration completed";
    String regcompleteActualCongMsg;


    WebDriverWait wait;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }

     @Test
    public void registration() {
        homepageActualtitle = driver.getTitle();
        Assertions.assertEquals(homepageExpectedtitle, homepageActualtitle);


        boolean registerLink = driver.findElement(By.linkText("Register")).isDisplayed();
        Assertions.assertTrue(registerLink, "Register link is displayed");

        driver.findElement(By.linkText("Register")).click();

        registerPageActualTitle = driver.getTitle();
        Assertions.assertEquals(registerPageExpectedTitle, registerPageActualTitle);


        driver.findElement(By.id("gender-female")).click();


        boolean femaleRadioBtn = driver.findElement(By.id("gender-female")).isSelected();
        Assertions.assertTrue(femaleRadioBtn, "female radio button is selected");


        driver.findElement(By.id("FirstName")).sendKeys("Rose");
        driver.findElement(By.id("LastName")).sendKeys("Mary");
        driver.findElement(By.id("Email")).sendKeys("abcdefh@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("testing");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("testing");


        driver.findElement(By.id("Newsletter")).click();
        boolean newsLetterCheckbox = driver.findElement(By.id("Newsletter")).isSelected();
        Assertions.assertFalse(newsLetterCheckbox, "Newsletter Checkbox not selected");


        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByVisibleText("1");

        boolean day1 = driver.findElement(By.xpath("(//option[@value='1'])[1]")).isSelected();
        Assertions.assertTrue(day1 ,"day 1 is selected");

         //month11Actualtext = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        // Assertions.assertEquals(month11Expectedtext,monthActualtext);

        //driver.findElement(By.linkText("//option[@value='11']}[12]")).isSelected();
        //Assertions.assertTrue(month11,"month11 is selected");
         Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.selectByVisibleText("January");

        boolean year85 = driver.findElement(By.xpath("//option[@value='1985']")).isSelected();
        Assertions.assertFalse(year85,"year1985 is selected:" + year85);

        driver.findElement(By.id("Email")).sendKeys("abcde@gmail.com");

        driver.findElement(By.id("Company")).sendKeys("MNS IT solutions");

        driver.findElement(By.id("Newsletter")).click();
        boolean newslettercheckbox = driver.findElement(By.id("Newsletter")).isSelected();
        Assertions.assertFalse(newsLetterCheckbox, "Newsletter Checkbox not selected");

        driver.findElement(By.id("Password")).sendKeys("abcdeg");

        driver.findElement(By.id("ConfirmPassword")).sendKeys("abcdeg");

        driver.findElement(By.id("register-button")).click();


        boolean registerBtn = driver.findElement(By.id("register-button")).isEnabled();
        Assertions.assertTrue(registerBtn,"registerBtn isenabled");


        driver.findElement(By.id("register-button")).click();

       // wait = new WebDriverWait(driver, 30);
        //WebElement registerConfText = driver.findElement(By.className("result"));
        //wait.until(ExpectedConditions.visibilityOf(registerConfText));


        regcompleteActualCongMsg = driver.findElement(By.className("result")).getText();
        Assertions.assertEquals(regcompleteExpectedConfMsg, regcompleteActualCongMsg);

    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
