package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.CompositeAction;

public class actions
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        Actions action = new Actions(driver);
        action.moveToElement(electronics).perform();
        driver.findElement(By.linkText("Camera & photo")).click();
        String cameraandphotopagetitle = driver.getTitle();
        System.out.println("cameraandphoto page title is:" + cameraandphotopagetitle);



        //driver.quit();


    }
        }











