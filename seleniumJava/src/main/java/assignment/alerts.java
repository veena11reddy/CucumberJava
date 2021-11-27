package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("JavaScript Alerts")).click();

       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();
        String conftext = driver.findElement(By.id("result")).getText();
        System.out.println("confirmation text :" + conftext);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String conftext1 = driver.findElement(By.id("result")).getText();
        System.out.println("confirmation text :" + conftext1);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        String alerttext = driver.switchTo().alert().getText();
        System.out.println("text on alert is:" + alerttext);
        driver.switchTo().alert().sendKeys("textbox");
        driver.switchTo().alert().accept();
       String conftext2 =  driver.findElement(By.id("result")).getText();
        System.out.println("confirmation text:" + conftext2);



    }
}
