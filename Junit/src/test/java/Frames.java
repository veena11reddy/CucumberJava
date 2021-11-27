import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames
{
    public static WebDriver driver;
    String homePageExpectedTitle = "http://the-internet.herokuapp.com/";
    String homePageActualTitle;

    String FramesExpectedpageTitle = "Frames";
    String FramesActualpageTitle;

    String NestedFramesExpectedpageTitle = "Nested Frames";
    String NestedFramesActualpageTitle;

    WebDriverWait wait;

    @BeforeAll
    public static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }
     @Test
     public void frames ()
     {
         driver.findElement(By.linkText("Frames")).click();
         FramesActualpageTitle = driver.getTitle();
         Assertions.assertEquals(FramesExpectedpageTitle,FramesActualpageTitle);

         driver.findElement(By.linkText("Nested Frames")).click();
         NestedFramesActualpageTitle = driver.getTitle();
         Assertions.assertEquals(NestedFramesExpectedpageTitle,NestedFramesActualpageTitle);

         driver.switchTo().frame("frame-top");

         int framecount = driver.findElements(By.tagName("frame")).size();
         System.out.println("Number of frames:" + framecount);

         driver.switchTo().frame(0);

         //.switchTo().frame("frame-left");
         String left = driver.findElement(By.tagName("body")).getText();
         NestedFramesActualpageTitle = driver.getTitle();
         Assertions.assertEquals(NestedFramesExpectedpageTitle,NestedFramesActualpageTitle);

         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame-top");
         driver.switchTo().frame(1);

         //.switchTo().frame("frame-middle");
         String middle = driver.findElement(By.id("content")).getText();
         NestedFramesActualpageTitle = driver.getTitle();
         Assertions.assertEquals(NestedFramesExpectedpageTitle,NestedFramesActualpageTitle);

         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame-top");
         driver.switchTo().frame(2);
         String right = driver.findElement(By.tagName("body")).getText();
         NestedFramesActualpageTitle = driver.getTitle();
         Assertions.assertEquals(NestedFramesExpectedpageTitle,NestedFramesActualpageTitle);

         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame-bottom");
         String bottom = driver.findElement(By.tagName("body")).getText();
         NestedFramesActualpageTitle = driver.getTitle();
         Assertions.assertEquals(NestedFramesExpectedpageTitle,NestedFramesActualpageTitle);


     }
     @AfterAll
     public static void tearDown()
     {
         //driver.quit();
     }

}
