package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class keyboardenter
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("newsletter-email")).sendKeys("abcde@gmail.com");
        WebElement newletteremail = driver.findElement(By.id("newsletter-email"));
        Actions actions = new Actions(driver);
        actions.sendKeys(newletteremail, Keys.ENTER).build().perform();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("newsletter-result-block")));
        String message = driver.findElement(By.id("newsletter-result-block")).getText();
        System.out.println(message);
        //String thankyou = driver.findElement(By.xpath("//[contains(text(),'Thank you')]")).getText();
        //System.out.println("Thankyou");


        //driver.quit();



    }
}
