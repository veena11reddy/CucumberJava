package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("Nested Frames")).click();

        driver.switchTo().frame("frame-top");

        int framecount = driver.findElements(By.tagName("frame")).size();
        System.out.println("Number of frames:" + framecount);

        driver.switchTo().frame(0);

        //.switchTo().frame("frame-left");
        String left = driver.findElement(By.tagName("body")).getText();
        System.out.println(left);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);

        //.switchTo().frame("frame-middle");
        String middle = driver.findElement(By.id("content")).getText();
        System.out.println(middle);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(2);
        String right = driver.findElement(By.tagName("body")).getText();
        System.out.println(right);

       driver.switchTo().defaultContent();
       driver.switchTo().frame("frame-bottom");
       String bottom = driver.findElement(By.tagName("body")).getText();
       System.out.println(bottom);


       //driver.quit();


    }
}
